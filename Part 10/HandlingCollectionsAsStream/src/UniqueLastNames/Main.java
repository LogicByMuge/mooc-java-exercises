package UniqueLastNames;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Continue personal information input? \"quit\" ends:");
            String choice = sc.nextLine();

            if(choice.equals("quit")) {
                break;
            }

            System.out.println("Input first name: ");
            String firstName = sc.nextLine();
            System.out.println("Input last name: ");
            String lastName = sc.nextLine();
            System.out.println("Input the year of birth: ");
            int birthYear = Integer.parseInt(sc.nextLine());

            people.add(new Person(firstName,lastName,birthYear));
        }

        System.out.println("Unique last names in alphabetical order:");
        people.stream()
                .map(Person::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
