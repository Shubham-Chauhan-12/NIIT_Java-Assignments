package com.jap.replaceinteger;

public class ArrayPairSum {

    public static void main(String[] aa) {

        //Declare and initialize integer array in the variable numberArray
        int[] numberArray=null;
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
        //write forEach loop to iterate through the 'sumArray' to print the output

		for (int i:sumArray)
		{
			System.out.print(i);
		}

    }

    public int[] sumOfArrayPair(int numberArray[]){
		
		int o=0;
		if (numberArray.length%2==0)
		{
			int[] newNumberArray=new int[numberArray.length/2];

			for(int i=0;i<numberArray.length;i=i+2)
			{
				newNumberArray[o]=numberArray[i]+numberArray[i+1];
				o++;
			}
			return newNumberArray;
		}
		else
		{
			int[] newNumberArray=new int[((numberArray.length-1)/2)+1];
			for(int i=0;i<numberArray.length-2;i=i+2) // when i==numberArray.length, i will becomes zero
			{
				newNumberArray[o]=numberArray[i]+numberArray[i+1];
				o++;
			}
			newNumberArray[o]=numberArray[numberArray.length-1];
			return newNumberArray;
		}
		
        
    }

}