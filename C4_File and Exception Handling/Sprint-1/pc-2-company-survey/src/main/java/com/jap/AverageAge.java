package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;
        double ageSum = 0;
        //double

        try{

            for (int i = 0; i < ageRawData.length; i++) {
                ageSum = ageSum + (Integer.parseInt(ageRawData[i]));
            }
            avg = ageSum/ageRawData.length;


        }catch (Exception exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }


    public static void main(String[] args) {
        AverageAge age = new AverageAge();

        System.out.println("Sum : " + age.averageAgeCalculator(new String[]{"10","30","50","65","96"}));
        System.out.println();
        System.out.println("Checking Value with String in Array - "+  '\n' + age.averageAgeCalculator(new String[]{"10","One","50","Sixty-Five","96"}));
    }

}
