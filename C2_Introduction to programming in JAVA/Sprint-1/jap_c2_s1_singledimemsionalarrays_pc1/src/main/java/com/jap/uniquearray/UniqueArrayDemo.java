package com.jap.uniquearray;



public class UniqueArrayDemo {

    public static void main(String[] aa) {

        //declare and initialize integer Array in numberArray Variable

        int [] numberArray = null;
        UniqueArrayDemo uniqueArrayDemo = new UniqueArrayDemo();
        boolean result = uniqueArrayDemo.getUniqueArrayElement(numberArray);
        System.out.println(result);


    }


    public boolean getUniqueArrayElement(int numberArray[]){
        boolean result = false;

		for(int i:numberArray){
			
			for(int j=i+1;j<numberArray.length;j++){

				if(numberArray[i]==numberArray[j]){
					return result;
				}
			}

		}
        return result = true;
	}

}
