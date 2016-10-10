package com.arrow.helpers;

import com.arrow.model.ProductDetailModel;
import com.arrow.model.ProductDetailServiceModel;

/**
 * Created by ayush.shukla on 10/10/2016.
 */
public class ProductDetailHelper {

    public static ProductDetailModel addProductDetail(ProductDetailServiceModel productDeatilServiceModel) {
        ProductDetailModel productDetailModel = new ProductDetailModel(productDeatilServiceModel.getSupplier(), productDeatilServiceModel.getInvoiceNumber(), productDeatilServiceModel.getOrderId(), productDeatilServiceModel.getDateOfPurchase(), productDeatilServiceModel.getSupplierAddress(), productDeatilServiceModel.geteCommerceSupplier());
        return productDetailModel;
    }
}
