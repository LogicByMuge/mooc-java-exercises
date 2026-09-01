package Herds;

import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> organisms;

    public Herd() {
        organisms = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        organisms.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable organism : organisms) {
            organism.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        StringBuilder coordinates = new StringBuilder();
        for(Movable organism : organisms) {
            coordinates.append(organism).append("\n");
        }
        return coordinates.toString();
    }
}
