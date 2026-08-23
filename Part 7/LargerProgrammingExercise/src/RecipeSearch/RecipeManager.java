package RecipeSearch;

import java.util.ArrayList;

public class RecipeManager {
    ArrayList<Recipe> recipes;

    public RecipeManager(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    public void listRecipes() {
        for(Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
}
