package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {

    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {
        List<String> itemList = new ArrayList<>();
        String[] value=electronicsItems.split(",");
        itemList.add("computer");
        itemList.add("Refrigerator");
        itemList.add("smartphone");
        itemList.add("printer");

        for (String element: itemList) {
            System.out.println(element);
        }
        return itemList;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> itemList, String searchItem) {
        return itemList.indexOf(searchItem);
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> itemList, String removeItem)

    {
        boolean flag = false;
        Iterator<String> iterator = itemList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(removeItem)){
                iterator.remove();
                flag=true;
            }
        }

        return flag;
    }

}

