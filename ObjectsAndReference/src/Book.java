public class Book {
    private String title;
    private int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(!(obj instanceof Book)) {
            return false;
        }

        Book comparedBook = (Book) obj;

        return this.title.equals(comparedBook.title) &&
                this.year == comparedBook.year;
    }
}
