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
public class Test {

    public static void main(String[] args) {
//        Category c=new Category();
//        c.setId(3);
//        c.setName("Computer");
//        UtilsCaAndPro.insertCategory(c);

        Product p = new Product();
     
        p.setName("Core i7");
        p.setQuantity(2);
        p.setUnitPrice(32000);
        p.setTotalPrice(64000);
        p.setParchaseDate(new Date());
        Category c=new Category();
        c.setId(2);
        p.setCategory(c);
        
        UtilsCaAndPro.insertProduct(p);

    }

}
