import java.util.Scanner;
import java.nio.file.Paths;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String file = scanner.nextLine();
        try(Scanner sc = new Scanner(Paths.get(file))) {
            while(sc.hasNextLine()) {
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}