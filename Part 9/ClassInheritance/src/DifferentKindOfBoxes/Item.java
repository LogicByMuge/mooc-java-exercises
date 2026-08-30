package DifferentKindOfBoxes;

import java.util.Objects;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this.name = name;
        this.weight = 0; // default weight
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        // Equality based only on name, weight ignored
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        // Hash based only on name
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
