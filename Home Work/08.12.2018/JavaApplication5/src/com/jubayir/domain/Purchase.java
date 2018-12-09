package com.jubayir.domain;

public class Purchase {

    private int id;
    private String productName;
    private String productCode;
    private int qty;
    private double unitPrice;
    private double totalPrice;

    public Purchase() {
    }

    public Purchase(int id, String productName, String productCode, int qty, double unitPrice, double totalPrice) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Purchase{" + "id=" + id + ", productName=" + productName + ", productCode=" + productCode + ", qty=" + qty + ", unitPrice=" + unitPrice + ", totalPrice=" + totalPrice + '}';
    }
    
    

}
