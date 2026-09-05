package WageOrder;

public class Human implements Comparable<Human>{
    private final String name;
    private int wage;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    @Override
    public int compareTo(Human o) {
        if (this.wage == o.wage) return 0;
        else if (this.wage > o.wage) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return name + ", wage: " + wage;
    }
}
