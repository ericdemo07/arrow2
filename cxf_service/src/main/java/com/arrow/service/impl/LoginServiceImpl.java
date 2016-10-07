package com.arrow.service.impl;

import com.arrow.controller.LoginController;
import com.arrow.helpers.LoginHelpers;
import com.arrow.model.LoginRequestServiceModel;
import com.arrow.service.ILoginService;
import org.springframework.stereotype.Service;

/**
 * Created by ayush.shukla on 10/6/2016.
 */

@Service("loginservice")
public class LoginServiceImpl implements ILoginService {
    public String loginService(LoginRequestServiceModel loginRequestServiceModel) {
        String response = LoginController.checkUserLogin(LoginHelpers.authenticateUser(loginRequestServiceModel));
        return response;
    }
}
