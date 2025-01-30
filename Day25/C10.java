package Day25;
//LinkedList
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class C10 {

    public static void main(String[] args) {
        // Create a LinkedList to store integer values
        LinkedList<Integer> list = new LinkedList<>();

        // Initialize the list with some integer values
        initializeList(list);

        // Display the initial list of integers
        displayList(list);

        // Perform CRUD operations
        performCRUDOperations(list);

        // Search for a specific integer
        searchInteger(list);

        // Sort the list of integers
        sortList(list);

        // Clear the list
        clearList(list);
    }

    // Method to initialize the LinkedList with default values
    private static void initializeList(LinkedList<Integer> list) {
        Collections.addAll(list, 1, 89, 90, 56, 78, 1, 89, 90, 56, 78);
    }

    // Method to display the list of integers
    private static void displayList(LinkedList<Integer> list) {
        System.out.println("Data is: " + list);
    }

    // Method to perform CRUD operations
    private static void performCRUDOperations(LinkedList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPerforming CRUD Operations:");

        // Create: Add a new integer
        System.out.print("Enter an integer to add: ");
        int newValue = scanner.nextInt();
        list.add(newValue);
        System.out.println("Added: " + newValue);
        displayList(list);

        // Read: Get the first and last elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Update: Change the first element
        System.out.print("Enter a new value for the first element: ");
        int updatedValue = scanner.nextInt();
        list.set(0, updatedValue);
        System.out.println("Updated first element to: " + updatedValue);
        displayList(list);

        // Delete: Remove the first and last elements
        list.removeFirst();
        System.out.println("Removed the first element.");
        displayList(list);
        list.removeLast();
        System.out.println("Removed the last element.");
        displayList(list);
    }

    // Method to search for a specific integer
    private static void searchInteger(LinkedList<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search for: ");
        int searchValue = scanner.nextInt();
        if (list.contains(searchValue)) {
            System.out.println(searchValue + " is in the list.");
        } else {
            System.out.println(searchValue + " is not in the list.");
        }
    }

    // Method to sort the list of integers
    private static void sortList(LinkedList<Integer> list) {
        Collections.sort(list);
        System.out.println("Sorted List (Ascending): " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + list);
        System.out.println("Max number: " + Collections.max(list));
        System.out.println("Min number: " + Collections.min(list));
    }

    // Method to clear the list
    private static void clearList(LinkedList<Integer> list) {
        list.clear();
        System.out.println("Cleared the list. Current list: " + list);
    }
}