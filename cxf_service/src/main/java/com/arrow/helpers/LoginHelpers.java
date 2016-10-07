package com.arrow.helpers;

import com.arrow.model.LoginRequestModel;
import com.arrow.model.LoginRequestServiceModel;

/**
 * Created by ayush.shukla on 10/7/2016.
 */
public class LoginHelpers {
    public static LoginRequestModel authenticateUser(LoginRequestServiceModel loginRequestServiceModel) {
        LoginRequestModel loginRequestModel = new LoginRequestModel(loginRequestServiceModel.getUsername(), loginRequestServiceModel.getPassword());
        return loginRequestModel;
    } 
}
