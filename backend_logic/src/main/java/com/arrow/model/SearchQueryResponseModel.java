package com.arrow.model;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class SearchQueryResponseModel {
    private int id;
    private String type;
    private String brand;
    private String model;
    private String serial;


    public SearchQueryResponseModel() {
    }

    public SearchQueryResponseModel(int id, String type, String brand, String model, String serial) {
        this.id = id;
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public SearchQueryResponseModel getSearchQueryResponseModel() {
        SearchQueryResponseModel searchQueryResponseModel = new SearchQueryResponseModel();
        searchQueryResponseModel.id = this.id;
        searchQueryResponseModel.type = this.type;
        searchQueryResponseModel.brand = this.brand;
        searchQueryResponseModel.brand = this.brand;
        searchQueryResponseModel.serial = this.serial;
        return searchQueryResponseModel;
    }

    @Override
    public String toString() {
        return "SearchQueryResponseModel{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", serial='" + serial + '\'' +
                '}';
    }
}
