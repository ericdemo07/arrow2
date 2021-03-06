package com.arrow.service.impl;

import com.arrow.controller.SearchQueryController;
import com.arrow.helpers.SearchQueryHelpers;
import com.arrow.model.SearchQueryResponseModel;
import com.arrow.model.SearchQueryResponseModelList;
import com.arrow.service.IProductService;
import org.springframework.stereotype.Service;

/**
 * Created by ayush.shukla on 9/27/2016.
 */

@Service("productservice")
public class ProductServiceImpl implements IProductService {
    public SearchQueryResponseModelList getAllProducts() {
        SearchQueryResponseModelList searchQueryResponseModelList = SearchQueryHelpers.getAllProducts(SearchQueryController.getAllProducts());
        return searchQueryResponseModelList;
    }

    public SearchQueryResponseModel getProductBySerialId(String serialId) {
        SearchQueryResponseModel searchQueryResponseModel = SearchQueryHelpers.getProductBySerialId(SearchQueryController.getProductBySerialID(serialId));
        return searchQueryResponseModel;
    }
}
