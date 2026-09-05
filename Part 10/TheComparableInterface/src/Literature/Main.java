package Literature;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = sc.nextLine();
            if(name.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            int recommendedAge = Integer.parseInt(sc.nextLine());

            books.add(new Book(name,recommendedAge));
        }

        System.out.println("\n" + books.size() + " books in total.");

        System.out.println("\nBooks:");
        Collections.sort(books);

        books.forEach(System.out::println);
    }
}
