package Song;

public class SongMain {
    public static void main(String[] args) {
        Song jackSparrow = new Song("The lonely island", "Jack Sparrow", 196);
        Song anotherJackSparrow = new Song("The lonely island", "Jack Sparrow", 196);

        System.out.println(jackSparrow.equals(anotherJackSparrow));
    }
}