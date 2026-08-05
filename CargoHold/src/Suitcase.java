import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight) {
        items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item item) {
        if((getTotalWeight() + item.getWeight()) < maximumWeight) {
            items.add(item);
        }
    }

    public int getTotalWeight() {
        int totalWeight = 0;
        for (int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).getWeight();
        }
        return totalWeight;
    }

    public String toString() {
        String label = items.size() == 1 ? " item" : " items";
        return items.size() + label + " (" + getTotalWeight() + " kg)";
    }
}
