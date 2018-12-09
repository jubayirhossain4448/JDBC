package com.jubayir.test;

import com.jubayir.domain.Purchase;
import com.jubayir.domain.Summary;
import com.jubayir.service.SummaryService;
import java.util.Date;

public class SummaryTest {

    public static void main(String[] args) {
        //SummaryService.createTable();
        
        Purchase purchase = new Purchase();
        purchase.setId(1);
        Summary summary = new Summary("Titan", "Titan 300", 50, 0, 50, new Date(), purchase);
        SummaryService.insert(summary);
    }

}
