package Searching;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Fellowship of the Ring"));
        books.add(new Book(2, "The Two Towers"));
        books.add(new Book(3, "The Return of the King"));
        books.add(new Book(4, "The Hobbit"));
        books.add(new Book(5, "The Silmarillion"));

        System.out.println(linearSearch(books, 3));
        System.out.println(linearSearch(books, 10));

        System.out.println(binarySearch(books, 1));
        System.out.println(binarySearch(books, 10));
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for(int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        while(begin <= end) {
            int middle = (end + begin) / 2;
            if(books.get(middle).getId() == searchedId) {
                return middle;
            }
            if(books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            }
            if(books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }
        }
        return -1;
    }
}