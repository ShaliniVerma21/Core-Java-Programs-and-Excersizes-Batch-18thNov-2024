package Assignement_3;
//Recipe Sharing Network 🍴: User1s share and discover recipes.

import java.util.Scanner;

// Interface for Recipe Operations
interface RecipeOperations {
    void addRecipe(String title, String ingredients, String instructions);
    void displayRecipes();
}

// Abstract class for User1
abstract class User1 {
    protected String User1name;

    public User1(String User1name) {
        this.User1name = User1name;
    }

    public abstract void displayInfo();
}

// Concrete class for RecipeUser1 
class RecipeUser1  extends User1 implements RecipeOperations {
    private String[] recipeTitles;
    private String[] recipeIngredients;
    private String[] recipeInstructions;
    private int recipeCount;

    public RecipeUser1 (String User1name) {
        super(User1name);
        this.recipeTitles = new String[10]; // Maximum 10 recipes
        this.recipeIngredients = new String[10];
        this.recipeInstructions = new String[10];
        this.recipeCount = 0;
    }

    @Override
    public void addRecipe(String title, String ingredients, String instructions) {
        if (recipeCount < recipeTitles.length) {
            recipeTitles[recipeCount] = title;
            recipeIngredients[recipeCount] = ingredients;
            recipeInstructions[recipeCount] = instructions;
            System.out.println("Recipe added: " + title);
            recipeCount++;
        } else {
            System.out.println("Recipe limit reached.");
        }
    }

    @Override
    public void displayRecipes() {
        System.out.println("Recipes by " + User1name + ":");
        for (int i = 0; i < recipeCount; i++) {
            System.out.println("Title: " + recipeTitles[i]);
            System.out.println("Ingredients: " + recipeIngredients[i]);
            System.out.println("Instructions: " + recipeInstructions[i]);
            System.out.println();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println(":User1  " + User1name);
    }
}

// Main class
public class demo23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a RecipeUser1 
        System.out.print("Enter your User1name: ");
        String User1name = scanner.nextLine();

        RecipeUser1  User1 = new RecipeUser1 (User1name);

        // Add recipes
        User1.addRecipe("Pasta", "Pasta, Tomato Sauce, Cheese", "Boil pasta, add sauce, top with cheese.");
        User1.addRecipe("Salad", "Lettuce, Tomato, Cucumber", "Chop ingredients and mix.");

        // Display User1 info and recipes
        User1.displayInfo();
        User1.displayRecipes();

        scanner.close();
    }
}