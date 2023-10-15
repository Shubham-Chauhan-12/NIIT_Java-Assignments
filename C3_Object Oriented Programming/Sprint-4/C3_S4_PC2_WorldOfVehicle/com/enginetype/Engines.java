package com.enginetype;

public class Engines {
    private String modelNo;
    private int displacement;
    private double power;
    private long rpm;
    private int NoOfCylinder;

    public Engines(String modelNo, int displacement, double power, long rpm, int noOfCylinder) {
        this.modelNo = modelNo;
        this.displacement = displacement;
        this.power = power;
        this.rpm = rpm;
        NoOfCylinder = noOfCylinder;
    }

    public void display()
    {

        System.out.println("ModelNo = " + modelNo);
        System.out.println("Displacement = " + displacement);
        System.out.println("Power = " + power);
        System.out.println("Rpm = " + rpm);
        System.out.println("NoOfCylinder = " + NoOfCylinder);
        System.out.println("--------------------------------------------------------");

    }
}
