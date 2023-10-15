package com.vehicle;

public class Bike extends VehicleManufacturer implements Vehicle {
    private String ManufactureName;

    public Bike(String vehicleName, String vehicleModelName, String vehicleType, String manufactureName) {
        super(vehicleName, vehicleModelName, vehicleType);
        ManufactureName = manufactureName;
    }

    @Override
    public int maxSpeed(String vehicleType) {
        int bike1 = 300, bike2 = 120;
        if (vehicleType.equalsIgnoreCase("SportsBike")) {
            return bike1;
        } else if (vehicleType.equalsIgnoreCase("Cruiser")) {
            return bike2;
        }
        return 0;
    }

    @Override
    public String getManufacturerInformation() {
        return "Bike{" +
                "ManufactureName='" + ManufactureName + '\'' +
                ", ModelName='" + getVehicleModelName() + '\'' +
                ", Type='" + getVehicleType() + '\'' +
                '}';
    }
}

