package com.enginetype;

public class CngEngine extends IcEngines{
    private float speed;

    public CngEngine(String modelNo, int displacement, double power, long rpm, int noOfCylinder, float speed) {
        super(modelNo, displacement, power, rpm, noOfCylinder);
        this.speed = speed;
    }

    @Override
    public void display() {
        System.out.println("CNG engine Details");
        System.out.println();
        System.out.println("Speed = " + speed);
        super.display();
    }
}

