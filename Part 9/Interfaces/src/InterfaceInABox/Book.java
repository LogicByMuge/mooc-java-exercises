package InterfaceInABox;

public class Book implements Packable{
    private final String author;
    private final String bookName;
    private double weight;

    public Book(String author, String bookName, double weight) {
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return author + ": " + bookName;
    }
}
