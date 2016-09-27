package com.arrow.mapper;

import com.arrow.model.SearchQueryModel;
import com.arrow.model.SearchQueryResponseModel;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by ayush.shukla on 9/26/2016.
 */

public interface SearchQueryDao {

    //@Select("SELECT * FROM product")
    public List<SearchQueryResponseModel> fetchData();
}