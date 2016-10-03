package com.arrow.model;

import java.math.BigDecimal;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class ProductResponseModel {
    private int id;
    private String type;
    private String brand;
    private String model;
    private String serial;
    private BigDecimal price;


    public ProductResponseModel() {
    }

    public ProductResponseModel(Integer id, String type, String brand, String model, String serial, BigDecimal price) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.serial = serial;
        this.price = price;
    }

    public int getId() {
        return id;
    }


    public String getType() {
        return type;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public String getSerial() {
        return serial;
    }

    public BigDecimal getPrice() {
        return price;
    }

/* public ProductResponseModel getSearchQueryResponseModel() {
        ProductResponseModel searchQueryResponseModel = new ProductResponseModel();
        searchQueryResponseModel.id = this.id;
        searchQueryResponseModel.type = this.type;
        searchQueryResponseModel.brand = this.brand;
        searchQueryResponseModel.brand = this.brand;
        searchQueryResponseModel.serial = this.serial;
        return searchQueryResponseModel;
    }*/


}
