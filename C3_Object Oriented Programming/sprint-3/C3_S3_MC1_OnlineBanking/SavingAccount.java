import java.util.Random;
import java.util.Date;

public class SavingAccount {
    private String accountHolderName;
    private long accountNumber;
    private String accountStatus;
    private double availableBalance;
    private int accountHolderAge;
    private double totalBalance;
    private String modeOfOperation;
    private String bankOnlineFeatures;


    private final String accountOpeningDate;




    public SavingAccount()  // default constructor
    {
        this.accountNumber=generateAccountNumber();
        this.accountOpeningDate=dateGeneration();
    }

    public static long generateAccountNumber()
    {
        Random ranNo=new Random();
        return Math.round(ranNo.nextFloat()*Math.pow(10,12));
    }

    public static String dateGeneration(){
        Date date = new Date();
        return date.toString();

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public int getAccountHolderAge() {
        return accountHolderAge;
    }

    public void setAccountHolderAge(int accountHolderAge) {
        this.accountHolderAge = accountHolderAge;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public String getBankOnlineFeatures() {
        return bankOnlineFeatures;
    }

    public void setBankOnlineFeatures(String bankOnlineFeatures) {
        this.bankOnlineFeatures = bankOnlineFeatures;
    }

    public void retrieveBalance(){

        this.totalBalance = availableBalance;
        System.out.println("AccountBalance : " + getTotalBalance());

    }
    public  double debitMoney (double withdrawalBal){
        double newBalance = availableBalance - withdrawalBal;
        System.out.println("withdrawalBal : " + withdrawalBal);
        System.out.println("Remaining balance :"+ newBalance);
        this.availableBalance = newBalance;
        return newBalance;
    }
    public double creditMoney (double depositMoney){
        double newBalance = availableBalance + depositMoney;
        System.out.println("DepositMoney : " + depositMoney);
        System.out.println("Updated Balance : " + newBalance);
        this.availableBalance = newBalance;
        return newBalance;

    }


}
