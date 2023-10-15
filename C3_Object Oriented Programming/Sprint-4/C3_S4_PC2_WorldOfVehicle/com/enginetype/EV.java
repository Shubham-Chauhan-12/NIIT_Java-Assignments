package com.enginetype;

public class EV extends Engines{
    private int voltage;
    private long batteryCapacity;

    public EV(String modelNo, int displacement, double power, long rpm, int noOfCylinder, int voltage, long batteryCapacity) {
        super(modelNo, displacement, power, rpm, noOfCylinder);
        this.voltage = voltage;
        this.batteryCapacity = batteryCapacity;
    }

    public void display()
    {
        System.out.println("Ev engine Details");
        System.out.println();
        System.out.println("Voltage = " + voltage);
        System.out.println("BatteryCapacity = " + batteryCapacity);
        super.display();
    }
}
