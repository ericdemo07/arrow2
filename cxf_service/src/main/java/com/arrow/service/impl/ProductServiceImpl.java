package com.arrow.service.impl;

import com.arrow.helpers.SearchQueryHelpers;
import com.arrow.controller.SearchQueryController;
import com.arrow.model.ProductResponseModel;
import com.arrow.model.SearchQueryResponseModel;
import com.arrow.model.SearchQueryResponseModelList;
import com.arrow.service.IProductService;
import org.springframework.stereotype.Service;

import javax.ws.rs.PathParam;
import java.util.List;

/**
 * Created by ayush.shukla on 9/27/2016.
 */

@Service("productservice")
public class ProductServiceImpl implements IProductService
{
    public SearchQueryResponseModelList getAllProducts()
    {
        SearchQueryResponseModelList searchQueryResponseModelList = SearchQueryHelpers.productResponseHelpers(SearchQueryController.getAllProducts());
        return searchQueryResponseModelList;
    }

    public ProductResponseModel getProductBySerialId(@PathParam("serial") int serialId)
    {
        ProductResponseModel searchQueryResponseModel = new ProductResponseModel(serialId, "P", "Q", "R", "S");
        return searchQueryResponseModel;
    }
}
