package com.arrow.model;

/**
 * Created by ayush.shukla on 10/10/2016.
 */
public class ProductDetailModel {
    private String shopperId;
    private String serial;
    private String supplier;
    private String invoiceNumber;
    private String orderId;
    private String dateOfPurchase;
    private String supplierAddress;
    private String eCommerceSupplier;

    public ProductDetailModel(String shopperId, String serial, String supplier, String invoiceNumber, String orderId, String dateOfPurchase, String supplierAddress, String eCommerceSupplier) {
        this.shopperId = shopperId;
        this.serial = serial;
        this.supplier = supplier;
        this.invoiceNumber = invoiceNumber;
        this.orderId = orderId;
        this.dateOfPurchase = dateOfPurchase;
        this.supplierAddress = supplierAddress;
        this.eCommerceSupplier = eCommerceSupplier;
    }

    public String getShopperId() {
        return shopperId;
    }

    public void setShopperId(String shopperId) {
        this.shopperId = shopperId;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String geteCommerceSupplier() {
        return eCommerceSupplier;
    }

    public void seteCommerceSupplier(String eCommerceSupplier) {
        this.eCommerceSupplier = eCommerceSupplier;
    }
}


