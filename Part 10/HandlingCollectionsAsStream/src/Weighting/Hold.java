package Weighting;

import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if((totalWeight() + suitcase.totalWeight()) <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        return suitcases.stream()
                .map(Suitcase::totalWeight)
                .reduce(0, Integer::sum);
    }

    public void printItems() {
        suitcases.forEach(Suitcase::printItems);
    }

    public String toString() {
        String label = suitcases.size() == 1 ? " suitcase" : " suitcases";
        return suitcases.size() + label + " (" + totalWeight() + " kg)";
    }
}
