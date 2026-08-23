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

    public void findRecipeByName(String name) {
        for(int i = 0; i < recipes.size(); i++) {
            if(recipes.get(i).getName().contains(name)) {
                System.out.println(recipes.get(i));
            }
        }
    }

    public void findRecipeByCookingTime(int time) {
        for(int i = 0; i < recipes.size(); i++) {
            if(recipes.get(i).getCookingTime() <= time) {
                System.out.println(recipes.get(i));
            }
        }
    }

    public void findRecipeByIngredient(String ingredient) {
        System.out.println("Recipes: ");
        for(int i = 0; i < recipes.size(); i++) {
            if(recipes.get(i).getIngredients().contains(ingredient)) {
                System.out.println(recipes.get(i));
            }
        }
    }
}
