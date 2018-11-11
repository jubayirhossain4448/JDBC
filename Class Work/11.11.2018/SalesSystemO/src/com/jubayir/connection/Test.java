
package com.jubayir.connection;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        Connection conn = MySqlDbConnection.getConnection();
    }
    
}
