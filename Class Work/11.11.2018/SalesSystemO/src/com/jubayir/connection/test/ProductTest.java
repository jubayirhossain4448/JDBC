
package com.jubayir.connection.test;

import com.jubayir.connection.domain.Category;
import com.jubayir.connection.domain.Product;
import com.jubayir.connection.service.ProductService;
import java.util.Date;

public class ProductTest {
    public static void main(String[] args) {
        //ProductService.createTable();
        Product product = new Product();
        product.setName("HP 2323");
        product.setQty(30);
        product.setUnitPrice(50000);
        product.setTotalPrice(150000);
        product.setPurchaseDate(new Date());
        Category category = new Category();
        category.setId(1);
        product.setCategory(category);
        ProductService.insert(product);
    }
    
}
