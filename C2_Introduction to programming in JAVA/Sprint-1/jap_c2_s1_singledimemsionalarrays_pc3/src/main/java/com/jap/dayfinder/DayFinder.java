package com.jap.dayfinder;

public class DayFinder {
//The current day of week is taken in int (For Sunday 1, Monday 2, Tuesday 3....Saturday 7)
    public String predictDay(int currentDay, int noOfDaysFromToday)
    {  if(noOfDaysFromToday<0)
    {  
		noOfDaysFromToday= -(noOfDaysFromToday);
	}
        
        int number=(currentDay+(noOfDaysFromToday))%7;
        String day="";
        switch(number){
            case 1: day= "Sunday";
            break;
            case 2: day= "Monday";
            break;
            case 3: day= "Tuesday";
            break;
            case 4: day= "Wednesday";
            break;
            case 5: day= "Thursday";
            break;
            case 6: day= "Friday";
            break;
            case 7: day= "Saturday";
            break;
        }
    
       return day;
     
    }

    public static void main(String[] args){
        DayFinder dayFinder = new DayFinder();
        // Accept input of medicine taken day and the next dose to be taken in how many days
        int medicineTakenOn = 0;
        int daysToNextDose = 0;

        // call the method to predict the day the next dose must be taken
        String nextDoseToBeTakenOn = dayFinder.predictDay(medicineTakenOn,daysToNextDose);
        // display the day
        System.out.println("Your next dose should be taken on :  "+nextDoseToBeTakenOn);
    }

}