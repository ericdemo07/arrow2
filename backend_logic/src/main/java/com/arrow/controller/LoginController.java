package com.arrow.controller;

import com.arrow.BackendInitiatorSingleton;
import com.arrow.internal.JedisManager;
import com.arrow.mapper.impl.LoginServiceDaoImpl;
import com.arrow.model.LoginRequestModel;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.springframework.context.ApplicationContext;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class LoginController {
    static ApplicationContext cxt;
    static Jedis jedis = JedisManager.getinstance();

    public static String checkUserLogin(LoginRequestModel loginRequestModel) {
        if (!jedis.exists("Session:" + loginRequestModel.getUsername())) {
            //LoginRequestModel loginRequestModel = new LoginRequestModel("ericdemo07", "DOOM");
            cxt = BackendInitiatorSingleton.getInstance();
            LoginServiceDaoImpl loginServiceDaoImpl = (LoginServiceDaoImpl) cxt.getBean("controller");
            String role = loginServiceDaoImpl.checkUserAuthorization(loginRequestModel);
            if (role != null) {
                //TODO: string to be saved as integer
                //TODO: to be created a seperate server for token generation in future
                //TODO: can be used JWT
                Map<String, String> endUserSessionObject = new HashMap<>();
                endUserSessionObject.put("role", role);
                DateTime sessionEndTime = new DateTime(DateTimeZone.UTC).plusHours(2);
                endUserSessionObject.put("logouttime", sessionEndTime.toString());
                jedis.hmset("Session:" + loginRequestModel.getUsername(), endUserSessionObject);
                return "login success";
            } else {
                return "user [" + loginRequestModel.getUsername() + "] does not exist";
            }
        } else {
            return "user is already loggedIn";
        }
    }
}
