package HealthStation;

public class HealthStation {
    int weighings;

    public int weight(Person person) {
        if (person.getWeight() > 0) {
            this.weighings++;
            return person.getWeight();
        }
        return -1;
    }

    public int weightings() {
        return this.weighings;
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
}
