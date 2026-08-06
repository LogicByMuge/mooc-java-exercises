package SimpleDictionary;
import java.util.Dictionary;
import java.util.Scanner;

public class TextUI {
    private Scanner sc;
    private SimpleDictionary dictionary;

    public TextUI(Scanner sc, SimpleDictionary dictionary) {
        this.sc = sc;
        this.dictionary = dictionary;
    }

    public void start() {
        boolean isRunning = true;
        while(isRunning) {
            System.out.print("Command: ");
            String command = sc.nextLine().toLowerCase();
            switch (command) {
                case "end":
                    System.out.println("Bye bye");
                    isRunning = false;
                    break;
                case "add":
                    System.out.print("Word: ");
                    String word = sc.nextLine();
                    System.out.print("Translation: ");
                    String translation = sc.nextLine();
                    dictionary.addWord(word,translation);
                    break;
                case "search":
                    System.out.print("To be translated: ");
                    String search = sc.nextLine();
                    String searched = dictionary.translate(search);
                    if(searched == null) {
                        System.out.println("Word " + search + " was not found");
                        break;
                    }
                    System.out.println("Translation: " + searched);
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }
}
