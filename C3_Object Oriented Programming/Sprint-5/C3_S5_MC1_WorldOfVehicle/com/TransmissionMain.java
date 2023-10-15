package com;

import java.util.Scanner;

public class TransmissionMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the model number (MP4 , MP5 , MP6 , MD5 , MD6 , AMTP4 , AMTD5 , CVT6 , DCT8) : ");
        String modelNo = sc.nextLine().toUpperCase();

        if (modelNo.equals("MP4") || modelNo.equals("MP5") || modelNo.equals("MP6") || modelNo.equals("MD5") || modelNo.equals("MD6"))
        {
            Manual mnObj = new Manual(modelNo);
            mnObj.showSpecs();
        } else if (modelNo.equals("AMTP4") || modelNo.equals("AMTD5"))
        {
            Amt amtObj = new Amt(modelNo);
            amtObj.showSpecs();
        } else if (modelNo.equals("CVT6") || modelNo.equals("DCT8"))
        {
            CvtDct cvtdctObj = new CvtDct(modelNo);
            cvtdctObj.showSpecs();
        } else
        {
            System.out.println("Invalid Model Number!!!!");
        }
    }
}
