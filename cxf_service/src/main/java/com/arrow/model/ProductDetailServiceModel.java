package com.arrow.model;

/**
 * Created by ayush.shukla on 10/10/2016.
 */
public class ProductDetailServiceModel {
    private String supplier;
    private String invoiceNumber;
    private String orderId;
    private String dateOfPurchase;
    private String supplierAddress;
    private String eCommerceSupplier;

    public String getSupplier() {
        return supplier;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public String geteCommerceSupplier() {
        return eCommerceSupplier;
    }
}
