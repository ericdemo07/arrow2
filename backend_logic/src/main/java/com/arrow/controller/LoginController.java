package com.arrow.controller;

import com.arrow.BackendInitiatorSingleton;
import com.arrow.mapper.impl.LoginServiceDaoImpl;
import com.arrow.model.LoginRequestModel;
import org.springframework.context.ApplicationContext;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class LoginController {
    static ApplicationContext cxt;

    //static Jedis jedis = JedisManager.getinstance();

    public static String checkUserLogin(LoginRequestModel loginRequestModel) {
        BackendInitiatorSingleton backendInitiatorSingleton = BackendInitiatorSingleton.getInstance();
        cxt = backendInitiatorSingleton.initialize();
        LoginServiceDaoImpl loginServiceDaoImpl = (LoginServiceDaoImpl) cxt.getBean("controller");
        String a = loginServiceDaoImpl.checkUserAuthorization(loginRequestModel);
        System.out.println(a);
        return "success";
    }

    public static void main(String... args) {
        LoginRequestModel loginRequestModel = new LoginRequestModel("ericdemo07", "DOOM");
        checkUserLogin(loginRequestModel);
        System.out.println("output");
    }
}
