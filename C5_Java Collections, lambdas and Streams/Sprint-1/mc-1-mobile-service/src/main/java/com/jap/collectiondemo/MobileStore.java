package com.jap.collectiondemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobileStore {


    private List<Mobile> allMobiles;
    private String record = "";
    private String splitBy = ",";
    public MobileStore()
    {
        allMobiles = new ArrayList<>();
    }



    //Write logic to read the fileName that is "mobile.csv"
    //read all the lines one by one
    //Create Mobile class object and store data from file in the respective attributes of Mobile class
    // ex - Store brandName - Samsung in  mobile.setBrandName(brandName);
    //add mobile object in the List object and return the List
    //handle all the exceptions
    public List<Mobile> readMobileData(String fileName)
    {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        allMobiles = new ArrayList<>();
        Mobile[] mobiles = null;
        try{
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            bufferedReader.readLine();
            String line = null;
            int count =0;
            while ((line = bufferedReader.readLine()) != null){
                count++;
            }
            fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            mobiles = new Mobile[count];
            bufferedReader.readLine();
            String readLine;
            int i = 0;
            while((readLine = bufferedReader.readLine()) != null){

                // for (int i = 0; i < mobiles.length ; i++) {
                String[] split = readLine.split(",");
                mobiles[i] = new Mobile();
                //Brand Name,Model Name,Cost($),Size,Battery,Storage space,Camera pixelsMP
                mobiles[i].setBrandName(split[0]);
                mobiles[i].setModelName(split[1]);
                mobiles[i].setCost(Double.parseDouble((split[2])));
                mobiles[i].setScreenSize(split[3]);
                mobiles[i].setBatteryLife(split[4]);
                mobiles[i].setStorageSpace(split[5]);
                mobiles[i].setCameraPixels(Integer.parseInt(split[6]));
                allMobiles.add(i,mobiles[i]);
                i++;
                // }

            }

        } catch (IOException | NullPointerException e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        }

        return allMobiles;
    }

    //Iterate the List created in the above method and retrieve the bandName
    //Return the List with specific Mobile having brandName coming from method parameter
    public List<Mobile> findPhoneByBrand(String brandName)
    {
        List<Mobile> mobilesByBrand = new ArrayList<>();
        Iterator<Mobile> iterator = allMobiles.iterator();

        while(iterator.hasNext()){
            Mobile element =  iterator.next();
            if(element.getBrandName().equals(brandName)){

                mobilesByBrand.add(element);
            }

        }


        return mobilesByBrand;
    }

    //Iterate through the List created in the first method
    //Return the List of Mobile whose cost is more than $500
    public List<Mobile> findPhoneCostMoreThan$500()
    {
        List<Mobile> mobilesMoreThan500 = new ArrayList<>();
        Iterator<Mobile> iterator = allMobiles.iterator();

        while (iterator.hasNext()){
            Mobile element = iterator.next();
            if(element.getCost() > 500){
                mobilesMoreThan500.add(element);
            }
        }

        return mobilesMoreThan500;
    }

    //Iterate through the List created in the first method
    //Return the List of Mobile whose Pixel is more than 12MP
    public List<Mobile> findPhonePixelMoreThan12MP()
    {
        List<Mobile> mobilesMoreThan12MP = new ArrayList<>();
        Iterator<Mobile> iterator = allMobiles.iterator();
        while (iterator.hasNext()){
            Mobile element = iterator.next();
            if(element.getCameraPixels() > 12){
                mobilesMoreThan12MP.add(element);
            }
        }

        return mobilesMoreThan12MP;
    }


}
