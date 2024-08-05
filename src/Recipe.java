// Recipe class
class Recipe {
    // Method to prepare ingredients
    public void getReady() {
        System.out.println("Getting all the ingredients ready.");
    }

    // Method to cook the dish
    public void doTheDish() {
        System.out.println("Cooking the dish.");
    }

    // Method to clean up after cooking
    public void cleanup() {
        System.out.println("Cleaning up the kitchen.");
    }
}

// MicroOven class to cook the recipe
class MicroOven {
    // Method to cook a recipe using the MicroOven
    public void cookRecipe(Recipe recipe) {
        recipe.getReady();
        recipe.doTheDish();
        recipe.cleanup();
    }

    public static void main(String[] args) {
        // Create an instance of Recipe
        Recipe myRecipe = new Recipe();

        // Create an instance of MicroOven
        MicroOven oven = new MicroOven();

        // Cook the recipe
        oven.cookRecipe(myRecipe);
    }
}
