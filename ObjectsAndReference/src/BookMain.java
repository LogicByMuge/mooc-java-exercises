import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int bookCount = 0;

        while(true) {
            System.out.println("Name (Empty will stop):");
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }
            System.out.println("Pulication Year:");
            int publicationYear = Integer.valueOf(sc.nextLine());

            Book bookToAdd = new Book(name,publicationYear);
            if(book.contains(bookToAdd)) {
                System.out.println("Book is already on the list!");
            } else {
                book.add(bookToAdd);
                bookCount++;
            }
        }
        System.out.println("Books added: " + bookCount);
    }
}