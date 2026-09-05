package Literature;

public class Book implements Comparable<Book>{
    private final String name;
    private final int recommendedAge;

    public Book(String name, int recommendedAge) {
        this.name = name;
        this.recommendedAge = recommendedAge;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + recommendedAge + " year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        int ageCompare = Integer.compare(this.recommendedAge, o.recommendedAge);
        if (ageCompare != 0) {
            return ageCompare;
        }
        return this.name.compareToIgnoreCase(o.name);
    }
}
