package InterfaceInABox;

public class CD implements Packable{
    private final String artist;
    private final String cdName;
    private final int publicationYear;
    private final double weight;

    public CD(String artist, String cdName, int publicationYear) {
        this.artist = artist;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
        weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return artist + ": " + cdName + " (" + publicationYear + ")";
    }
}
