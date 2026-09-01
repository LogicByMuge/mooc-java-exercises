package Animals;

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println(name + " sleeps");
    }

    public void eat() {
        System.out.println(name + " eats");
    }

    public String getName() { return name; }
}
