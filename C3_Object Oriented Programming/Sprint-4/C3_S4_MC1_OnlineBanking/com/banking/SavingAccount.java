package com.banking;

public class SavingAccount extends BankAccount{



    public SavingAccount(long accountNumber, String accountHolderName, String accountStatus, String accountOpeningDate, String modeOfOperation, boolean onlineBankingOption, double totalBalance, double availableBalance, double rateOfInterest) {
        super(accountNumber, accountHolderName, accountStatus, accountOpeningDate, modeOfOperation, onlineBankingOption, totalBalance, availableBalance);
    }

    @Override
    public void showAccountBalance(double availableBalance) {
        System.out.println("Account balance : "+availableBalance);

    }


    public double debit(double withdrawalBal)
    {
        double newBalance = getAvailableBalance() - withdrawalBal;
        System.out.println("withdrawalBal : " + withdrawalBal);
        System.out.println("Remaining balance :"+ newBalance);
        setAvailableBalance(newBalance);
        return newBalance;
    }

    public double credit(double depositMoney)
    {
        double newBalance = getAvailableBalance() + depositMoney;
        System.out.println("DepositMoney : " + depositMoney);
        System.out.println("Updated Balance : " + newBalance);
        setAvailableBalance(newBalance);
        return newBalance;
    }

    public void transferFund(float amount,long accountNumber,String name){
        double amount2 = 0;
        System.out.println("Available balance  : "+getAvailableBalance());
        System.out.println("Amount to be transfer : "+amount);
        System.out.println("Receiver Account number : "+accountNumber);
        System.out.println("Receiver Name : " + name);
        amount2 = getAvailableBalance()-amount;
        System.out.println("Successfully Transferred the Amount "+amount);
        System.out.println("Balance Left : "+amount2);
        setAvailableBalance(amount2);




    }



}


