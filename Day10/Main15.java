package Day10;
//Recipe Book
class Recipe {
    private String recipeName;
    private String ingredients;
    private String instructions;

    // Constructor
    public Recipe(String recipeName, String ingredients, String instructions) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    // Method to display recipe details
    public void displayRecipeDetails() {
        System.out.println("Recipe: " + recipeName + ", Ingredients: " + ingredients + ", Instructions: " + instructions);
    }
}

// Example usage
public class Main15 {
    public static void main(String[] args) {
        Recipe recipe = new Recipe("Biryani", "Rice, Chicken, Spices", "Cook rice and chicken with spices.");
        recipe.displayRecipeDetails();
    }
}