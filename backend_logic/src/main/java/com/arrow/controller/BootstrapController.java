package com.arrow.controller;

import com.arrow.BackendInitiatorSingleton;
import com.arrow.InternalArrowException;
import com.arrow.internal.JedisManager;
import com.arrow.internal.currencyratemanager.RefreshCurrency;
import com.arrow.mapper.impl.SearchQueryDaoImpl;
import com.arrow.model.ProductResponseModel;
import org.springframework.context.ApplicationContext;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ayush.shukla on 10/6/2016.
 */
public class BootstrapController {
    static ApplicationContext cxt;
    static JedisManager jedisManager;
    static Jedis jedis;

    public static void bootstrap() {
        Thread refreshCurrency = new Thread() {
            public void run() {
                try {
                    RefreshCurrency.refresh();
                } catch (InternalArrowException e) {
                    e.printStackTrace();
                }
            }
        };
        refreshCurrency.start();

        //thread-2
        Thread createCache = new Thread() {
            public void run() {
                cxt = BackendInitiatorSingleton.getInstance();
                jedis = jedisManager.getinstance();
                System.out.println("Server is running: " + jedis.ping());
                Map<String, String> searchQueryResponseModelListAsMap = new HashMap<String, String>();
                SearchQueryDaoImpl searchQueryDao = (SearchQueryDaoImpl) cxt.getBean("searchquerybean");
                List<ProductResponseModel> searchQueryResponseModelList = searchQueryDao.getAllProduct();
                for (ProductResponseModel productResponseModel : searchQueryResponseModelList) {
                    searchQueryResponseModelListAsMap.put("id", String.valueOf(productResponseModel.getId()));
                    searchQueryResponseModelListAsMap.put("type", productResponseModel.getType());
                    searchQueryResponseModelListAsMap.put("brand", productResponseModel.getBrand());
                    searchQueryResponseModelListAsMap.put("model", productResponseModel.getModel());
                    searchQueryResponseModelListAsMap.put("serial", productResponseModel.getSerial());
                    searchQueryResponseModelListAsMap.put("price", productResponseModel.getPrice().toString());

                    jedis.hmset("Serial:" + productResponseModel.getSerial(), searchQueryResponseModelListAsMap);
                }
            }
        };
        createCache.start();
    }
}
