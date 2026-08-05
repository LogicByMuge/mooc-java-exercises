import java.util.Scanner;
import java.util.ArrayList;
public class NameOfTheOldest {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            }
            people.add(input);
        }

        String[] piece = people.get(0).split(",");
        String name = piece[0];
        int oldest = Integer.valueOf(piece[1]);
        for(int i = 0; i < people.size(); i++) {
            String[] pieces = people.get(i).split(",");
            int age = Integer.valueOf(pieces[1]);
            if (age > oldest) {
                name = pieces[0];
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}