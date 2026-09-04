package LimitedNumbers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while(true) {
            int input = Integer.parseInt(sc.nextLine());

            if(input < 0) {
                break;
            }

            numbers.add(input);
        }

        ArrayList<Integer> limited = numbers.stream()
                .filter(number -> number >= 1 && number <= 5)
                .collect(Collectors.toCollection(ArrayList::new));

        limited.forEach(System.out::println);
    }
}
