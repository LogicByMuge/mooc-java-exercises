package ValidatingParameters;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be empty/null");
        }
        if(name.length() <= 40) {
            throw new IllegalArgumentException("Name must not be over 40 characters long");
        }
        if(age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age");
        }
        this.name = name;
        this.age = age;
    }
}
