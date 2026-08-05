import java.util.Scanner;
import java.nio.file.Paths;
public class RecordsFromAFile {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(Paths.get("data.txt"))) {
            while(sc.hasNextLine()) {
                String row = sc.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                String year = "years";
                if (age < 2) {
                    year = "year";
                }
                System.out.println(name + ", age: " + age + " " + year);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}