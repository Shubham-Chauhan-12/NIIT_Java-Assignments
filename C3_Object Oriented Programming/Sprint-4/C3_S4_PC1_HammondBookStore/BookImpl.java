import java.util.Scanner;
import Com.BookData.Author;
import Com.BookData.Book;

public class BookImpl {
    public static void main(String[] args) {
        Author author = new Author();
        Book book = new Book();
        Scanner scanner = new Scanner(System.in);
        book.setAuthor(author);

        System.out.println("Enter the Author Name");
        String name = scanner.nextLine();
        author.setAuthorName(name);

        System.out.println("Enter the Author Pen Name");
        String pen = scanner.nextLine();
        author.setAuthorPenName(pen);


        System.out.println("Enter the ISBN code");
        int code = scanner.nextInt();
        book.setIsbn(code);

        System.out.println("Enter the Tittle");
        String tittle = scanner.nextLine();
        book.setTitle(tittle);
        scanner.nextLine();

        System.out.println("Enter the Description of Tittle");
        String description = scanner.nextLine();
        book.setDescription(description);

        System.out.println("Enter the Price of the "+tittle);
        float price = scanner.nextInt();
        book.setPrice(price);

        book.display();
    }

}
