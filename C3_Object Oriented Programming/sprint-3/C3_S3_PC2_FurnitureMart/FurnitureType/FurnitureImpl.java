package FurnitureType;

import java.util.Scanner;

public class FurnitureImpl {
    public static void main(String[] args) {
        FurnitureItem items = new FurnitureItem();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter your furniture Usage (Indoor or Outdoor)");
        String usg =sc.nextLine();
        items.setFurnitureUsage(usg);

        System.out.println("Enter the Grade of furniture (Grade1,Grade2,Grade3)");
        String grd=sc.nextLine();
        items.setGradeOfFurniture(grd);

        System.out.println("Enter the Price of Furniture");
        float amt = sc.nextFloat();
        items.setPrice(amt);

        System.out.println("Enter the Furniture Code");
        String cd =sc.nextLine();
        items.setFurnitureCode(cd);
        sc.nextLine();

        System.out.println("Please Select the Color of Furniture");
        String co = sc.nextLine();
        items.setColor(co);

        System.out.println("Please select type of Furniture(Stool,Chair,Cupboards,Table)");
        String typ = sc.nextLine();
        items.setFurnitureType(typ);

        items.calculateDiscount();


    }
}
