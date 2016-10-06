package com.arrow.mapper.impl;

import com.arrow.mapper.LoginServiceDao;
import com.arrow.model.LoginRequestModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class LoginServiceDaoImpl implements LoginServiceDao {
    @Autowired
    LoginServiceDao mapper;

    @Override
    public String checkUserAuthorization(LoginRequestModel loginRequestModel) {
        return mapper.checkUserAuthorization(loginRequestModel);
    }
}
