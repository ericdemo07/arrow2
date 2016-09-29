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
    static ApplicationContext cxt;

    public static void bootstrap()
    {
        BackendInitiatorSingleton backendInitiatorSingleton = new BackendInitiatorSingleton();
        cxt = backendInitiatorSingleton.initialize();
        System.out.println("CX : "+cxt);
    }

    public static List<ProductResponseModel> getAllProducts()
    {
        System.out.println("CXT : "+cxt);
        SearchQueryDaoImpl searchQueryDao = (SearchQueryDaoImpl) cxt.getBean("controller");
        List<ProductResponseModel> searchQueryResponseModelList = searchQueryDao.getAllProduct();
        return searchQueryResponseModelList;
    }

    public static ProductResponseModel getProductBySerialID(String serialID)
    {
        SearchQueryDaoImpl searchQueryDao = (SearchQueryDaoImpl) cxt.getBean("controller");
        ProductResponseModel searchQueryResponseModel = searchQueryDao.getProductBySerialID(serialID);
        return searchQueryResponseModel;
    }
}
