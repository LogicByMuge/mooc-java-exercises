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
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");

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
                        System.out.print("Searched word: ");
                        String name = sc.nextLine();
                        recipeManager.findRecipeByName(name);
                        break;
                    case "find cooking time":
                        System.out.print("Max cooking time: ");
                        int time = Integer.parseInt(sc.nextLine());
                        recipeManager.findRecipeByCookingTime(time);
                        break;
                    case "find ingredient":
                        System.out.print("Ingredient: ");
                        String ingredient = sc.nextLine();
                        recipeManager.findRecipeByIngredient(ingredient);
                        break;
                    default:
                        System.out.println("Invalid command");
                        break;
                }
            }
    }
}
