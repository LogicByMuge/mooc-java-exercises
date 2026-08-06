package SimpleDictionary;
import java.util.HashMap;
import java.util.Scanner;

public class TextUI {
    private Scanner sc;
    private HashMap<String,String> hashMap;

    public TextUI(Scanner sc) {
        this.sc = sc;
        this.hashMap = new HashMap<>();
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
                    System.out.print("Translation: ");
                    break;
                default:
                    System.out.println("Unknown Command");
                    break;
            }
        }
    }
}
