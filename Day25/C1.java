package Day25;
//ArrayList
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C1 {
    // Main method to run the program
    public static void main(String[] args) {
        // Create an ArrayList to store fruit names
        ArrayList<String> fruitList = new ArrayList<>();

        // Initialize the list with some fruit names
        initializeList(fruitList);

        // Display the initial list of fruits
        displayList(fruitList);

        // Perform CRUD operations
        performCRUDOperations(fruitList);

        // Search for a specific fruit
        searchFruit(fruitList);

        // Sort the list of fruits
        sortFruits(fruitList);

        // Clear the list
        clearList(fruitList);
    }

    // Method to initialize the fruit list with default values
    private static void initializeList(ArrayList<String> list) {
        Collections.addAll(list, "Apples", "Grapes", "Orange", "Papaya", "Guava", "Apples", "Grapes", "Orange");
    }

    // Method to display the list of fruits
    private static void displayList(ArrayList<String> list) {
        System.out.println("Fruits List: " + list);
    }

    // Method to perform CRUD operations
    private static void performCRUDOperations(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPerforming CRUD Operations:");

        // Create: Add a new fruit
        System.out.print("Enter a fruit to add: ");
        String newFruit = scanner.nextLine();
        list.add(newFruit);
        System.out.println("Added: " + newFruit);
        displayList(list);

        // Read: Get the first fruit
        System.out.println("First fruit in the list: " + list.get(0));

        // Update: Change the first fruit
        System.out.print("Enter a new name for the first fruit: ");
        String updatedFruit = scanner.nextLine();
        list.set(0, updatedFruit);
        System.out.println("Updated first fruit to: " + updatedFruit);
        displayList(list);

        // Delete: Remove the first fruit
        list.remove(0);
        System.out.println("Removed the first fruit.");
        displayList(list);
    }

    // Method to search for a specific fruit
    private static void searchFruit(ArrayList<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a fruit to search for: ");
        String searchFruit = scanner.nextLine();
        if (list.contains(searchFruit)) {
            System.out.println(searchFruit + " is in the list.");
        } else {
            System.out.println(searchFruit + " is not in the list.");
        }
    }

    // Method to sort the list of fruits
    private static void sortFruits(ArrayList<String> list) {
        Collections.sort(list);
        System.out.println("Sorted Fruits List: " + list);
        System.out.println("Max Fruit: " + Collections.max(list));
        System.out.println("Min Fruit: " + Collections.min(list));
    }

    // Method to clear the list
    private static void clearList(ArrayList<String> list) {
        list.clear();
        System.out.println("Cleared the list. Current list: " + list);
    }

    // Method to traverse the list and display each fruit
    private static void traverseList(ArrayList<String> list) {
        System.out.println("\nTraversing the list:");
        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}