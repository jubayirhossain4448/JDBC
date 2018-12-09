package com.jubayir.domain;

import java.util.Date;

public class Summary {

    private int id;
    private String productName;
    private String productCode;
    private int totalQuantity;
    private int soldQuantity;
    private int availableQuentity;
    private Date lastUpdate;
    
    // For Foreign key
    Purchase purchase;

    public Summary() {
    }

    public Summary(String productName, String productCode, int totalQuantity, int soldQuantity, int availableQuentity, Date lastUpdate, Purchase purchase) {
        this.productName = productName;
        this.productCode = productCode;
        this.totalQuantity = totalQuantity;
        this.soldQuantity = soldQuantity;
        this.availableQuentity = availableQuentity;
        this.lastUpdate = lastUpdate;
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

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public void setTotalQuantity(int totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public int getAvailableQuentity() {
        return availableQuentity;
    }

    public void setAvailableQuentity(int availableQuentity) {
        this.availableQuentity = availableQuentity;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Summary{" + "id=" + id + ", productName=" + productName + ", productCode=" + productCode + ", totalQuantity=" + totalQuantity + ", soldQuantity=" + soldQuantity + ", availableQuentity=" + availableQuentity + ", lastUpdate=" + lastUpdate + ", purchase=" + purchase + '}';
    }

   

}
