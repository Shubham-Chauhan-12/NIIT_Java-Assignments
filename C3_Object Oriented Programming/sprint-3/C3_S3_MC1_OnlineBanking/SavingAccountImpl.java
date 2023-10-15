
import java.util.Scanner;

public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount account= new SavingAccount();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter your Name");
        String name= scanner.nextLine();
        account.setAccountHolderName(name);

        System.out.println("Enter your Age");
        int age=scanner.nextInt();
        account.setAccountHolderAge(age);
        scanner.nextLine();


        System.out.println("Enter your mode of operation (Self-Operated or Joint account) Required");
        String mode= scanner.nextLine();
        account.setModeOfOperation(mode);

        System.out.println("Do you require Internet and Mobile Banking (Please Confirm with Y/N)");
        String onBank = scanner.nextLine();
        account.setBankOnlineFeatures(onBank);

        System.out.println("Enter the Amount You want to deposit for Account Opening");
        double bal= scanner.nextDouble();
        account.setAvailableBalance(bal);

        account.setAccountStatus("Active");
        System.out.println();


        if (account.getAccountHolderAge() >= 18)
        {
            System.out.println("Congratulation "+ account.getAccountHolderName()+" you are eligible for open the saving account ");
            System.out.println( " Your Account details is given below ");
            System.out.println( );


            System.out.println("Account Holder's Name : "+account.getAccountHolderName());

            System.out.println("Account Number : "+account.getAccountNumber());

            System.out.println("Your Account status is : "+account.getAccountStatus());

            System.out.println("Account opening Date & Time : "+account.getAccountOpeningDate());

            System.out.println("Mode of operation : "+account.getModeOfOperation());

            System.out.println("Internet and Mobile Banking Enabled : "+ account.getBankOnlineFeatures());


            System.out.println();
            System.out.println("--------WELCOME TO THE COAST STATE BANK--------");
            System.out.println("------------------------------------------------");
            int number;
            do {
                    System.out.println(name + " please select the following options");
                    System.out.println();
                    System.out.println("press 1 To check balance");
                    System.out.println("press 2 To credit money to your account");
                    System.out.println("press 3 To debit money from your account");
                    System.out.println("press 4 to Exit");

                    number = scanner.nextInt();

                    switch (number) {

                        case 1:
                            account.retrieveBalance();
                            break;
                        case 2:
                            System.out.println("How much Amount you want to Deposit");
                            int deposit = scanner.nextInt();
                            account.creditMoney(deposit);
                            break;
                        case 3:
                            System.out.println("How much Amount you want for Withdrawal");
                            int money = scanner.nextInt();
                            account.debitMoney(money);
                            break;
                        case 4:
                            System.out.println("Exit");
                            break;

                        default:
                            System.out.println("Wrong Input Try again!!");

                    }
                }

                while(number!=4);
            }
            else{
                System.out.println(name + " you are not eligible for open the saving account ");
            }

    }
}
