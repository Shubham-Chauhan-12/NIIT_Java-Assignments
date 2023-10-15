import java.util.Scanner;

public class SavingsAccountImpl
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount();
        System.out.println("Enter your Name");
        account.accountHolderName = scanner.nextLine();
        account.accountNumber = account.generateAccountNumber();
        account.accountStatus = "Active";
        account.accountBalance= 10000;

        System.out.println("Enter your Age");
        int Age = scanner.nextInt();
        if(Age >= 18) {
            System.out.println("-----Welcome to Coast Bank-----");
            System.out.println("Account Holders Name : " + account.accountHolderName);
            System.out.println("Account Number : " + account.accountNumber);
            System.out.println(account.accountHolderName + ": Please Press 1 for Debit Amount " +'\n' +"Press 2 for Credit Amount");
            int num = scanner.nextInt();

            switch(num){
                case 1 : System.out.println("Account Bal after Transfer : " + account.debitCash(200));
                        break;
                case 2 : System.out.println("Account Bal after Deposit : " +account.creditCash(3000.0) );
                        break;
            }

        }
        else{
            System.out.println(account.accountHolderName +" You are Not Eligible For Saving Account(Bank Eligibility Criteria Age>=18)");
        }



    }
}
