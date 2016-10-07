package com.arrow.mapper;

import com.arrow.model.LoginRequestModel;

import java.util.List;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public interface LoginServiceDao {
    List<String> checkUserAuthorization(LoginRequestModel loginRequestModel);
}
