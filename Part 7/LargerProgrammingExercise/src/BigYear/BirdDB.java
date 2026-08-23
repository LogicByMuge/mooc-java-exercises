package BigYear;

import java.util.ArrayList;
import java.util.HashMap;

public class BirdDB {
    private final HashMap<String, Bird> birds;

    public BirdDB() {
        birds = new HashMap<>();
    }

    public void add(String name, String latinName) {
        birds.put(name, new Bird(name,latinName));
    }

    public void observation(String name) {
        if(birds.containsKey(name)) {
            birds.get(name).addObservation();
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void one(String name) {
        if(birds.containsKey(name)) {
            System.out.println(birds.get(name));
        } else {
            System.out.println("Not a bird!");
        }
    }

    public void all() {
        for(Bird bird : birds.values()) {
            System.out.println(bird);
        }
    }
}
