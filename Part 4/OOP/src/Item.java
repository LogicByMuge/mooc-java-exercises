import java.time.LocalDateTime;
public class Item {
    private String name;
    LocalDateTime myObj = LocalDateTime.now();

    public Item(String itemName) {
        this.name = itemName;
    }

    @Override
    public String toString() {
        return this.name + "(Created at: " + myObj + ")";
    }
}
