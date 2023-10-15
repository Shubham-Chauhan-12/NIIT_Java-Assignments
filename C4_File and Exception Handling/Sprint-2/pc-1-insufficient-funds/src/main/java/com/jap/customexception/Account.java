package com.jap.customexception;

import java.util.Scanner;

public class Account {

    private int accountBalance;

    public Account(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    //create getter and setter


    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    /**
     * This method returns the new balance deducting the withdraw amount from the balance
     * Throws InsufficientFundException when amount to withdraw is greater than the balance
     *
     * @param amount
     * @return
     * @throws InsufficientFundException
     *
     */
    public int  withdraw(int  amount) throws InsufficientFundException{
        int newBalance = 0;
        newBalance = getAccountBalance() - amount;


            if (newBalance <= 0) {
                throw new InsufficientFundException("Insufficient Fund");
            }


        return newBalance;
    }


    public static void main(String[] args) {

        Account account = new Account(0);
        Scanner scanner = new Scanner(System.in);

        account.setAccountBalance(5000);

        System.out.println("Enter the Amount ?");
        int amount = scanner.nextInt();

      try {

          System.out.println("Output : " +account.withdraw(amount));

      }
      catch (InsufficientFundException e){
            //System.out.println(e);
            e.printStackTrace();
        }



    }


}
