package com.banking;

import java.util.Scanner;

public class SavingAccountImpl {


    public static void main(String[] args) {
        SavingAccount savingAccount1 = new SavingAccount(0, "", "", "", "", false, 0, 0, 0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name");
        String name = scanner.nextLine();
        savingAccount1.setAccountHolderName(name);

        System.out.println("Enter your Age");
        int age = scanner.nextInt();

        savingAccount1.setAccountStatus("Active");


        System.out.println("Enter your mode of operation (Self-Operated or Joint account) Required");
        String mod = scanner.nextLine();
        savingAccount1.setModeOfOperation(mod);
        scanner.nextLine();

        System.out.println("Do you required a  Internet and Mobile Banking (Please Confirm with true/false)");
        boolean onlineBankingOption = scanner.nextBoolean();
        savingAccount1.setOnlineBankingOption(onlineBankingOption);


        System.out.println("Enter the Amount You want to deposit for Account Opening");
        double balance = scanner.nextDouble();
        savingAccount1.setAvailableBalance(balance);




        //savingAccount1.setTotalBalance(0);


        if (age >= 18) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Congratulation " + savingAccount1.getAccountHolderName() + " you are eligible for open the saving account ");
            System.out.println(" Your Account details is given below ");
            System.out.println();

            System.out.println("Account holder's Name : " + savingAccount1.getAccountHolderName());

            System.out.println("Account Number : " + savingAccount1.getAccountNumber());

            System.out.println("Account Status : " + savingAccount1.getAccountStatus());

            System.out.println("Account opening Date & Time : " + savingAccount1.getAccountOpeningDate());

            System.out.println("Mode of operation : " + savingAccount1.getModeOfOperation());

            System.out.println("Online banking Enabled : " + savingAccount1.isOnlineBankingOption());

            System.out.println("Rate of Interest per Annum : " + savingAccount1.getInterestRate());



            System.out.println();
            System.out.println("--------WELCOME TO THE COAST STATE BANK--------");
            System.out.println("------------------------------------------------");
            int number;
            do {
            System.out.println("press 1 to Check Balance");
            System.out.println("press 2 to Credit money");
            System.out.println("press 3 to Debit money");
            System.out.println(("press 4 to Transfer fund"));
            System.out.println("press 5 for Exit");

            number = scanner.nextInt();
            switch (number) {
                case 1:
                    savingAccount1.showAccountBalance(balance);
                    break;

                case 2:
                    System.out.println("How much Amount you want to Deposit");
                    int Money = scanner.nextInt();
                    savingAccount1.credit(Money);
                    break;

                case 3:
                    System.out.println("How much Amount you want for Withdrawal");
                    int cash = scanner.nextInt();
                    savingAccount1.debit(cash);
                    break;

                case 4:
                    System.out.println("Enter the Receiver Name");
                    String Name = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter the 12 digit account number of Receiver");
                    long Number = scanner.nextLong();
                    System.out.println("Amount to be transfer");
                    float transferAmount = scanner.nextFloat();
                    savingAccount1.transferFund(transferAmount, Number, Name);
                    break;

                case 5 :
                    System.out.println("Exit............");
                    break;

                default:
                    System.out.println("Wrong Input Try again!!");
            }
        }

        while (number != 5) ;
    }
        else
        {
            System.out.println(name + " you are not eligible for open the saving account ");
        }

    }
}
