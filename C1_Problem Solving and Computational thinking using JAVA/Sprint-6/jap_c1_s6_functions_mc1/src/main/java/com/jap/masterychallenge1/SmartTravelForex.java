package com.jap.masterychallenge1;

import java.util.Scanner;

public class SmartTravelForex {
	static double JPY = 0.67;
	static double EUR = 85.37;
	static double GBP = 94.5;
	static double USD = 74.3;
	static double AED = 20.25;

    /**
     * This method converts the given amount in INR to the currency of choice
     * @param amount
     * @param choice
     * @return the exchange rate depending on choice of currency
     */
    public static double currentExchangeRates(double amount, int choice) {
			double convertedAmount = 0;
			if (amount<=0)		
       		return -1;
			else if (choice==1)
			convertedAmount += amount*JPY;
			else if (choice==2)
			convertedAmount += amount*EUR;
			else if (choice==3)
			convertedAmount += amount*GBP;
			else if (choice==4)
			convertedAmount += amount*USD;
			else if (choice==5)
			convertedAmount += amount*AED;
			return convertedAmount;   
    }

    /**
     * This method converts a given source currency to the desired target currency
     * @param sourceCurrency
     * @param targetCurrency
     * @param amountToBeConverted
     * @return converted amount from a source currency to the desired target currency
     */

    public static double convertGivenCurrencyIntoDesiredCurrency(int sourceCurrency, int targetCurrency, double amountToBeConverted) {
			double sourceValue=0, tragetValue=0, convertedAmount;
			if (sourceCurrency==1)
			sourceValue = JPY;
			else if (sourceCurrency==2)
			sourceValue = EUR;
			else if (sourceCurrency==3)
			sourceValue = GBP;
			else if (sourceCurrency==4)
			sourceValue = USD;
			else if (sourceCurrency==5)
			sourceValue = AED;

			if (targetCurrency==1)
			tragetValue=JPY;
			else if (targetCurrency==2)
			tragetValue=EUR;
			else if (targetCurrency==3)
			tragetValue=GBP;
			else if (targetCurrency==4)
			tragetValue=USD;
			else if (targetCurrency==5)
			tragetValue=AED;

			if (sourceValue==tragetValue || amountToBeConverted<=0)
           	return -1;

			else
			convertedAmount = sourceValue*amountToBeConverted/tragetValue;
			return convertedAmount;
    }

    /**
     *  This method displays the currency conversion rates in a tabular format
     *
     */
    public static void displayForexDetails() {
		System.out.println ("The exchange rate for each currency (1, 10, 20, 50, 100) in INR");
		System.out.println("1 \t 10 \t 20 \t 50 \t 100");

		System.out.println("JPY" +JPY*1+ "\t" +JPY*10+ "\t" +JPY*20+ "\t" +JPY*50+ "\t" +JPY*100);
		System.out.println("EUR" +EUR*1+ "\t" +EUR*10+ "\t" +EUR*20+ "\t" +EUR*50+ "\t" +EUR*100);
		System.out.println("GBP" +GBP*1+ "\t" +GBP*10+ "\t" +GBP*20+ "\t" +GBP*50+ "\t" +GBP*100);
		System.out.println("USD" +USD*1+ "\t" +USD*10+ "\t" +USD*20+ "\t" +USD*50+ "\t" +USD*100);
		System.out.println("AED" +AED*1+ "\t" +AED*10+ "\t" +AED*20+ "\t" +AED*50+ "\t" +AED*100);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayForexDetails();
        int source = 0;
        int target = 0;
        double amountToBeConverted = 0;
        System.out.println("Do you wish to check conversion rates today : (y/n) ");
        char choice = sc.next().charAt(0);
        if (choice == 'y') {
            System.out.println("Exchange Rate of currency can be done for \n 1. JPY \n 2. EUR \n 3. GBP \n 4. USD \n 5. AED ");
            System.out.println("Enter the source currency(Currency I have) : ");
            // Accept the source currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            source = 0;
            System.out.println("Enter the target currency(Currency I want) : ");
            // Accept the target currency 1 for JPY, 2 for EUR, 3 for GBP, 4 for USD, 5 for AED
            target = 0;
            System.out.println("Enter the amount to be converted : ");
            //Accept the amount to be converted
            amountToBeConverted = 0;
            // Display the amount converted
            System.out.println("The converted exchange rate is : " + convertGivenCurrencyIntoDesiredCurrency(source, target, amountToBeConverted));
        } else {
            System.out.println("Thanks for checking into currency convertor");
        }
    }

}