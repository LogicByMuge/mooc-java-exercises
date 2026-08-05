package Collection;

import java.util.ArrayList;
public class SimpleCollection {
    private ArrayList<String> strings;
    private String name;

    public SimpleCollection(String name) {
        strings = new ArrayList<>();
        this.name = name;
    }

    public void add(String value) {
        if(!value.isEmpty()) {
            strings.add(value);
        }
    }

    public String longest() {
        if(strings.isEmpty()) {
            return null;
        }

        String longest = strings.get(0);
        for (int i = 0; i < strings.size(); i++) {
            if(longest.length() < strings.get(i).length()) {
                longest = strings.get(i);
            }
        }
        return longest;
    }

    public String toString() {
        String list = "";
        String isEmpty = "is empty";

        if(!strings.isEmpty()) {
            isEmpty = "has " + strings.size() + " elements\n";
            for (int i = 0; i < strings.size(); i++) {
                list = list + strings.get(i) + "\n";
            }
        }
        return "The collection alphabet " + isEmpty + list;
    }
}
