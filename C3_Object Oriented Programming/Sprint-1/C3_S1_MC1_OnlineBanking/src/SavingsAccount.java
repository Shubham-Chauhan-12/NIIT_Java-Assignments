import java.util.Random;

public class SavingsAccount {
    long accountNumber;
    String accountHolderName;
    double accountBalance;
    String accountStatus;


    public long generateAccountNumber() {

        Random random = new Random();
        accountNumber = Math.round(random.nextFloat()*Math.pow(10,12));
        return accountNumber;

    }

    public double debitCash(double amount) {
        return accountBalance - amount;
    }

    public double creditCash(double amount) {
        return accountBalance + amount;
    }
}
