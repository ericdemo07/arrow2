package com.arrow.helpers;

import com.arrow.model.RegisterRequestModel1;
import com.arrow.model.RegisterRequestServiceModel1;

/**
 * Created by ayush.shukla on 10/18/2016.
 */
public class RegisterHelper
{
    public static RegisterRequestModel1 userResisterTemp(RegisterRequestServiceModel1 registerRequestServiceModel1)
    {
        RegisterRequestModel1 registerRequestModel1 = new RegisterRequestModel1(registerRequestServiceModel1.getUsername(), registerRequestServiceModel1.getMailId(), registerRequestServiceModel1.getPhone(), registerRequestServiceModel1.getPassword());
        return registerRequestModel1;
    }
}
