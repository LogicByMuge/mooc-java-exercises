package Weighting;

import java.util.ArrayList;
import java.util.Comparator;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if((totalWeight() + item.getWeight()) < maximumWeight) {
            items.add(item);
        }
    }

    public int totalWeight() {
        return items.stream()
                .map(Item::getWeight)
                .reduce(0, Integer::sum);
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

    public Item heaviestItem() {
        return items.stream()
                .max(Comparator.comparingInt(Item::getWeight))
                .orElse(null);
    }



    public String toString() {
        String label = items.size() == 1 ? " item" : " items";
        return items.size() + label + " (" + totalWeight() + " kg)";
    }
}
