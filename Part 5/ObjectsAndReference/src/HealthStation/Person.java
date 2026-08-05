package HealthStation;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void printPerson() {
        System.out.println(getName() + " is " + getAge() + " years old");
    }

    public void growOlder() {
        this.age++;
    }

    public boolean isAdult() {
        return this.age >= 18;
    }

    public double bodyMassIndex() {
        double heightInMeters = getHeight() / 100.0;
        return getWeight() / (heightInMeters * heightInMeters);
    }

    public String toString() {
        return getName() + " is " + getAge() + " years old, their BMI is " + this.bodyMassIndex();
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
