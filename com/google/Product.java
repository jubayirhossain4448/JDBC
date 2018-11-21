/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google;

import java.util.Date;



/**
 *
 * @author User
 */
public class Product {
    private int id;
    private String name;
    private int quantity;
    private double unitPrice;
    private double totalPrice;
    private Date parchaseDate;
    private Category category;

    public Product() {
    }

    public Product(int id, String name, int quantity, double unitPrice, double totalPrice, Date parchaseDate, Category category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.parchaseDate = parchaseDate;
        this.category = category;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public Date getParchaseDate() {
        return parchaseDate;
    }

    public void setParchaseDate(Date parchaseDate) {
        this.parchaseDate = parchaseDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    
}