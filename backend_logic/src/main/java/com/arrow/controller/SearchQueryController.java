package com.arrow.controller;

/**
 * Backend Controller for search query controller also holds bootstrap service
 * Created by ayush.shukla on 9/26/2016.
 */

import com.arrow.BackendInitiatorSingleton;
import com.arrow.internal.JedisManager;
import com.arrow.internal.currencyratemanager.RefreshCurrency;
import com.arrow.mapper.impl.SearchQueryDaoImpl;
import com.arrow.model.ProductResponseModel;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.ApplicationContext;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchQueryController {
    static ApplicationContext cxt;
    static JedisManager jedisManager;
    static Jedis jedis;
    //for backend_logic test
    //public static void main(String... args) {
    //    SearchQueryController.bootstrap();
    //}

    public static void bootstrap() {
        BackendInitiatorSingleton backendInitiatorSingleton = new BackendInitiatorSingleton();
        RefreshCurrency.refresh();
        cxt = backendInitiatorSingleton.initialize();
        jedis = jedisManager.getinstance();
        System.out.println("Server is running: " + jedis.ping());
        Map<String, String> searchQueryResponseModelListAsMap = new HashMap<String, String>();
        SearchQueryDaoImpl searchQueryDao = (SearchQueryDaoImpl) cxt.getBean("controller");
        List<ProductResponseModel> searchQueryResponseModelList = searchQueryDao.getAllProduct();
        for (ProductResponseModel productResponseModel : searchQueryResponseModelList) {
            searchQueryResponseModelListAsMap.put("id", String.valueOf(productResponseModel.getId()));
            searchQueryResponseModelListAsMap.put("type", productResponseModel.getType());
            searchQueryResponseModelListAsMap.put("brand", productResponseModel.getBrand());
            searchQueryResponseModelListAsMap.put("model", productResponseModel.getModel());
            searchQueryResponseModelListAsMap.put("serial", productResponseModel.getSerial());

            jedis.hmset("Serial:" + productResponseModel.getSerial(), searchQueryResponseModelListAsMap);
        }
    }

    public static List<ProductResponseModel> getAllProducts() {
        //SearchQueryDaoImpl searchQueryDao = (SearchQueryDaoImpl) cxt.getBean("controller");
        List<ProductResponseModel> searchQueryResponseModelList = new ArrayList<>();
        for (String s : jedis.keys("Serial:*")) {
            ObjectMapper mapper = new ObjectMapper();
                ProductResponseModel productResponseModel = mapper.convertValue(jedis.hgetAll(s), ProductResponseModel.class);
            searchQueryResponseModelList.add(productResponseModel);
        }
        return searchQueryResponseModelList;
    }

    public static ProductResponseModel getProductBySerialID(String serialID) {
        //SearchQueryDaoImpl searchQueryDao = (SearchQueryDaoImpl) cxt.getBean("controller");
        ObjectMapper mapper = new ObjectMapper();
        ProductResponseModel searchQueryResponseModel = mapper.convertValue(jedis.hgetAll("User:" + serialID), ProductResponseModel.class);
        return searchQueryResponseModel;
    }
}
