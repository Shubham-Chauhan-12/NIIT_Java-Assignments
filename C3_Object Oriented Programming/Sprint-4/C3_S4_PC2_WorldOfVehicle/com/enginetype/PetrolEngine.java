package com.enginetype;

public class PetrolEngine extends IcEngines{
    private String fuelType;
    private float mileage;


    public PetrolEngine(String modelNo, int displacement, double power, long rpm, int noOfCylinder, String fuelType, float mileage) {
        super(modelNo, displacement, power, rpm, noOfCylinder);
        this.fuelType = fuelType;
        this.mileage = mileage;
    }

    public void display(){
        System.out.println("Petrol Engine Details");
        System.out.println();
        System.out.println("FuelType = " + fuelType);
        System.out.println("Mileage = " + mileage);
        super.display();
    }
}
