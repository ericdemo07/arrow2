package com.arrow.mapper.impl;

import com.arrow.mapper.LoginServiceDao;
import com.arrow.mapper.RegisterServiceDao;
import com.arrow.model.RegisterRequestModel1;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ayush.shukla on 10/18/2016.
 */
public class RegisterServiceDaoImpl implements RegisterServiceDao
{
    @Autowired
    RegisterServiceDao registerServiceMapper;

    @Override
    public int userResisterTemp(RegisterRequestModel1 registerRequestModel1)
    {
        return registerServiceMapper.userResisterTemp(registerRequestModel1);
    }
}
