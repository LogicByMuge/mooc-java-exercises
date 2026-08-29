package StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }

    // adds the parameter item to the storage unit that is also given as a parameter.
    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }

    // returns a list that contains all the items in the storage unit indicated by the parameter.
    // If there is no such storage unit, or it contains no items, the method should return an empty list.
    public ArrayList<String> contents(String storageUnit) {
        if(storage.get(storageUnit) == null) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }
}
