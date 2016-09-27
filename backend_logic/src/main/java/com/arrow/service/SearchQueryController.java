package com.arrow.service;

/**
 * Created by ayush.shukla on 9/26/2016.
 */

import com.arrow.mapper.impl.SearchQueryDaoImpl;
import com.arrow.model.SearchQueryModel;
import com.arrow.model.SearchQueryResponseModel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SearchQueryController
{
    public static void main(String[] args)
    {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-config.xml");
        SearchQueryDaoImpl service = (SearchQueryDaoImpl) cxt.getBean("service");
        SearchQueryModel searchQueryModel = new SearchQueryModel(null, null, null, null, "2");
        List<SearchQueryResponseModel> searchQueryResponseModelList = service.fetchData();
        System.out.println(searchQueryResponseModelList.get(0).getSearchQueryResponseModel().getDescription());
    }
}
