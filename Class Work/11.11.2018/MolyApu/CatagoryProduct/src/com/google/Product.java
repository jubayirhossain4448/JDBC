
package com.google;

import java.util.Date;
import java.util.Locale;

public class Product {
    private int id;
    private String name;
    private int quantity;
    private double unitPrice;
    private int totalPrice;
    private Date purchesDate;
    private Category catagory;

    public Product() {
    }

    public Product(int id, String name, int quantity, double unitPrice, int totalPrice, Date purchesDate, Category catagory) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchesDate = purchesDate;
        this.catagory = catagory;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public Date getPurchesDate() {
        return purchesDate;
    }

    public Category getCatagory() {
        return catagory;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPurchesDate(Date purchesDate) {
        this.purchesDate = purchesDate;
    }

    public void setCatagory(Category catagory) {
        this.catagory = catagory;
    }
    
    
}
