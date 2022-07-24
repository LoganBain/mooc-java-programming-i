
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
//            boolean helper = false;
//            for (Book value : books) {
//                if (value.equals(book)) {
//                    helper = true;
//                }
//            }
//            if (!helper) {
//                books.add(book);
//            }
            if (books.contains(book)) {
                System.out.println("Book already on list.");
            } else {
                books.add(book);
            }
        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
