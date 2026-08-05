import java.util.ArrayList;
import java.util.Scanner;
public class OnTheList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }

        System.out.print("Search for? ");
        String search = sc.nextLine();
        if(!names.contains(search)) {
            System.out.println(search + " was not found!");
        } else {
            System.out.println(search + " was found!");
        }
    }
}