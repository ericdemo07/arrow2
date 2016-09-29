package com.arrow.controller;

/**
 * Created by ayush.shukla on 9/26/2016.
 */

import com.arrow.BackendInitiatorSingleton;
import com.arrow.mapper.impl.SearchQueryDaoImpl;
import com.arrow.model.ProductResponseModel;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class SearchQueryController
{
    public static List<ProductResponseModel> getAllProducts()
    {
        BackendInitiatorSingleton backendInitiatorSingleton = new BackendInitiatorSingleton();
        ApplicationContext cxt = backendInitiatorSingleton.initialize();
        SearchQueryDaoImpl searchQueryDao = (SearchQueryDaoImpl) cxt.getBean("controller");
        List<ProductResponseModel> searchQueryResponseModelList = searchQueryDao.getAllProduct();
        return searchQueryResponseModelList;
    }
}
