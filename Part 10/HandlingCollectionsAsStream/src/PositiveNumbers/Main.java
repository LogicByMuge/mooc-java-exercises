package PositiveNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(-4);
        list.add(2);
        list.add(6);

        List<Integer> positiveVal = positive(list);

        System.out.println("Positive values: " + positiveVal);
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(val -> val > 0)
                .collect(Collectors.toList());
    }
}
