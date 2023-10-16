package com.jap.collectiondemo;




import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class MobileStoreTest {

     MobileStore mobileStore;



    @Test
    public void givenInputSamsumgShouldReturnAllSamsungMobile()
    {
        mobileStore = new MobileStore();
        mobileStore.readMobileData("mobile.csv");
        List brand = mobileStore.findPhoneByBrand("Samsung");
        assertEquals(4,brand.size());

    }
    @Test
    public void givenInputAppleShouldReturnAllAppleMobile()
    {
        mobileStore = new MobileStore();
        mobileStore.readMobileData("mobile.csv");
        List brand = mobileStore.findPhoneByBrand("Apple");
        assertEquals(3,brand.size());

    }
    @Test
    public void givenInputCostMoreThan500ShouldReturnMobile()
    {
        mobileStore = new MobileStore();
        mobileStore.readMobileData("mobile.csv");
        List brand = mobileStore.findPhoneCostMoreThan$500();
        assertEquals(3,brand.size());

    }
    @Test
    public void givenInputPixelMoreThan12ShouldReturnMobile()
    {
        mobileStore = new MobileStore();
        mobileStore.readMobileData("mobile.csv");
        List brand = mobileStore.findPhonePixelMoreThan12MP();
        assertEquals(5,brand.size());

    }




}