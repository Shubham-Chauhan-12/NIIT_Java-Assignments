package com.jap.areacalculator;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an option from list to calculate area of fence");
        System.out.println("1. Square area for the chickens");
        System.out.println("2. Circular area for ducks");
        System.out.println("3. Rectangular area for cows");
        System.out.println();
        // Input choice from user take input from user 
		//input the variable Name as choice 
		// put scanner class for taking the Input in the program from the user 

		int choice = scanner . nextInt();
	
        
		int choice = scanner.nextInt();

        // Make a call to calculateAreaOfFence(int choice) and pass the choice made by user to it

    }

    // Function to calculate area of fence by calling respective methods according to user's choice
    public void calculateAreaOfFence(int choice) {
		double area=0, side=0, radius=0, length=0, breadth=0, totalArea;
		AreaCalculator object=new AreaCalculator();
		switch(choice)
		{
			case 1:
				choice=1;
				totalArea = object.calculateAreaOfSquare(side);
				System.out.print("Area of square is "+ area);
				break;
			case 2:
				choice=2;
				totalArea = object.calculateAreaOfCircle(radius);
				System.out.print("Area of circle is "+ area);
				break;
			case 3:
				choice=3;
				totalArea = object.calculateAreaOfRectangle(length, breadth);
				System.out.print("Area of rectangle is "+ area);
				break;
			default:
				System.out.println("invalid choice");
		}

    }

    // Function to calculate area of square
    public double calculateAreaOfSquare(double side) {
		double area = side*side;
		
        return area;
    }

    // Function to calculate area of circle
    public double calculateAreaOfCircle(double radius) {
		double area = 3.14*radius*radius;
		
        return area;
    }

    // Function to calculate area of rectangle
    public double calculateAreaOfRectangle(double length, double breadth) {
		double area = length*breadth;
		
        return area;
    }
}