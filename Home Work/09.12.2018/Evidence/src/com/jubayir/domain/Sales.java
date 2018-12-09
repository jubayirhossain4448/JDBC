
package com.jubayir.domain;

public class Sales {
    private int id;
    private String name;
    private String code;
    private int qty;
    private double uprice;
    private double tprice;
    
    Purchase purchase;

    public Sales() {
    }

    public Sales(int id, String name, String code, int qty, double uprice, double tprice, Purchase purchase) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.qty = qty;
        this.uprice = uprice;
        this.tprice = tprice;
        this.purchase = purchase;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUprice() {
        return uprice;
    }

    public void setUprice(double uprice) {
        this.uprice = uprice;
    }

    public double getTprice() {
        return tprice;
    }

    public void setTprice(double tprice) {
        this.tprice = tprice;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Sales{" + "id=" + id + ", name=" + name + ", code=" + code + ", qty=" + qty + ", uprice=" + uprice + ", tprice=" + tprice + ", purchase=" + purchase + '}';
    }
    
    
    
}
