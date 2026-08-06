import java.util.ArrayList;
import java.util.Random;
public class JokeManager {
    private ArrayList<String> jokes;
    private Random random;

    public JokeManager() {
        jokes = new ArrayList<>();
        random = new Random();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJokes() {
        if(jokes.isEmpty()) {
            return "Jokes are in short supply!";
        }
        return jokes.get(random.nextInt(jokes.size()));
    }

    public void printJokes() {
        for(String joke : jokes) {
            System.out.println(joke);
        }
    }
}
