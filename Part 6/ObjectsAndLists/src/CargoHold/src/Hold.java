import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if((totalWeight() + suitcase.totalWeight()) < maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for(int i = 0; i < suitcases.size(); i++) {
            totalWeight += suitcases.get(i).totalWeight();
        }
        return totalWeight;
    }

    public void printItems() {
        for(int i = 0; i < suitcases.size(); i++) {
            suitcases.get(i).printItems();
        }
    }

    public String toString() {
        String label = suitcases.size() == 1 ? " suitcase" : " suitcases";
        return suitcases.size() + label + " (" + totalWeight() + " kg)";
    }
}
