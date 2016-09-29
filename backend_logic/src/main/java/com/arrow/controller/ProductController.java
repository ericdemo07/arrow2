package com.arrow.controller;

import com.arrow.mapper.impl.SearchQueryDaoImpl;
import com.arrow.model.ProductResponseModel;

import java.util.List;

/**
 * Created by ayush.shukla on 9/28/2016.
 */
public class ProductController
{
    public List<ProductResponseModel> getAllProduct(SearchQueryDaoImpl searchQueryDao)
    {
        List<ProductResponseModel> searchQueryResponseModelList = searchQueryDao.getAllProduct();
        return searchQueryResponseModelList;
    }
}
