package BigYear;

import java.util.ArrayList;

public class BirdDB {
    private ArrayList<Bird> birds;

    public BirdDB() {
        birds = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        birds.add(new Bird(name,latinName));
    }

    public void observation(String name) {
        boolean found = false;
        for(Bird bird : birds) {
            if(bird.getName().contains(name)) {
                bird.addObservation();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public void one(String name) {
        boolean found = false;
        for(Bird bird : birds) {
            if(bird.getName().contains(name)) {
                System.out.println(bird);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    public void all() {
        for(Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
