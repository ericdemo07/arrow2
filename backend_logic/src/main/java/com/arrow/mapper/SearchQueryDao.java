package com.arrow.mapper;

import com.arrow.model.SearchQueryResponseModel;

import java.util.List;

/**
 * Created by ayush.shukla on 9/26/2016.
 */

public interface SearchQueryDao {
    //@Select("SELECT * FROM product")
    List<SearchQueryResponseModel> getAllProduct();

    SearchQueryResponseModel getProductBySerialID(String serialID);
}