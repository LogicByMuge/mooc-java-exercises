package StudentsOnAlphabeticalOrder;

public class Student implements Comparable<Student>{
    private final String name;

    public Student(String name) {this.name = name;}

    @Override
    public int compareTo(Student o) {
        return (this.name.compareToIgnoreCase(o.name));
    }

    @Override
    public String toString() {
        return name;
    }
}
