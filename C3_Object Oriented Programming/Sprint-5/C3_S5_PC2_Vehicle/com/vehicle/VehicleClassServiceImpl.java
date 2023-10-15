package com.vehicle;
import java.util.Scanner;

public class VehicleClassServiceImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 2-Wheeler Vehicle type(Sports bike or Cruiser)");
        String Vehicle = scanner.nextLine();

        System.out.println("Enter the 4-Wheeler Vehicle type(Hatchbacks or SUV)");
        String Vehicle1 = scanner.nextLine();

        if (Vehicle.equalsIgnoreCase("Cruiser"))
        {
            Bike bike=new Bike("Roadster","200cc",Vehicle,"Jawa");

            System.out.println("Maximum speed of bike is "+bike.maxSpeed(Vehicle));

            System.out.println(bike.getManufacturerInformation());

        }
        else {

            Bike bike = new Bike("R1", "1000cc", Vehicle, "YAMAHA");

            System.out.println("Maximum speed of bike is " + bike.maxSpeed(Vehicle));

            System.out.println(bike.getManufacturerInformation());
        }
        if (Vehicle1.equalsIgnoreCase("Hatchbacks")) {
            Car car = new Car("", "Altroz", Vehicle1, "Tata Motors");

            System.out.println("Maximum speed of car is " + car.maxSpeed(Vehicle1));

            System.out.println(car.getManufacturerInformation());
        }
        else {
            Car car=new Car("","Legender",Vehicle1,"Fortuner");

            System.out.println("Maximum speed of car is "+car.maxSpeed(Vehicle1));

            System.out.println(car.getManufacturerInformation());
        }
    }

}
