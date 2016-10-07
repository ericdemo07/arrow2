package com.arrow.model;

import com.arrow.util.ArrowCommonUtils;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class ProductRequestModel {
    /**
     * getting product by selecting
     */
    private String productType;
    private String productBrand;
    private String productModel;

    /**
     * getting product by scanning
     */
    private String productBarCode;

    /**
     * s
     * getting product by entering
     */
    private String productSerialNumber;

    public ProductRequestModel() {
    }

    public ProductRequestModel(String productType, String productBrand, String productModel, String productBarCode, String productSerialNumber) {
        if (ArrowCommonUtils.nullEmptyCheck(productBarCode)) {
            this.productBarCode = productBarCode;
        } else if (ArrowCommonUtils.nullEmptyCheck(productSerialNumber)) {
            this.productSerialNumber = productSerialNumber;
        } else {
            this.productType = productType;
            this.productBrand = productBrand;
            this.productModel = productModel;
        }
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    public String getproductBarCode() {
        return productBarCode;
    }

    public void setproductBarCode(String productBarCode) {
        this.productBarCode = productBarCode;
    }

    public String getproductSerialNumber() {
        return productSerialNumber;
    }

    public void setproductSerialNumber(String productSerialNumber) {
        this.productSerialNumber = productSerialNumber;
    }

    @Override
    public String toString() {
        if (ArrowCommonUtils.nullEmptyCheck(productBarCode)) {
            return "SearchQuery{" +
                    ", productBarCode='" + productBarCode + '}';
        } else if (ArrowCommonUtils.nullEmptyCheck(productSerialNumber)) {
            return "SearchQuery{" +
                    ", productSerialNumber='" + productSerialNumber + '}';
        }
        return "SearchQuery{" +
                "productType='" + productType + '\'' +
                ", productBrand='" + productBrand + '\'' +
                ", productModel='" + productModel + '}';
    }
}
