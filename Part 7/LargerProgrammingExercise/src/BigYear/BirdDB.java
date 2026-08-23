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
        for(Bird bird : birds) {
            if(bird.getName().contains(name)) {
                bird.addObservation();
            }
        }
    }

    public void all() {
        for(Bird bird : birds) {
            System.out.println(bird);
        }
    }
}
