package com.jubayir.test;

import com.jubayir.domain.ProductCategory;
import com.jubayir.domain.Purchase;
import com.jubayir.service.PurchaseService;
import java.util.Date;

public class PurchaseTest {

    public static void main(String[] args) {
        // PurchaseService.createTable();
        
        ProductCategory c = new ProductCategory();
        c.setId(2);
        Purchase purchase = new Purchase("Casio", "casio_2500", 20, 2500, 50000, new Date(), c);
        PurchaseService.insert(purchase);
    }

}
