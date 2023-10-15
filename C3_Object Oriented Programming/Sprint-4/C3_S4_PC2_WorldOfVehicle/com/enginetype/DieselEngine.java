package com.enginetype;

public class DieselEngine extends IcEngines {
    private String fuelType;
    private float mileage;

    public DieselEngine(String modelNo, int displacement, double power, long rpm, int noOfCylinder, String fueltype, float mileage) {
        super(modelNo, displacement, power, rpm, noOfCylinder);
        this.fuelType = fueltype;
        this.mileage = mileage;
    }

    @Override
    public void display() {
        System.out.println("Diesel Engine Details");
        System.out.println();
        System.out.println("FuelType = " + fuelType);
        System.out.println("Mileage = " + mileage);
        super.display();
    }
}
