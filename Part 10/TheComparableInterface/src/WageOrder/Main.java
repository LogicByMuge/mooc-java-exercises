package WageOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Alice", 25000));
        humans.add(new Human("Bob", 32000));
        humans.add(new Human("Charlie", 28000));

        System.out.println("Before sorting:");
        humans.forEach(System.out::println);

        Collections.sort(humans);

        System.out.println("\nAfter sorting (highest wage first):");
        humans.forEach(System.out::println);
    }
}