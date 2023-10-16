package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SalesDataAnalyzer {
    public List<SalesRecord> readFile(String fileName)  {
        List<SalesRecord> list = null;
        try {
            list = new ArrayList<>();

            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data = bufferedReader.readLine();
            int count =0;
            while ((data = bufferedReader.readLine()) != null) {

                String[] arr = data.split(",");
                String date = arr[0];
                int customer_id = Integer.parseInt(arr[1]);
                int product_category = Integer.parseInt(arr[2]);
                String payment_method = arr[3];
                double amount = Double.parseDouble(arr[4]);
                double time_on_site = Double.parseDouble(arr[5]);
                int clicks_in_site = Integer.parseInt(arr[6]);

                SalesRecord salesRecord = new SalesRecord(date, customer_id, product_category, payment_method, amount, time_on_site, clicks_in_site);
                //  salesRecord.setAmount(Double.parseDouble(arr[4]));
                count++;
                list.add(salesRecord);


            }
            //System.out.println(count);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            System.out.println(e);}

        return list;
    }

    public List<SalesRecord> getAllCustomersSortedByPurchaseAmount(List<SalesRecord> salesData){
        Comparator<SalesRecord> comparator = (t1,t2) -> Double.compare(t2.getAmount(), t1.getAmount());
        Collections.sort(salesData,comparator);


        return salesData;
    }
    public SalesRecord getTopCustomerWhoSpentMaxTimeOnSite(List<SalesRecord> salesData){
        salesData.sort((s1,s2) -> (int) (s2.getTime_on_site() - s1.getTime_on_site()));
        SalesRecord result = salesData.get(0);
        return result;
    }


    public static void main(String[] args) {
        SalesDataAnalyzer salesDataAnalyzer =  new SalesDataAnalyzer();

        List<SalesRecord> read =salesDataAnalyzer.readFile("src/main/resources/purchase_details.csv") ;
        List<SalesRecord>  a = salesDataAnalyzer.getAllCustomersSortedByPurchaseAmount(read);

        for (SalesRecord t : a){
            System.out.println(t);
        }
        System.out.println("----------------------------------------MAX-SPENT TIME------------------------------------------------");
        System.out.println(salesDataAnalyzer.getTopCustomerWhoSpentMaxTimeOnSite(read));


    }




}
