
package com.jubayir.test;

import com.jubayir.jdbcconnection.CreateTableUsingMySql;
import com.jubayir.jdbcconnection.InsertIntoTable;

public class Test {
    
    public static void main(String[] args) {
        //CreateTableUsingMySql.createTable();
       // InsertIntoTable.insertData();
      /* InsertIntoTable.insertData2(2, "Khulna");
       InsertIntoTable.insertData2(3, "Rajshahi");
       InsertIntoTable.insertData2(4, "Barishal");
       InsertIntoTable.insertData2(5, "Sylhet");
       InsertIntoTable.insertData2(6, "Chittagong");
       InsertIntoTable.insertData2(7, "Rangpur");
       InsertIntoTable.insertData2(8, "Maymansing");
       InsertIntoTable.insertData2(9, "Dinajpur"); */
      InsertIntoTable.updateData(9, "Magura");
    }
}
