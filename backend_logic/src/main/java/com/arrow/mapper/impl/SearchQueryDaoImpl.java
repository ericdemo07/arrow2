package com.arrow.mapper.impl;

import com.arrow.mapper.SearchQueryDao;
import com.arrow.model.SearchQueryResponseModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class SearchQueryDaoImpl {
    @Autowired
    private SearchQueryDao mapper;

    public List<SearchQueryResponseModel> getAllProduct() {
        return mapper.getAllProduct();
    }

    public SearchQueryResponseModel getProductBySerialID(String serialID) {
        return mapper.getProductBySerialID(serialID);
    }
}
