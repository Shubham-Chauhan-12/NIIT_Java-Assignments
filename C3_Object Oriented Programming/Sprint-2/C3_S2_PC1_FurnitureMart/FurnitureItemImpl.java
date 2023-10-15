import java.util.Scanner;

public class FurnitureItemImpl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FurnitureItem sa = new FurnitureItem();

        System.out.println("---------------------------------------------");
        System.out.println("Enter the furnitureUsage ? Indoor or Outdoor");
        sa.furnitureUsage = sc.nextLine();

        if(sa.furnitureUsage.equals("Outdoor")) {
            System.out.println("Enter the Furniture Type? Chair or Stool");
            sa.furnitureType = sc.nextLine();

            System.out.println("Enter the Price of " + sa.furnitureType);
            sa.price = sc.nextDouble();

            System.out.println("The Discounted price is " + sa.checkUsage());
        }

        else if (sa.furnitureUsage.equals("Indoor")){
            System.out.println("Discount given : "+sa.checkUsage());
        }

        else{
            System.out.println("----Wrong Input----");
        }
    }

}
