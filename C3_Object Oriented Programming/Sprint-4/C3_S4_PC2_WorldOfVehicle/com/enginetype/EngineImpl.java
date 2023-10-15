package com.enginetype;
import java.util.Scanner;

public class EngineImpl {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Engines engines = new Engines("NL015",200,66.8,2500,4);
        PetrolEngine petrolEngine = new PetrolEngine("REV26",1500,150.0,5500,2,"Petrol",47);
        DieselEngine dieselEngine = new DieselEngine("QUAD87",1200,140,2800,4,"Diesel",25.9f);
        CngEngine cngEngine = new CngEngine("KAPPA12",800,80.0,8000,3,28.5f);
        EV ev=new EV("NEX34",0,200,1000,2,2000,3000);

        System.out.println("Select the type for their Details");
        System.out.println("Press 1 for Petrol Engine");
        System.out.println("Press 2 for Diesel Engine");
        System.out.println("Press 3 for Cng Engine");
        System.out.println("Press 4 for EV Engine");
        int typ = obj.nextInt();

        switch(typ){
            case 1 : petrolEngine.display();
                    break;

            case 2 : dieselEngine.display();
                    break;

            case 3 : cngEngine.display();
                    break;

            case 4: ev.display();
                    break;

            default:
                System.out.println("Invalid type(Select Engine Type from Given Menu)");
        }




    }
}
