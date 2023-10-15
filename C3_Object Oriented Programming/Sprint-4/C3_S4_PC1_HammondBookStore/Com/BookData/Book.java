package Com.BookData;
import java.util.Arrays;

public class Book {


    private int isbn;
    private String title;
    private String description;
    private double price;
    Author author;

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

        @Override
        public String toString() {
            return "Book{" +
                    "ISBN =" + isbn +
                    ", Title='" + title + '\'' +
                    ", Description= " + description + '\'' +
                    ", Price = " + price +
                    ", Author = " + author +
                    '}';
        }



        public void display(){
            author.display();
            System.out.println("ISBN = " + isbn);
            System.out.println("Tittle = " + title);
            System.out.println("Description = " + description);
            System.out.println("Price = " + price);
        }


}
