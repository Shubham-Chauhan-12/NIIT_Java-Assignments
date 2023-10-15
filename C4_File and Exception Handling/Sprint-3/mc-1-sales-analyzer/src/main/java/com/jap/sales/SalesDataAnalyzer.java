package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SalesDataAnalyzer {


    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    public SalesRecord[] readFile(String fileName) {

        int count = 0;
        SalesRecord [] salesRecords = null;
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineCount = bufferedReader.readLine();

            while((lineCount = bufferedReader.readLine()) != null){
                count++;
            }

            salesRecords = new SalesRecord[count];

            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            lineCount = bufferedReader.readLine();
            int j = 0;

            while((lineCount = bufferedReader.readLine()) != null){

                String [] split = lineCount.split(",");
                String date = split[0];
                int customer_id = Integer.parseInt(split[1]);
                int product_category = Integer.parseInt(split[2]);
                String payment_method = split[3];
                double amount = Double.parseDouble(split[4]);
                double time_on_site = Double.parseDouble(split[5]);
                int clicks_in_site = Integer.parseInt(split[6]);

                salesRecords[j] = new SalesRecord(date,customer_id,product_category,payment_method,amount,time_on_site,clicks_in_site);
                j++;
            }



        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }
         catch (IOException e){
            e.printStackTrace();
        }


        return salesRecords;
    }


    public static void main(String[] args) {

        SalesDataAnalyzer salesDataAnalyzer = new SalesDataAnalyzer();
        String fileName="src/main/resources/purchase_details.csv";
        SalesRecord[] salesData = salesDataAnalyzer.readFile(fileName);


        for (SalesRecord i : salesData) {
            System.out.println(i);

        }

    }



}
