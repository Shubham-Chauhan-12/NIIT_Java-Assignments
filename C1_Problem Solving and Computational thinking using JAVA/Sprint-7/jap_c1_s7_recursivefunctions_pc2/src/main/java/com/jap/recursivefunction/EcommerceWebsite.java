package com.jap.recursivefunction;

import java.util.Scanner;
public class EcommerceWebsite {
   public static int countTags(int items, int tags)
    {int count = 0;
    if(items==tags)
    {
        return 1;
    }
    else if(items<tags)
    {
        return 0;
    }
    else {
        return (count+1) + countTags(items-10,tags);
        
    }
    }
    public static int countTotalItemsPurchasedIncludingFreeItem(int amount,int priceOfEachItem, int tags)
    {
        int extraitem = countTags((amount/ priceOfEachItem),tags);

        return amount/ priceOfEachItem + extraitem;

    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);// total money to be spent
        System.out.println("Enter the amount");
        int amount= sc.nextInt();
        System.out.println("Enter the priceOfEachItem"); //  cost of each item
        int priceOfEachItem= sc.nextInt();
       System.out.println("Enter the tags"); // no of tags exchanged for one free item.
      int tags= sc.nextInt();
        System.out.println("The total number of items (purchased + free items) : "+countTotalItemsPurchasedIncludingFreeItem(amount , priceOfEachItem, tags));
    }


}