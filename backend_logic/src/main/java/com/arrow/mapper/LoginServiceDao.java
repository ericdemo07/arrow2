package com.arrow.mapper;

import com.arrow.model.LoginRequestModel;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public interface LoginServiceDao {
    String checkUserAuthorization(LoginRequestModel loginRequestModel);
}
