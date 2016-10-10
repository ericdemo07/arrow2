package com.arrow.controller;

import com.arrow.BackendInitiatorSingleton;
import com.arrow.mapper.impl.ProductDetailDaoImpl;
import com.arrow.model.ProductDetailModel;
import org.springframework.context.ApplicationContext;

/**
 * Created by ayush.shukla on 10/10/2016.
 */
public class ProductDetailController {
    static ApplicationContext cxt;

    //static Jedis jedis = JedisManager.getinstance();
    public static String addProductDetail(ProductDetailModel productDetailModel) {
        cxt = BackendInitiatorSingleton.getInstance();
        ProductDetailDaoImpl productDetailDao = (ProductDetailDaoImpl) cxt.getBean("productdetailbean");
        int a = productDetailDao.addProductDetail(productDetailModel);

        return "Success";
    }
}
