import java.util.ArrayList;
import java.util.Scanner;
public class FirstAndLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while(true) {
            String name = sc.nextLine();
            if (name.isEmpty()) {
                break;
            }
            names.add(name);
        }
        System.out.println(names.get(0));
        System.out.println(names.get(names.size() - 1));
    }
}