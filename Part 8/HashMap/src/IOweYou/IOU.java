package IOweYou;

import java.util.HashMap;

public class IOU {
    HashMap<String, Double> hashMap;

    public IOU() {
        hashMap = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        hashMap.put(toWhom,amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return hashMap.getOrDefault(toWhom, (double)0);
    }
}
