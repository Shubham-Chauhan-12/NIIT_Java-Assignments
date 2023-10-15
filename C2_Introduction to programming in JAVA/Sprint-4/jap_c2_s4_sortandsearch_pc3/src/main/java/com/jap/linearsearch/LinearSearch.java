package com.jap.linearsearch;



public class LinearSearch {
    // Calculates total number of comparisons made while searching a number in an array
    // using linear search algorithm
    static int totalComparisons = 0;

    //This function returns the name of the city that is at a given distance from Zurich.
    //If the city is not found a message is returned instead of the name of the city

    public String findCity(int[] distances,String[] cities, int distanceToSearch)
    {
		
		for(int i=0;i<distances.length;i++)
		{
			totalComparisons++;
			if(distances[i]==distanceToSearch)
			{
				totalComparisons++;
				return cities[i];
			}
		
		}
       return "not found";
    }
    public String[] findCityAtDistanceGreaterThan270(int[] distances,String[] cities, int distanceToSearch)
    {
		int c=0;
		for(int i=0;i<distances.length;i++)
		{
			totalComparisons++;
			if(distances[i]>270)
			{
				c++;
			}
		
		}

		String[] cityDistanceGreater = new String[c];

		for(int i=0;i<distances.length;i++)
		{
			totalComparisons++;
			if(distances[i]>270)
			{
				cityDistanceGreater[c-1]=cities[i];
				c++;
			}
		}
        return cityDistanceGreater; //new String[]{""};/
    }
    public static void main(String[] args) {
        LinearSearch linearSearch = new LinearSearch();
        // Declare the array for cities
        String[] citiesFromZurich = null;
        //Declare the array with distance from Zurich
        int[] distanceFromZurich = null;
        // call the method 'findCity'
		linearSearch.findCity(distanceFromZurich, citiesFromZurich, 52);
        // print the city name that is equal to the distanceToSearch
		for(String i:citiesFromZurich)
		{
			System.out.print(i+" ");
		}
        // print the number of comparisons within the array until the city is found
		System.out.print("Total Comparisons is "+totalComparisons);
        // call the method 'findCityAtDistanceGreaterThan270'
		linearSearch.findCityAtDistanceGreaterThan270(distanceFromZurich, citiesFromZurich, 0);
        // print all cities that are greater than 270 kms away from Zurich
		for (String i:citiesFromZurich)
		{
			System.out.print(i+" ");
		}
    }
}