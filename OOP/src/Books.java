import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        ArrayList<Book> book = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("Title: ");
            String title = sc.nextLine();
            if(title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            System.out.print("Publication Year: ");
            int year = Integer.valueOf(sc.nextLine());

            book.add(new Book(title, pages, year));
        }
        System.out.print("What information will be printed? ");
        String info = sc.nextLine();


        for(int i = 0; i < book.size(); i++) {
            if(info.equals("everything")) {
                System.out.println(book.get(i));
            } else if(info.equals("name")) {
                System.out.println(book.get(i).getTitle());
            }
        }
    }
}
