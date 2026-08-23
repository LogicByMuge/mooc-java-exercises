package RecipeSearch;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeFileReader {
    public ArrayList<Recipe> readFromFile(String file) throws IOException {
        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            // get name and cooking time
            while (scanner.hasNextLine()) {
                String name = scanner.nextLine();
                if (name.isEmpty()) {
                    continue;
                }
                int time = Integer.parseInt(scanner.nextLine());

                // get ingredients
                ArrayList<String> ingredients = new ArrayList<>();
                while (scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }

                recipes.add(new Recipe(name, time, ingredients));
            }
        }
        return recipes;
    }
}
