package RecipeSearch;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner sc;
    private boolean isRunning = true;
    private RecipeFileReader fileReader;
    private RecipeManager recipeManager;

    public UI(Scanner sc) {
        this.sc = sc;
        this.fileReader = new RecipeFileReader();
    }

    public void start() throws IOException {
        System.out.println("File to read:");
        String file = sc.nextLine();

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stop the program\n" +
                "find name - searches recipes by name");

        this.recipeManager = new RecipeManager(fileReader.readFromFile(file));

            while(isRunning) {
                System.out.println("Enter command: ");
                String command = sc.nextLine().toLowerCase();

                switch (command) {
                    case "list":
                        recipeManager.listRecipes();
                        break;
                    case "stop":
                        isRunning = false;
                        break;
                    case "find name":
                        break;
                    default:
                        System.out.println("Invalid command");
                        break;
                }
            }
    }
}
