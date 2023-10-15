package com.enginetype;

public class IcEngines extends Engines{
    public IcEngines(String modelNo, int displacement, double power, long rpm, int noOfCylinder) {
        super(modelNo, displacement, power, rpm, noOfCylinder);
    }

    @Override
    public void display() {
        super.display();

    }
}
