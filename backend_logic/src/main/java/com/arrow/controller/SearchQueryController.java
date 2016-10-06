package com.arrow.controller;

/**
 * Backend Controller for search query controller also holds bootstrap service
 * Created by ayush.shukla on 9/26/2016.
 */

import com.arrow.internal.JedisManager;
import com.arrow.model.ProductResponseModel;
import org.codehaus.jackson.map.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;

public class SearchQueryController {
    static Jedis jedis = JedisManager.getinstance();

    public static List<ProductResponseModel> getAllProducts() {
        List<ProductResponseModel> searchQueryResponseModelList = new ArrayList<>();
        for (String s : jedis.keys("Serial:*")) {
            ObjectMapper mapper = new ObjectMapper();
            ProductResponseModel productResponseModel = mapper.convertValue(jedis.hgetAll(s), ProductResponseModel.class);
            searchQueryResponseModelList.add(productResponseModel);
        }
        return searchQueryResponseModelList;
    }

    public static ProductResponseModel getProductBySerialID(String serialID) {
        ObjectMapper mapper = new ObjectMapper();
        ProductResponseModel searchQueryResponseModel = mapper.convertValue(jedis.hgetAll("Serial:" + serialID), ProductResponseModel.class);
        return searchQueryResponseModel;
    }
}
