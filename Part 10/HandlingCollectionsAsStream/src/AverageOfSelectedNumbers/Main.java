package AverageOfSelectedNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = sc.nextLine();
            if(row.equals("end")) {
                break;
            }
            inputs.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = sc.nextLine();

        switch(choice) {
            case "n":
                OptionalDouble averageOfNegativeNum = inputs.stream()
                        .mapToInt(Integer::parseInt)
                        .filter(num -> num < 0)
                        .average();

                if (averageOfNegativeNum.isPresent()) {
                    System.out.println("Average of the negative numbers: " + averageOfNegativeNum.getAsDouble());
                } else {
                    System.out.println("No negative numbers entered.");
                }
                break;
            case "p":
                OptionalDouble averageOfPositiveNum = inputs.stream()
                        .mapToInt(Integer::parseInt)
                        .filter(num -> num < 0)
                        .average();

                if (averageOfPositiveNum.isPresent()) {
                    System.out.println("Average of the negative numbers: " + averageOfPositiveNum.getAsDouble());
                } else {
                    System.out.println("No positive numbers entered.");
                }
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}
