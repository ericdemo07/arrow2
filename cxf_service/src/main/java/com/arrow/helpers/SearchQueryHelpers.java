package com.arrow.helpers;

import com.arrow.model.ProductResponseModel;
import com.arrow.model.SearchQueryResponseModel;
import com.arrow.model.SearchQueryResponseModelList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ayush.shukla on 9/29/2016.
 */
public class SearchQueryHelpers
{
    public static SearchQueryResponseModelList productResponseHelpers(List<ProductResponseModel> productResponseModelList) {
        SearchQueryResponseModelList searchQueryResponseModelList = new SearchQueryResponseModelList();
        for (ProductResponseModel productResponseModel : productResponseModelList) {
            SearchQueryResponseModel searchQueryResponseModel = new SearchQueryResponseModel(productResponseModel.getId(), productResponseModel.getType(), productResponseModel.getBrand(), productResponseModel.getModel(), productResponseModel.getSerial());
            searchQueryResponseModelList.getResponseModelList().add(searchQueryResponseModel);
        }
        return searchQueryResponseModelList;
    }
}
