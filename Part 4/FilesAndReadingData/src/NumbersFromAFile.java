import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lower bound? ");
        int lowerBound = sc.nextInt();
        System.out.print("Upper bound? ");
        int upperBound = sc.nextInt();

        try(Scanner scanner = new Scanner(Paths.get("numbers.txt"))) {
            int count = 0;
            while(scanner.hasNextLine()) {
                int row = Integer.valueOf(scanner.nextLine());
                if(row >= lowerBound && row <= upperBound) {
                    count++;
                }
            }
            System.out.println("Numbers: " + count);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}