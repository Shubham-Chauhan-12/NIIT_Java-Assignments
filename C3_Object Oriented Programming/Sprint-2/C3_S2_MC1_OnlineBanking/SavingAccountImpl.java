import java.util.Scanner;

public class SavingAccountImpl
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("How much Money you want to deposit at the Time of Opening (Min>5000)");
        long cash = sc.nextLong();
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        if (age>=18 && cash >= 5000){

            System.out.println("Congratulation "+name+" you are eligible for open the saving account ");
            System.out.println( " Your account details given below ");
            System.out.println( );

            SavingAccount account = new SavingAccount (name,cash,"active");
            System.out.println("Account holder name = "+account.accountHolderName);
            System.out.println("------------------------------------------------");
            System.out.println("Your Account number is = "+account.accountNumber);
            System.out.println("------------------------------------------------");
            System.out.println("Your Account status is = "+account.accountStatus);
            System.out.println("Your account is active now");
            System.out.println();
            System.out.println("--------WELCOME TO THE COAST STATE BANK--------");
            System.out.println("------------------------------------------------");
            int number;
            do
            {
                System.out.println(name + " please select the following options");
                System.out.println();
                System.out.println("press 1 To check balance");
                System.out.println("press 2 To credit money to your account");
                System.out.println("press 3 To debit money from your account");
                System.out.println("press 4 to Exit");

                number = sc.nextInt();

                switch (number) {

                    case 1:
                        account.checkBalance();
                        break;
                    case 2:
                        System.out.println("How much Amount you want to Deposit");
                        int deposit = sc.nextInt();
                        account.creditMoney(deposit);
                        break;
                    case 3:
                        System.out.println("How much Amount you want for Withdrawal");
                        int money = sc.nextInt();
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
