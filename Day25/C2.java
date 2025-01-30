package Day25;
//LinkedHashSet
import java.util.LinkedHashSet;
import java.util.Scanner;

public class C2 {

    public static void main(String[] args) {
        // Create a LinkedHashSet to manage the shopping list
        LinkedHashSet<String> shoppingList = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nShopping List Management System");
            System.out.println("1. Add Item");
            System.out.println("2. View All Items");
            System.out.println("3. Search Item");
            System.out.println("4. Remove Item");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new item to the shopping list
                    addItem(shoppingList, scanner);
                    break;

                case 2:
                    // View all items in the shopping list
                    viewItems(shoppingList);
                    break;

                case 3:
                    // Search for a specific item
                    searchItem(shoppingList, scanner);
                    break;

                case 4:
                    // Remove an item from the shopping list
                    removeItem(shoppingList, scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Shopping List Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add an item to the shopping list
    private static void addItem(LinkedHashSet<String> shoppingList, Scanner scanner) {
        System.out.print("Enter item to add: ");
        String item = scanner.nextLine();
        if (shoppingList.add(item)) {
            System.out.println("Item added: " + item);
        } else {
            System.out.println("Item already exists in the shopping list.");
        }
    }

    // Method to view all items in the shopping list
    private static void viewItems(LinkedHashSet<String> shoppingList) {
        if (shoppingList.isEmpty()) {
            System.out.println("No items in the shopping list.");
        } else {
            System.out.println("Current Shopping List:");
            for (String item : shoppingList) {
                System.out.println("- " + item);
            }
        }
    }

    // Method to search for a specific item in the shopping list
    private static void searchItem(LinkedHashSet<String> shoppingList, Scanner scanner) {
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (shoppingList.contains(searchItem)) {
            System.out.println("Item found: " + searchItem);
        } else {
            System.out.println("Item not found: " + searchItem);
        }
    }

    // Method to remove an item from the shopping list
    private static void removeItem(LinkedHashSet<String> shoppingList, Scanner scanner) {
        System.out.print("Enter item to remove: ");
        String removeItem = scanner.nextLine();
        if (shoppingList.remove(removeItem)) {
            System.out.println("Item removed: " + removeItem);
        } else {
            System.out.println("Item not found: " + removeItem);
        }
    }
}