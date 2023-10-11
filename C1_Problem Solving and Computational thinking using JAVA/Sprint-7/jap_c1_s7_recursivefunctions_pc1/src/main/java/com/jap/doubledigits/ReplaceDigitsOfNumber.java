package com.jap.doubledigits;

public class ReplaceDigitsOfNumber {
    public static void main(String[] args) {
        ReplaceDigitsOfNumber replaceDigitsOfNumber = new ReplaceDigitsOfNumber();
        // Make calls to the function to test both positive and negative integers
        System.out.println(replaceDigitsOfNumber.doubleDigits(-290));
        System.out.println(replaceDigitsOfNumber.doubleDigits(348));
    }

    // Function accepts a number and returns integer by replacing every digit of number with two of that digit.
    public long doubleDigits(long number) {
		long result;
		if (number==0)
		{
			return 0;
		}    
		else
		{
			long digit = number%10;
			long doubled = (digit*10)+digit;
			long remain = number/10;
			return doubled+100*doubleDigits(remain);
			/* return doubleDigits(remain);*/	
		}
		
		
		
    }
	
}