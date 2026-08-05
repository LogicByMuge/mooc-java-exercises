import java.util.Scanner;
import java.nio.file.Paths;
public class GuestList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            try (Scanner sc = new Scanner(Paths.get("guestlist.txt"))) {
                if (!name.equals(sc.nextLine())) {
                    System.out.println("The name is not on the list!");
                } else {
                    System.out.println("The name is on the list!");
                }


            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}