package com.niit.integerswap;

import java.util.Scanner;

public class SwapIntegers {

    public static void main(String[] args) {

        SwapIntegers swapIntegers = new SwapIntegers();
        long number;
        Scanner sc= new Scanner(System.in);    // Declare a scanner object here
        System.out.println("Enter the number");//12345
            // Get the number value as integer from the console and store in variable 'number'
             number = sc.nextLong();
            long swappedNumber = swapIntegers.swapNumbers(number);
            System.out.println("Swapped Number is  : "+swappedNumber);
        }

    // Function accepts number and returns result with each pair of digits swapped.
    public long swapNumbers(long number) {
    long result=0;
    int i=0;
    while (number>0){
        long temp1= number%10;//1
        number=number/10;
        long temp2= number%10;
        number=number/10;
        if(temp2==0){
            result=result+ (long)temp1* (long)Math.pow(10,i);
            break;
         }
         result=result+ (long)temp1*(long)Math.pow(10,i+1)+temp2* (long)Math.pow(10,i);
         i=i+2;//i=2,i=4
    }
        return result;
    }
}