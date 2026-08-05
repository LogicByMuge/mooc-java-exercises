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
}
