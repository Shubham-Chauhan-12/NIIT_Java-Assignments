package com.jap;

import java.util.Arrays;
import java.util.Locale;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException


    public String highestScore(String []nameOfSchool , String[] scores ){
        int[] score = new int[scores.length];
        int max;

        try{
            for (int i = 0; i < scores.length; i++) {
                score[i] = Integer.parseInt(scores[i]);
            }
            int high = score[0];
            max = 0;
            for (int j = 1; j < score.length; j++) {
               if( high < score[j]) {
                  high = score[j];
                  max = j;
               }
            }
        }
        catch (NumberFormatException e){
            return e.toString();
        }


        return nameOfSchool[max];

    }


    //convert all the names in uppercase
    //Handle the NullPointerException


    public String[] convertAllNamesToCapital(String[] name){
        String[] upperCase = new String[name.length];

        try {
            for (int i = 0; i < name.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }
        }
        catch (NullPointerException e){
            System.out.println(e.toString());
        }

        return upperCase;
    }

    public static void main(String[] args) {
        QuizDemo quizDemo  = new QuizDemo();


        //from Test case
        String[] Score = {"86" , "78" , "95" ,"6" ,"44" , "33" , "82" , "77" ,"8" ,"90"};
        String[] schoolName ={"DAV","RSK","Treamis","Candor","Oak","UAV","BCGS","BCBS","Baldwin","NPS"};

        System.out.println("Highest Score School : "+quizDemo.highestScore(schoolName,Score));
        System.out.println("Upper Case Array : " + Arrays.toString(quizDemo.convertAllNamesToCapital(schoolName)));

    }
}






