package com.jubayir.domain;

public class Summary {

    private int id;
    private String productName;
    private String productCode;
    private int totalQty;
    private int availableQty;
    Purchase purchase;

    public Summary() {
    }

    public Summary(int id, String productName, String productCode, int totalQty, int availableQty, Purchase purchase) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.availableQty = availableQty;
        this.purchase = purchase;
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

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Summary{" + "id=" + id + ", productName=" + productName + ", productCode=" + productCode + ", totalQty=" + totalQty + ", availableQty=" + availableQty + ", purchase=" + purchase + '}';
    }

   
}
