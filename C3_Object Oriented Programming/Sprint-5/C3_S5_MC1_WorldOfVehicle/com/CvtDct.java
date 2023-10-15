package com;

public class CvtDct extends Transmission{
    String typeEngine;
    int forwardGear;
    double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;
    double fifthGearRatio;
    double sixthGearRatio;
    double seventhGearRatio;
    double eightGearRation;

    public CvtDct(String modelNo)
    {
        super(modelNo);
        switch (modelNo)
        {
            case "CVT6":
                typeEngine = "Automatic - CVT";
                forwardGear = 6;
                fifthGearRatio = 2.631;
                secondGearRatio = 1.440;
                thirdGearRatio = 1.165;
                fourthGearRatio = 0.906;
                fifthGearRatio = 0.680;
                sixthGearRatio = 0.499;
                break;

            case "DCT8":
                typeEngine = "Automatic - DCT";
                forwardGear = 8;
                fifthGearRatio = 4.714;
                secondGearRatio = 3.143;
                thirdGearRatio = 2.106;
                fourthGearRatio = 1.667;
                fifthGearRatio = 1.285;
                sixthGearRatio = 1.000;
                seventhGearRatio = 0.839;
                eightGearRation = 0.667;
                break;

            default:
                System.out.println("Enter valid model number");
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
        System.out.println("7th Gear Ratio          :       " + seventhGearRatio);
        System.out.println("8th Gear Ratio          :       " + eightGearRation);
    }
}