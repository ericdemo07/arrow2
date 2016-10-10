package com.arrow.service.impl;

import com.arrow.controller.ProductDetailController;
import com.arrow.helpers.ProductDetailHelper;
import com.arrow.model.ProductDetailServiceModel;
import com.arrow.service.IProductDetailService;
import org.springframework.stereotype.Service;

/**
 * Created by ayush.shukla on 10/10/2016.
 */

@Service("productdetail")
public class ProductDetailServiceImpl implements IProductDetailService {

    @Override
    public String addProductDetail(ProductDetailServiceModel productDeatilServiceModel) {
        String response = ProductDetailController.addProductDetail(ProductDetailHelper.addProductDetail(productDeatilServiceModel));
        return null;
    }
}
