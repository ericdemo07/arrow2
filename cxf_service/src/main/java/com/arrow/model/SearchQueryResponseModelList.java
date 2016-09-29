package com.arrow.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ayush.shukla on 9/28/2016.
 */
public class SearchQueryResponseModelList {
    protected List<SearchQueryResponseModel> searchQueryResponseModels;

    public List<SearchQueryResponseModel> getResponseModelList() {
        if (searchQueryResponseModels == null) {
            searchQueryResponseModels = new ArrayList<SearchQueryResponseModel>();
        }
        return this.searchQueryResponseModels;
    }
}
