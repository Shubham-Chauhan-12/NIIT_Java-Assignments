package com.jap.looping;

import java.util.Scanner;

public class CalenderClass {

    //write code to display the calender
    public void displayCalender(){
		int year, month, firstDay, daysInMonth, day=1;
		Scanner ob=new Scanner(System.in);

        //declare variables for month, year, firstDay and daysInMonth
        //Declare Scanner object to take input

        System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec......):");
		month = ob.nextInt();
     //take input for month
        System.out.println("Enter Year:");
		year = ob.nextInt();
      //take input for year
        System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun......):");
		firstDay = ob.nextInt();
        //take input for firstDay

		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			daysInMonth = 31;
		}
		else if (month==4 || month==6 || month==9 || month==11)
		{
			daysInMonth = 30;
		}
		else if (month==2)
		{
			if((year%4==0 && year%100!=0)||(year%400==0))
			{
				daysInMonth = 29;
			}
			else
			{
				daysInMonth = 28;
			}
		}
		else
		{
			System.out.println("Incorrect Input");
			return;
		}
        //check leap year

		System.out.println("Calender for "+year+" month "+month+" is");
		System.out.println("S M Tu W Th F S");

		if(firstDay!=7)
		{
			for (int i=0;i<firstDay;i++)
			{
				System.out.print("_");
			}
		}

		while(day<=daysInMonth)
		{
			if(day<10)
			System.out.print("--");
			if ((day + firstDay)%7==0)
			{
				System.out.println(day);
			}
			else
			{
				System.out.print(day);
				System.out.print(" ");
			}
			day++;
		}


    }

    public static void main(String[] args) {
        CalenderClass calenderClass = new CalenderClass();
        calenderClass.displayCalender();

    }

}