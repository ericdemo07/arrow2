package com.arrow.mapper.impl;

import com.arrow.mapper.ProductDetailDao;
import com.arrow.model.ProductDetailModel;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ayush.shukla on 10/10/2016.
 */
public class ProductDetailDaoImpl implements ProductDetailDao {
    @Autowired
    ProductDetailDao mapper;

    @Override
    public int addProductDetail(ProductDetailModel productDetailModel) {
        return mapper.addProductDetail(productDetailModel);
    }
}
