package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

public class ElectronicListServiceTest {
    ElectronicListService electronicListService;
    List list;


    @Before
    public void setUp(){
        electronicListService = new ElectronicListService();
        list = new ArrayList();
        list.add("computer");
        list.add("Refrigerator");
        list.add("smartphone");
        list.add("printer");
       // list = Arrays.asList("computer", "Refrigerator", "smartphone", "printer");
    }

    @After
    public void tearDown(){
        electronicListService = null;
        list = null;
    }
    @Test
    public void givenUniqueNamesAsInputParameterThenReturnListWithItems() {

        final List<String> electronicsItems = electronicListService.addElectronicsItemsToList("computer,Refrigerator,smartphone,printer");
            assertEquals(list,electronicsItems);
    }
    @Test
    public void givenDuplicateNamesAsInputParameterThenReturnListWithUniqueItems() {

        final List<String> electronicsItems = electronicListService.addElectronicsItemsToList("computer,Refrigerator,smartphone,printer,Refrigerator");
        list = Arrays.asList("computer", "Refrigerator", "smartphone", "printer");
        assertEquals(list,electronicsItems);
    }
    @Test
    public void givenItemsAsInputParameterThenReturnItemIndexValue() {
        list = Arrays.asList("computer", "Refrigerator", "smartphone", "printer");
        final int itemIndex = electronicListService.searchElectronicItemInList(list,"Refrigerator");

        assertEquals(1,itemIndex);
    }


}