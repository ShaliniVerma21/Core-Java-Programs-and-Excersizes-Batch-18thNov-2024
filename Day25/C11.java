package Day25;
//Vector
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class C11 {

    public static void main(String[] args) {
        // Create a Vector to store user names
        Vector<String> userList = new Vector<>();

        // Initialize the Vector with some user names
        initializeList(userList);

        // Display the initial list of users
        displayList(userList);

        // Perform CRUD operations
        performCRUDOperations(userList);

        // Search for a specific user
        searchUser (userList);

        // Sort the list of users
        sortList(userList);

        // Clear the list
        clearList(userList);
    }

    // Method to initialize the Vector with default values
    private static void initializeList(Vector<String> list) {
        Collections.addAll(list, "User -1", "User -2", "User -3", "User -4", "User -5", "User -1", "User -2", "User -3", "User -4", "User -5");
    }

    // Method to display the list of users
    private static void displayList(Vector<String> list) {
        System.out.println("User  List: " + list);
    }

    // Method to perform CRUD operations
    private static void performCRUDOperations(Vector<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPerforming CRUD Operations:");

        // Create: Add a new user
        System.out.print("Enter a new user to add: ");
        String newUser  = scanner.nextLine();
        list.add(newUser );
        System.out.println("Added: " + newUser );
        displayList(list);

        // Read: Get the first user
        System.out.println("First user in the list: " + list.get(0));

        // Update: Change the first user
        System.out.print("Enter a new name for the first user: ");
        String updatedUser  = scanner.nextLine();
        list.set(0, updatedUser );
        System.out.println("Updated first user to: " + updatedUser );
        displayList(list);

        // Delete: Remove the first user
        list.remove(0);
        System.out.println("Removed the first user.");
        displayList(list);
    }

    // Method to search for a specific user
    private static void searchUser (Vector<String> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a user to search for: ");
        String searchUser  = scanner.nextLine();
        if (list.contains(searchUser )) {
            System.out.println(searchUser  + " is in the list.");
        } else {
            System.out.println(searchUser  + " is not in the list.");
        }
    }

    // Method to sort the list of users
    private static void sortList(Vector<String> list) {
        Collections.sort(list);
        System.out.println("Sorted User List: " + list);
    }

    // Method to clear the list
    private static void clearList(Vector<String> list) {
        list.clear();
        System.out.println("Cleared the list. Current list: " + list);
    }
}