import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Title: ");
            String bookTitle = scan.nextLine();
            if (bookTitle.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int numOfPages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year; ");
            int pubYear = Integer.valueOf(scan.nextLine());
            books.add(new Book(bookTitle, numOfPages, pubYear));
        }
        System.out.println("What information will be printed?");
        String response = scan.nextLine();
        if (response.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (response.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
