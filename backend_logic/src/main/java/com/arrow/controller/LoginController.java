package com.arrow.controller;

import com.arrow.BackendInitiatorSingleton;
import com.arrow.internal.JedisManager;
import com.arrow.mapper.impl.LoginServiceDaoImpl;
import com.arrow.model.LoginRequestModel;
import com.arrow.util.ArrowCommonUtils;
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
            cxt = BackendInitiatorSingleton.getInstance();
            LoginServiceDaoImpl loginServiceDaoImpl = (LoginServiceDaoImpl) cxt.getBean("loginbean");
            String listOfRolesAsString = ArrowCommonUtils.collectionAsString(loginServiceDaoImpl.checkUserAuthorization(loginRequestModel));
            if (ArrowCommonUtils.nullEmptyCheck(listOfRolesAsString)) {
                Map<String, String> endUserSessionObject = new HashMap<>();
                System.out.println("Role : " + listOfRolesAsString);
                endUserSessionObject.put("role", listOfRolesAsString);
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

    public static void main(String... args) {
        System.out.println(LoginController.checkUserLogin(new LoginRequestModel("ayush.abcds", "DOOM")));
    }
}
