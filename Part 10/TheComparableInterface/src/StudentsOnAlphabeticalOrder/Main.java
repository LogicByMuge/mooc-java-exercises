package StudentsOnAlphabeticalOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie"));
        students.add(new Student("alice"));
        students.add(new Student("Bob"));

        System.out.println("Before sorting:");
        students.forEach(System.out::println);

        Collections.sort(students);

        System.out.println("\nAfter sorting (alphabetical):");
        students.forEach(System.out::println);
    }
}
