package AverageOfNumbers;

import java.util.ArrayList;
import java.util.List;
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

        double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();

        System.out.println("Average of numbers: " + average);
    }

}