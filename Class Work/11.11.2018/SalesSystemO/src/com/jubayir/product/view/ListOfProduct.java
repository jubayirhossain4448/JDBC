
package com.jubayir.product.view;

import com.jubayir.connection.MySqlDbConnection;
import com.jubayir.connection.domain.Product;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class ListOfProduct {
    private static Connection conn = MySqlDbConnection.getConnection();
    
    public static List<Product> getProduct(){
        List<Product> list = new ArrayList<>();
        
       
    return list;
    }
    
}
