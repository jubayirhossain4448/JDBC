
package com.jubayir.connection.test;

import com.jubayir.connection.domain.Category;
import com.jubayir.connection.service.CategoryService;

public class CategoryTest {
    public static void main(String[] args) {
       // CategoryService.createTable();
       Category c = new Category();
       c.setName("Laptop");
       CategoryService.insert(c);
    }
    
}
