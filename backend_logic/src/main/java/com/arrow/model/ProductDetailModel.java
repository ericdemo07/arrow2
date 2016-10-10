package com.arrow.model;

/**
 * Created by ayush.shukla on 10/10/2016.
 */
public class ProductDetailModel {
    private String supplier;
    private String invoiceNumber;
    private String orderId;
    private String dateOfPurchase;
    private String supplierAddress;
    private String eCommerceSupplier;

    public ProductDetailModel(String supplier, String invoiceNumber, String orderId, String dateOfPurchase, String supplierAddress, String eCommerceSupplier) {
        this.supplier = supplier;
        this.invoiceNumber = invoiceNumber;
        this.orderId = orderId;
        this.dateOfPurchase = dateOfPurchase;
        this.supplierAddress = supplierAddress;
        this.eCommerceSupplier = eCommerceSupplier;
    }

}


