package com.jubayir.test;

import com.jubayir.domain.ProductCategory;
import com.jubayir.service.ProductCategoryService;

public class CategoryTest {

    public static void main(String[] args) {
        //ProductCategoryService.createTable();
        /////////////////////////////////////
//        ProductCatagory cat = new ProductCatagory();
//        cat.setName("Man_Watch");
//        ProductCategoryService.insert(cat);
///////////////////////////////////////////////////////////////////////
//        ProductCatagory cat = new ProductCatagory();
//        cat.setName("Ladies_Watch");
//        ProductCategoryService.insert(cat);
        ProductCategory cat = new ProductCategory();
        cat.setName("Children_Watch");
        ProductCategoryService.insert(cat);
    }

}
