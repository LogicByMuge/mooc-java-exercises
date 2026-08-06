package SimpleDictionary;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextUI ui = new TextUI(sc);

        ui.start();
    }
}