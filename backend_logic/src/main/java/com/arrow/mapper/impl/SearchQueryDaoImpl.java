package com.arrow.mapper.impl;

import com.arrow.mapper.SearchQueryDao;
import com.arrow.model.ProductResponseModel;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class SearchQueryDaoImpl {
    @Autowired
    private SearchQueryDao searchQuerymapper;

    public List<ProductResponseModel> getAllProduct() {
        return searchQuerymapper.getAllProduct();
    }

    public ProductResponseModel getProductBySerialID(String serialID) {
        return searchQuerymapper.getProductBySerialID(serialID);
    }
}
