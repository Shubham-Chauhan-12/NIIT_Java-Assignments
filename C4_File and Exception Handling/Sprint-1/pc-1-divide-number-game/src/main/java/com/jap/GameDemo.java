package com.jap;

public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber){


        int finalNumber = 0;
        try {

            finalNumber = firstNumber/secondNumber;

        }catch (Exception exception){
          return exception.toString();
        }
        return String.valueOf(finalNumber);
    }

    public static void main(String[] args) {
        GameDemo obj = new GameDemo();

        System.out.println("Output with int value : "+ obj.divideByNumber(50,5));
        System.out.println("Output with Zero : "+ obj.divideByNumber(50,0));
    }

}
