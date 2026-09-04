package PrintingUserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true) {
            String word = sc.nextLine();

            if(word.isEmpty()) {
                break;
            }

            words.add(word);
        }

        String combinedWords = words.stream()
                .reduce("", (previousString, word) -> previousString + word + "\n");

        System.out.println(combinedWords);
    }
}
