package com.arrow.model;

/**
 * Created by ayush.shukla on 9/26/2016.
 */
public class SearchQueryResponseModel {
    private int id;
    private String image;
    private String description;
    private String review;

    public SearchQueryResponseModel() {
    }

/*
    public SearchQueryResponseModel(int id, String image, String description, String review) {
        this.id = id;
        this.image = image;
        this.description = description;
        this.review = review;
    }
*/

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

 /*   public SearchQueryResponseModel getSearchQueryResponseModel() {
        SearchQueryResponseModel searchQueryResponseModel = new SearchQueryResponseModel();
        searchQueryResponseModel.id = this.id;
        searchQueryResponseModel.image = this.image;
        searchQueryResponseModel.description = this.description;
        searchQueryResponseModel.review = this.review;

        return searchQueryResponseModel;
    }*/
}
