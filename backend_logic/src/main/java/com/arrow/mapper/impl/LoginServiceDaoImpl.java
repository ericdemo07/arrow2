package com.arrow.mapper.impl;

import com.arrow.mapper.LoginServiceDao;
import com.arrow.model.LoginRequestModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class LoginServiceDaoImpl implements LoginServiceDao {
    @Autowired
    LoginServiceDao loginServiceMapper;

    @Override
    public List<String> checkUserAuthorization(LoginRequestModel loginRequestModel) {
        return loginServiceMapper.checkUserAuthorization(loginRequestModel);
    }
}
