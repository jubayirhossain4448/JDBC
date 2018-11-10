package com.jubayir.test;

import com.jubayir.jdbc.CreateTableUsingMysql;
import com.jubayir.jdbc.InsertIntoTable;

public class Test {

    public static void main(String[] args) {
        //CreateTableUsingMysql.createTable();
        //InsertIntoTable.insertData();
        /*InsertIntoTable.insertData2(2, "Khulna");
        InsertIntoTable.insertData2(3, "Rajshahi");
        InsertIntoTable.insertData2(4, "Barishal");
        InsertIntoTable.insertData2(5, "Sylhet");
        InsertIntoTable.insertData2(6, "Chittagong");
         */
        // InsertIntoTable.updateData(2, "Rangpur");
        // InsertIntoTable.deleteData();
        
        InsertIntoTable.getDataById(3);
    }

}
