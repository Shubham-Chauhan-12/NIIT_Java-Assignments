package com.vehicle;

public class Car extends VehicleManufacturer implements Vehicle{
    private String ManufactureName;

    public Car(String vehicleName, String vehicleModelName, String vehicleType, String manufactureName) {
        super(vehicleName, vehicleModelName, vehicleType);
        ManufactureName = manufactureName;
    }

    @Override
    public int maxSpeed(String vehicleType) {
        int car1 = 220,car2 = 260;
        if(vehicleType.equalsIgnoreCase("Hatchback"))
        {

            return car1;
        }
        else if(vehicleType.equalsIgnoreCase("SUV"))
        {

            return car2;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation()
    {
        return "Car{" +
                "ManufactureName='" + ManufactureName + '\'' +
                ", ModelName='" + getVehicleModelName() + '\'' +
                ", Type='" + getVehicleType() + '\'' +
                '}';

    }
}