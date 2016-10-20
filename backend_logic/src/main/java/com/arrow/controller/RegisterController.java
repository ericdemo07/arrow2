package com.arrow.controller;

import com.arrow.model.RegisterRequestModel1;
import com.arrow.model.RegisterRequestModel2;
import org.springframework.context.ApplicationContext;

/**
 * Created by ayush.shukla on 10/18/2016.
 */
public class RegisterController {
    static ApplicationContext cxt;

    public static String userResisterTemp(RegisterRequestModel1 registerRequestModel1) {
        return "success";
    }

    public static String checkUserShipperIdAvailability(String shopperId) {
        return "success";
    }

    public static String checkOtp(int otp) {
        return "success";
    }

    public static String userResister(RegisterRequestModel2 registerRequestModel2) {
        return "success";
    }

}
