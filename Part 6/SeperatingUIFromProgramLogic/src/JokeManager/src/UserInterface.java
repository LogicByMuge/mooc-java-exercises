import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner sc;
    private boolean isRunning = true;

    public UserInterface(JokeManager joke, Scanner sc) {
        this.jokes = joke;
        this.sc = sc;
    }

    public void start() {
        while (isRunning) {
            System.out.println("Commands:\n" +
                    "1 - add a joke\n" +
                    "2 - draw a joke\n" +
                    "3 - list jokes\n" +
                    "x - stop");
            String command = sc.nextLine();

            switch(command) {
                case "1":
                    System.out.print("Write the joke to be added: ");
                    String joke = sc.nextLine();
                    jokes.addJoke(joke);
                    break;
                case "2":
                    System.out.println(jokes.drawJokes());
                    break;
                case "3":
                    jokes.printJokes();
                    break;
                case "x":
                    isRunning = false;
                    break;
            }
        }
    }
}
