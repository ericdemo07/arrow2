package com.arrow.mapper;

import com.arrow.model.ProductResponseModel;

import java.util.List;

/**
 * Created by ayush.shukla on 9/26/2016.
 */

public interface SearchQueryDao
{
    List<ProductResponseModel> getAllProduct();
    ProductResponseModel getProductBySerialID(String serialID);
}