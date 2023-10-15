package com.jap.sales;

import com.jap.sales.SalesDataAnalyzer;
import com.jap.sales.SalesRecord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.assertEquals;

public class SalesDataAnalyzerTest {
    SalesDataAnalyzer salesDataAnalyzer = null;
    SalesRecord salesRecord;
    String fileName = "src/main/resources/purchase_details.csv";
    String numberFormatFile = "src/main/resources/number_format_changed.csv";
    @Before
    public void setUp(){
    salesDataAnalyzer = new SalesDataAnalyzer();
        salesRecord = new SalesRecord("20/11/18",
                37077,505,"credit", 49.53,12.0,8);
    }
    @After
    public void tearDown(){
    salesDataAnalyzer = null; salesRecord = null;
    }

    @Test(expected = NumberFormatException.class)
    public void givenWrongDataFormatThrowsNumberFormatException() {
        salesDataAnalyzer.readFile(numberFormatFile);
    }
    @Test
    public void givenSaleDetailsFileReturnTheRecordsAsObjectsOfSalesRecord() throws ParseException {
        SalesRecord expected = new SalesRecord("20/11/18",37077,505,"credit",49.53,12,8);
        SalesRecord [] output = salesDataAnalyzer.readFile(fileName);
        assertEquals("Sales record objects not returned correctly",expected.toString(),output[0].toString());

    }

}
