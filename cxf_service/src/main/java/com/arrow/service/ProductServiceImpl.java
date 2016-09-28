package com.arrow.service;

import org.springframework.stereotype.Service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ayush.shukla on 9/27/2016.
 */

@Service("playerService")
public class ProductServiceImpl implements IProductService {
    public SearchQueryResponseModelList getAllProducts() {
        SearchQueryResponseModelList searchQueryResponseModelList = new SearchQueryResponseModelList();

        SearchQueryResponseModel  searchQueryResponseModelOne = new SearchQueryResponseModel(1,"A","B","C","D");
        SearchQueryResponseModel  searchQueryResponseModelTwo = new SearchQueryResponseModel(2,"W","X","Y","Z");
        searchQueryResponseModelList.getResponseModelList().add(searchQueryResponseModelOne);
        searchQueryResponseModelList.getResponseModelList().add(searchQueryResponseModelTwo);

        return searchQueryResponseModelList;
    }

    public SearchQueryResponseModel getProductBySerialId(@PathParam("serial") int serialId) {

        SearchQueryResponseModel searchQueryResponseModel = new SearchQueryResponseModel(serialId,"P","Q","R","S");
        return searchQueryResponseModel;
    }
}
