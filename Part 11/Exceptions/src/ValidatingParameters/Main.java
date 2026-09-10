package ValidatingParameters;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.factorial(5)); // 120
        System.out.println(calc.binomialCoefficient(5, 2)); // 10

        Person p = new Person("Ada Lovelace", 36); // valid
        Person bad = new Person("", 200); // throws IllegalArgumentException

    }
}