package com;

public class Amt extends Transmission{
    String typeEngine;
    int forwardGear;
    double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;
    double fifthGearRatio;

    public Amt(String modelNo)
    {
        super(modelNo);
        typeEngine = "AMT";
        switch(modelNo)
        {
            case "AMTP4":
                forwardGear = 4;
                fifthGearRatio = 2.540;
                secondGearRatio = 1.920;
                thirdGearRatio = 1.510;
                fourthGearRatio = 1.000;
                break;

            case "AMTD5":
                forwardGear = 5;
                fifthGearRatio = 2.950;
                secondGearRatio = 1.940;
                thirdGearRatio = 1.340;
                fourthGearRatio = 1.000;
                fifthGearRatio = 0.630;
                break;

            default:
                System.out.println("Enter valid model number!!!!");
                break;
        }
    }

    @Override
    public void showSpecs() {
        System.out.println("Transmission Type       :       " + typeEngine);
        System.out.println("Model Number            :       " + modelNo);
        System.out.println("Forward Gear            :       " + forwardGear);
        System.out.println("1st Gear Ratio          :       " + fifthGearRatio);
        System.out.println("2nd Gear Ratio          :       " + secondGearRatio);
        System.out.println("3rd Gear Ratio          :       " + thirdGearRatio);
        System.out.println("4th Gear Ratio          :       " + forwardGear);
        System.out.println("5th Gear Ratio          :       " + fifthGearRatio);
    }
}
