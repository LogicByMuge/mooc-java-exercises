import java.util.ArrayList;

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
        int totalWeight = 0;
        for (int i = 0; i < items.size(); i++) {
            totalWeight += items.get(i).getWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for(int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
        }
    }

    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);
        for(int i = 0; i < items.size(); i++) {
            if(heaviest.getWeight() < items.get(i).getWeight()) {
                heaviest = items.get(i);
            }
        }
        return heaviest;
    }

    public String toString() {
        String label = items.size() == 1 ? " item" : " items";
        return items.size() + label + " (" + totalWeight() + " kg)";
    }
}
