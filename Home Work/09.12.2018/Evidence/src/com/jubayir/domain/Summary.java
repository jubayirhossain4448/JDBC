
package com.jubayir.domain;

public class Summary {
    private int id;
    private String name;
    private String code;
    private int tQty;
    private int availQty;
    private int soldQty;
    Purchase purchase;

    public Summary() {
    }

    public Summary(int id, String name, String code, int tQty, int availQty, int soldQty, Purchase purchase) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.tQty = tQty;
        this.availQty = availQty;
        this.soldQty = soldQty;
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

    public int gettQty() {
        return tQty;
    }

    public void settQty(int tQty) {
        this.tQty = tQty;
    }

    public int getAvailQty() {
        return availQty;
    }

    public void setAvailQty(int availQty) {
        this.availQty = availQty;
    }

    public int getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(int soldQty) {
        this.soldQty = soldQty;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public String toString() {
        return "Summary{" + "id=" + id + ", name=" + name + ", code=" + code + ", tQty=" + tQty + ", availQty=" + availQty + ", soldQty=" + soldQty + ", purchase=" + purchase + '}';
    }

    
    
}
