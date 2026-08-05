package Gift;

import java.util.ArrayList;
public class Package {
    ArrayList<Gift> gifts;

    public Package() {
        gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(int i = 0; i < gifts.size(); i++) {
            totalWeight += gifts.get(i).getWeight();
        }
        return totalWeight;
    }
}
