package com.jap.bubblesort;


public class BubbleSort {

    public int sortedDistances(int [] distances,String [] namesOfCities)
    {
		int swapDistance=0, result=0;
		String swapCity=" ";

		for(int c=0;c<distances.length;c++)
		{
			if(distances[c]<=0)
			return 0;
			break;
		}

		for(int i=0;i<distances.length;i++)
        {
            for(int j=0;j<distances.length-1;j++)
            {
				
                if(distances[j]>distances[j+1])
				{
					swapDistance=distances[j];
					distances[j]=distances[j+1];
					distances[j+1]=swapDistance;

					swapCity=namesOfCities[j];
					namesOfCities[j]=namesOfCities[j+1];
					namesOfCities[j+1]=swapCity;	
				}
				
				
            }
        }
		return 1;

        //write the logic to perform bubble sort on the distance
        //swap the namesOfCities also accordingly.
        // return 1 if the sorting is performed

        
    }

    public void printArray(int[] distances, String [] cityNames)
    {
		

		for(int i:distances)
		{
			System.out.println(i+" ");
		}

		for(String i:cityNames)
		{
			System.out.println(i+" ");
		}
        // iterate through the arrays and print the distance and cityNames

    }

    public static void main(String[] args) {
        //Declare the array with city names
        String[] citiesFromZurich = null;
        //Declare the array with distance from Zurich
        int[] distanceFromZurich = null;

        BubbleSort bubbleSort = new BubbleSort();

       // call the method 'sortedDistances' to sort the arrays based on distance
	   bubbleSort.sortedDistances(distanceFromZurich, citiesFromZurich);

       // call the method 'printArray' to print the sorted arrays
	   bubbleSort.printArray(distanceFromZurich, citiesFromZurich);
    }
}