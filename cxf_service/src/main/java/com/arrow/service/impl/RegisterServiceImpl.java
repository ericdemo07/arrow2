package com.arrow.service.impl;

import com.arrow.controller.RegisterController;
import com.arrow.helpers.RegisterHelper;
import com.arrow.model.RegisterRequestServiceModel1;
import com.arrow.model.RegisterRequestServiceModel2;
import com.arrow.service.IRegisterService;
import org.springframework.stereotype.Service;

import javax.ws.rs.PathParam;

/**
 * Created by ayush.shukla on 10/18/2016.
 */

@Service("registerservice")
public class RegisterServiceImpl implements IRegisterService {
    @Override
    public String registerService1(RegisterRequestServiceModel1 resisterRequestServiceModel1) {
        String response = RegisterController.userResisterTemp(RegisterHelper.userResisterTemp(resisterRequestServiceModel1));
        return response;
    }

    @Override
    public String registerOtpService(@PathParam("otp") String otp)
    {
        return null;
    }

    @Override
    public String registerShopperIdService(@PathParam("shopperId") String shopperId) {
        return null;
    }

    @Override
    public String registerService2(RegisterRequestServiceModel2 resisterRequestServiceModel2) {
        return null;
    }
}
