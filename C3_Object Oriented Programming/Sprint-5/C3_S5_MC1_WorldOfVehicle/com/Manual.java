package com;

public class Manual extends Transmission{
    String typeEngine;
    int forwardGear;
    double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;
    double fifthGearRatio;
    double sixthGearRatio;

    public Manual(String modelNo)
    {
        super(modelNo);
        typeEngine = "Manual";
        switch(modelNo)
        {
            case "MP4":
                forwardGear = 4;
                fifthGearRatio = 2.540;
                secondGearRatio = 1.920;
                thirdGearRatio = 1.510;
                fourthGearRatio = 1.000;
                break;

            case "MP5":
                forwardGear = 5;
                fifthGearRatio = 3.545;
                secondGearRatio = 1.904;
                thirdGearRatio = 1.280;
                fourthGearRatio = 0.914;
                fifthGearRatio = 0.757;
                break;

            case "MP6":
                forwardGear = 6;
                fifthGearRatio = 3.010;
                secondGearRatio = 2.070;
                thirdGearRatio = 1.430;
                fourthGearRatio = 1.000;
                fifthGearRatio = 0.710;
                sixthGearRatio = 0.570;
                break;

            case "MD5":
                forwardGear = 5;
                fifthGearRatio = 3.545;
                secondGearRatio = 1.904;
                thirdGearRatio = 1.233;
                fourthGearRatio = 0.911;
                fifthGearRatio = 0.725;
                break;

            case "MD6":
                forwardGear = 6;
                fifthGearRatio = 3.640;
                secondGearRatio = 2.150;
                thirdGearRatio = 1.360;
                fourthGearRatio = 1.000;
                fifthGearRatio = 0.750;
                sixthGearRatio = 0.630;
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
        System.out.println("6th Gear Ratio          :       " + sixthGearRatio);
    }
}
