package EnumAndIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private ArrayList<Person> people;

    public Employees() {
        people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        peopleToAdd.forEach(this::add);
    }

    public void print() {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if(p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person p = iterator.next();
            if(p.getEducation() == education) {
                people.remove(p);
            }
        }
    }
}
