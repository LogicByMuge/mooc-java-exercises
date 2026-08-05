package HeightOrder;
import java.util.ArrayList;
public class Room {
    private ArrayList<Person> people;

    public Room() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public boolean isEmpty() {
        return people.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return people;
    }

    public Person shortest() {
        if(people.isEmpty()) {
            return null;
        }
        Person shortest = people.get(0);

        for(int i = 0; i < people.size(); i++) {
            if(shortest.getHeight() > people.get(i).getHeight()) {
                shortest = people.get(i);
            }
        }
        return shortest;
    }
}
