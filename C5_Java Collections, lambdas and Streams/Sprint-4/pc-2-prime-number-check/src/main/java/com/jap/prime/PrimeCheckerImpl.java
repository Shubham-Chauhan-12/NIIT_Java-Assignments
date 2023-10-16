package com.jap.prime;

import java.util.Scanner;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {

        // write the logic here to check is a number is prime or not

        PrimeChecker obj = number1 -> {
            int count = 0;

            if (number1 == 1 || number1 == 0) {

                return false;
            } else {

                for (int i = 1; i <= number1; i++) {
                    if (number1 % i == 0) {
                        count++;
                    }

                }
                if (count > 2) {

                    return false;
                } else {

                    return true;
                }

            }

        };
        return obj.primeNumberCheck(number);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        PrimeCheckerImpl obj2 = new PrimeCheckerImpl();
        System.out.println(obj2.primeNumberCheck(number));
    }
}
