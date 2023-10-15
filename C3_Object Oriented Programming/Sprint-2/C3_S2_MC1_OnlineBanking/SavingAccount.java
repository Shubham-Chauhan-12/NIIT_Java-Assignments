import java.util.Random;


public class SavingAccount {


    long accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountStatus;

    public SavingAccount(String name,double balance,String status){
        this.accountNumber = generateAccountNumber();
        this.accountHolderName = name;
        this.accountBalance = balance;
        this.accountStatus = status;
    }
    public static long generateAccountNumber()
    {
        Random random = new Random();
        return Math.round(random.nextFloat() * Math.pow(10,12));

    }
    public void checkBalance(){


        System.out.println("AccountBalance : " + accountBalance);


    }
    public  double debitMoney (double withdrawalBal){
        double newBalance = accountBalance - withdrawalBal;
        System.out.println("withdrawalBal : " + withdrawalBal);
        System.out.println("Remaining balance :"+ newBalance);
        this.accountBalance = newBalance;
        return newBalance;
    }
    public double creditMoney (double depositMoney){
        double newBalance = accountBalance + depositMoney;
        System.out.println("DepositMoney : " + depositMoney);
        System.out.println("Updated Balance : " + newBalance);
        this.accountBalance = newBalance;
        return newBalance;

    }




}
