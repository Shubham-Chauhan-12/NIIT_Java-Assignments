package FurnitureType;


public class FurnitureItem {
    private String furnitureCode;
    private String furnitureType;
    private String gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private float price;

    static final float DISCOUNT_PERCENTAGE = 5.0f;

    public FurnitureItem() {

    }

    public String getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(String furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(String gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float calculateDiscount()
    {
        if (getGradeOfFurniture().equalsIgnoreCase("grade1") && getFurnitureUsage().equalsIgnoreCase("outdoor"))
        {
            float newPrice = getPrice() - (getPrice()* DISCOUNT_PERCENTAGE)/100;

            System.out.println("-------------------------------------------");
            System.out.println("Discounted Price after 5% : "+newPrice);
            System.out.println("Furniture Type : "+ getFurnitureType());
            System.out.println("Furniture Color : "+ getColor());
            System.out.println("-------------------------------------------");
            return newPrice;
        }
        else
        {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("NO DISCOUNT IS APPLICABLE FOR INDOOR ITEMS (PRICE Is Same "+ price +")");
        }
        return 0;
    }
}
