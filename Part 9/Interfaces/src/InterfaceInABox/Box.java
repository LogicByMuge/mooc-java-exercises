package InterfaceInABox;

import java.util.ArrayList;

public class Box {
    private ArrayList<Packable> items;
    private double maxCapacity;

    public Box(double maxCapacity) {
        items = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void add(Packable item) {
        if((item.weight() + currentWeight()) < maxCapacity) {
            items.add(item);
        }
    }

    public double currentWeight() {
        double weight = 0;
        for (Packable item : items) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + (items.size() > 1 ? " items, " : " item, ") + "total weight " + currentWeight() + " kg";
    }
}
