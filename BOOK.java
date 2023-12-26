import java.util.Scanner;

class Book {
    String name;
    String author;
    int price;
    int numPages;

   
    Book(String name, String author, int price, int numPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.numPages = numPages;
    }

 
    public String toString() {
        String nameStr = "Book name: " + this.name + "\n";
        String authorStr = "Author name: " + this.author + "\n";
        String priceStr = "Price: " + this.price + "\n";
        String numPagesStr = "Number of pages: " + this.numPages + "\n";
        return nameStr + authorStr + priceStr + numPagesStr;
    }
}

public class BOOK {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       
        int n = s.nextInt();

       
        Book[] books = new Book[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1));
            System.out.println("Enter name: ");
            String name = s.nextLine();
            System.out.println("Enter author: ");
            String author = s.next();
            System.out.println("Enter price: ");
            int price = s.nextInt();
            System.out.println("Enter number of pages: ");
            int numPages = s.nextInt();

           
            books[i] = new Book(name, author, price, numPages);
        }

        System.out.println("\nDetails of the Books:");
        for (int i = 0; i < n; i++) {
            System.out.println("Book " + (i + 1) + ":\n" + books[i]);
        }
    }
}