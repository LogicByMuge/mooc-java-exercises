package RecipeSearch;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {
    private Scanner sc;
    private boolean isRunning = true;
    private ArrayList<Recipe> recipe;

    public UI(Scanner sc) {
        this.sc = sc;
        recipe = new ArrayList<>();
    }

    public void start() {
        System.out.println("File to read:");
        String file = sc.nextLine();

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stop the program");

        try(Scanner scanner = new Scanner(Paths.get(file))) {
            readFile(scanner);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

            while(isRunning) {
                System.out.println("Enter command: ");
                String command = sc.nextLine().toLowerCase();

                switch (command) {
                    case "list":
                        list();
                        break;
                    case "stop":
                        isRunning = false;
                        break;
                }
            }
    }

    public void readFile(Scanner scanner) {

        // get name and cooking time
        while(scanner.hasNextLine()) {
            String name = scanner.nextLine();
            if(name.isEmpty()) {
                continue;
            }
            int time = Integer.parseInt(scanner.nextLine());

            // get ingredients
            ArrayList<String> ingredients = new ArrayList<>();
            while(scanner.hasNextLine()) {
                String ingredient = scanner.nextLine();
                if(ingredient.isEmpty()) {
                    break;
                }
                ingredients.add(ingredient);
            }

            recipe.add(new Recipe(name,time,ingredients));
        }
    }

    public void list() {
        for(int i = 0; i < recipe.size(); i++) {
            System.out.println(recipe.get(i));
        }
    }
}
