package com.arrow.helpers;

import com.arrow.model.ProductResponseModel;
import com.arrow.model.SearchQueryResponseModel;
import com.arrow.model.SearchQueryResponseModelList;

import java.util.List;

/**
 * Created by ayush.shukla on 9/29/2016.
 */
public class SearchQueryHelpers {
    public static SearchQueryResponseModelList getAllProducts(List<ProductResponseModel> productResponseModelList) {
        SearchQueryResponseModelList searchQueryResponseModelList = new SearchQueryResponseModelList();
        for (ProductResponseModel productResponseModel : productResponseModelList) {
            SearchQueryResponseModel searchQueryResponseModel = new SearchQueryResponseModel(productResponseModel.getId(), productResponseModel.getType(), productResponseModel.getBrand(), productResponseModel.getModel(), productResponseModel.getSerial(), productResponseModel.getPrice());
            searchQueryResponseModelList.getResponseModelList().add(searchQueryResponseModel);
        }
        return searchQueryResponseModelList;
    }

    public static SearchQueryResponseModel getProductBySerialId(ProductResponseModel productResponseModel) {
        SearchQueryResponseModel searchQueryResponseModel = new SearchQueryResponseModel(productResponseModel.getId(), productResponseModel.getType(), productResponseModel.getBrand(), productResponseModel.getModel(), productResponseModel.getSerial(), productResponseModel.getPrice());
        return searchQueryResponseModel;
    }
}
