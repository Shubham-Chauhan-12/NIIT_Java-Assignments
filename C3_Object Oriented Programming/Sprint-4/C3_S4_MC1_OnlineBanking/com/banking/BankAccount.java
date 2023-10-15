package com.banking;
import java.util.Date;

import java.util.Random;

public abstract class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private String accountStatus;
    private String accountOpeningDate;
    private String modeOfOperation;
    private boolean onlineBankingOption;
    private double totalBalance;
    private double availableBalance;
    private final float interestRate = 3.5f;


    public BankAccount(long accountNumber, String accountHolderName, String accountStatus, String accountOpeningDate, String modeOfOperation, boolean onlineBankingOption, double totalBalance, double availableBalance) {
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.accountOpeningDate = dateGeneration();
        this.modeOfOperation = modeOfOperation;
        this.onlineBankingOption = onlineBankingOption;
        this.totalBalance = totalBalance;
        this.availableBalance = availableBalance;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public boolean isOnlineBankingOption() {
        return onlineBankingOption;
    }

    public void setOnlineBankingOption(boolean onlineBankingOption) {
        this.onlineBankingOption = onlineBankingOption;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public long generateAccountNumber()
    {
        Random random=new Random();
        return Math.round(random.nextFloat()*Math.pow(10,12));
    }
    public static String dateGeneration(){
        Date date = new Date();
        return date.toString();

    }



    public  abstract  void showAccountBalance(double availableBalance);

    public abstract double debit(double debitAmount);

    public abstract double credit(double creditAmount);

    public abstract void transferFund(float amount,long accountNumber,String name);




}

