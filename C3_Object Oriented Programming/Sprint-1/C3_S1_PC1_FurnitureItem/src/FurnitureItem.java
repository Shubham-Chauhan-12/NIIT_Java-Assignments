public class FurnitureItem {


        int furnitureCode;
        String furnitureType;
        String gradeOfFurniture;
        String Color;
        String furnitureUsage;
        double price;


        public double checkUsage() {
            String type = furnitureType;
            String usage = furnitureUsage;
            double newPrice;

            if (usage.equals("Outdoor")) {

                if (type.equals("Chair") || type.equals("Stool")) {

                    newPrice = price - (price * 5) / 100;
                    return newPrice;
                }
                else return 0.0;
            }

            else
                {

                System.out.println("The Usage is Indoor And Price is Same ");
                return 0.0;
            }

        }

}
