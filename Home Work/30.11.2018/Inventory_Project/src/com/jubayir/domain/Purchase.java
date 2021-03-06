package com.jubayir.domain;

import java.util.Date;

public class Purchase {

    private int id;
    private String productName;
    private String productCode;
    private int quantity;
    private double unitprice;
    private double totalPrice;
    private Date purchasedate;
    
    // For Foreign key
    ProductCategory productCatagory;

    public Purchase() {
    }

    public Purchase(String productName, String productCode, int quantity, double unitprice, double totalPrice, Date purchasedate, ProductCategory productCatagory) {
        this.productName = productName;
        this.productCode = productCode;
        this.quantity = quantity;
        this.unitprice = unitprice;
        this.totalPrice = totalPrice;
        this.purchasedate = purchasedate;
        this.productCatagory = productCatagory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getPurchasedate() {
        return purchasedate;
    }

    public void setPurchasedate(Date purchasedate) {
        this.purchasedate = purchasedate;
    }

    public ProductCategory getProductCatagory() {
        return productCatagory;
    }

    public void setProductCatagory(ProductCategory productCatagory) {
        this.productCatagory = productCatagory;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", productName=" + productName + ", productCode=" + productCode + ", quantity=" + quantity + ", unitprice=" + unitprice + ", totalPrice=" + totalPrice + ", purchasedate=" + purchasedate + ", productCatagory=" + productCatagory + '}';
    }

    

}
