package Day25;
//HashMap

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C4 {

    public static void main(String[] args) {
        // Create a HashMap to manage books in the library
        HashMap<String, String> library = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Update Book");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new book
                    addBook(library, scanner);
                    break;

                case 2:
                    // View all books
                    viewBooks(library);
                    break;

                case 3:
                    // Search for a specific book
                    searchBook(library, scanner);
                    break;

                case 4:
                    // Remove a book
                    removeBook(library, scanner);
                    break;

                case 5:
                    // Update book information
                    updateBook(library, scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add a book to the library
    private static void addBook(HashMap<String, String> library, Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter author name: ");
        String author = scanner.nextLine();
        library.put(title, author);
        System.out.println("Book added: " + title + " by " + author);
    }

    // Method to view all books in the library
    private static void viewBooks(HashMap<String, String> library) {
        if (library.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Current Books in the Library:");
            for (Map.Entry<String, String> entry : library.entrySet()) {
                System.out.println("Title: " + entry.getKey() + ", Author: " + entry.getValue());
            }
        }
    }

    // Method to search for a specific book
    private static void searchBook(HashMap<String, String> library, Scanner scanner) {
        System.out.print("Enter book title to search for: ");
        String searchTitle = scanner.nextLine();
        if (library.containsKey(searchTitle)) {
            System.out.println("Book found: " + searchTitle + " by " + library.get(searchTitle));
        } else {
            System.out.println("Book not found: " + searchTitle);
        }
    }

    // Method to remove a book from the library
    private static void removeBook(HashMap<String, String> library, Scanner scanner) {
        System.out.print("Enter book title to remove: ");
        String removeTitle = scanner.nextLine();
        if (library.remove(removeTitle) != null) {
            System.out.println("Book removed: " + removeTitle);
        } else {
            System.out.println("Book not found: " + removeTitle);
        }
    }

    // Method to update book information
    private static void updateBook(HashMap<String, String> library, Scanner scanner) {
        System.out.print("Enter book title to update: ");
        String updateTitle = scanner.nextLine();
        if (library.containsKey(updateTitle)) {
            System.out.print("Enter new author name: ");
            String newAuthor = scanner.nextLine();
            library.put(updateTitle, newAuthor);
            System.out.println("Book updated: " + updateTitle + " by " + newAuthor);
        } else {
            System.out.println("Book not found: " + updateTitle);
        }
    }
}