package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SalesDataAnalyzer {
    // Read the data from the file and store in a List
    public List<SalesRecord> readFile(String fileName) {

        List<SalesRecord> list = new ArrayList<>();
        SalesRecord[] salesRecords = null;
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            int countLines = 0;
            while ((bufferedReader.readLine()) != null){
                countLines++;
            }
            salesRecords = new SalesRecord[countLines];
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line = null;
            int i = 0;
            while((line = bufferedReader.readLine()) != null){

                // for (int i = 0; i < countLines; i++) {
                String[] split = line.split(",");
                salesRecords[i] = new SalesRecord();
                // date,customer_id,category,payment_method,value,time_,clicks_in_site
                salesRecords[i].setDate(split[0]);
                salesRecords[i].setCustomer_id(Integer.parseInt(split[1]));
                salesRecords[i].setProduct_category(Integer.parseInt(split[2]));
                salesRecords[i].setPayment_method(split[3]);
                salesRecords[i].setAmount(Double.parseDouble(split[4]));
                salesRecords[i].setTime_on_site(Double.parseDouble(split[5]));
                salesRecords[i].setClicks_in_site(Integer.parseInt(split[6]));
                list.add(salesRecords[i]);
                i++;
                // }
            }

        }catch (FileNotFoundException e){
            System.out.println("e = " + e);
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("e = " + e);
            e.printStackTrace();
        }



        return list;
    }

    // Sort the customers based on purchase amount
    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData, AmountComparator amountComparator){

        Collections.sort(salesData,amountComparator);
        return salesData;
    }

    // Find the top customer who spent the maximum time on the site
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData,TimeOnSiteComparator timeOnSiteComparator){

        Collections.sort(salesData,timeOnSiteComparator);

        SalesRecord customer = salesData.get(0);
        return customer;
    }



}
