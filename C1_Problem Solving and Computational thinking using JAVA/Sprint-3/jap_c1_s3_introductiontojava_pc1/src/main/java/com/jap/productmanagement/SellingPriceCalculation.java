package com.jap.productmanagement;

import java.util.Scanner;

public class SellingPriceCalculation {

/*Participants are expected to run the main method and give input, that will be read by
  scanner .
  Avoid making any changes in main method*/

  public static void main(String[] args) {
    SellingPriceCalculation sellingPriceCalculation = new SellingPriceCalculation();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Item name");
    String productName = scanner.nextLine();
    System.out.println("Enter Selling Price");
    float wholeSalePrice = scanner.nextFloat();
    float retailPrice =  sellingPriceCalculation.revisedSellingPriceCalculator(productName , wholeSalePrice);
    System.out.println("Revised Selling Price for  " + productName + " is $" + retailPrice );
  }



  // Function accepts product name and selling price of item as input
  // parameters and outputs revised selling price of the item.



  public float revisedSellingPriceCalculator(String productName, float sellingPrice) {
	  float retailPrice = (sellingPrice) + (sellingPrice * 0.05f);
       return retailPrice;
  }

}
