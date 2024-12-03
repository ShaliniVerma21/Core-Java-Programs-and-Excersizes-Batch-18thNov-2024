package Excersize_7;
import java.util.Scanner;
public class Examp5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Fixed size for the library
        final int MAX_BOOKS = 5;
        String[] titles = new String[MAX_BOOKS];
        String[] authors = new String[MAX_BOOKS];
        boolean[] isAvailable = new boolean[MAX_BOOKS];
        int bookCount = 0; // To keep track of the number of books
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add a new book");
            System.out.println("2. View all available books");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1: // Add a new book
                    if (bookCount < MAX_BOOKS) {
                        System.out.print("Enter book title: ");
                        titles[bookCount] = scanner.nextLine();
                        System.out.print("Enter book author: ");
                        authors[bookCount] = scanner.nextLine();
                        isAvailable[bookCount] = true; // Book is available
                        bookCount++;
                        System.out.println("Book added successfully!");
                    } else {
                        System.out.println("Library is full! Cannot add more books.");
                    }
                    break;

                case 2: // View all available books
                    System.out.println("\nAvailable Books:");
                    for (int i = 0; i < bookCount; i++) {
                        if (isAvailable[i]) {
                            System.out.println("Title: " + titles[i] + ", Author: " + authors[i]);
                        }
                    }
                    break;

                case 3: // Borrow a book
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    boolean foundToBorrow = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (titles[i].equalsIgnoreCase(borrowTitle) && isAvailable[i]) {
                            isAvailable[i] = false; // Mark book as borrowed
                            System.out.println("You have borrowed: " + titles[i]);
                            foundToBorrow = true;
                            break;
                        }
                    }
                    if (!foundToBorrow) {
                        System.out.println("Book not found or already borrowed.");
                    }
                    break;

                case 4: // Return a book
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    boolean foundToReturn = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (titles[i].equalsIgnoreCase(returnTitle) && !isAvailable[i]) {
                            isAvailable[i] = true; // Mark book as available
                            System.out.println("You have returned: " + titles[i]);
                            foundToReturn = true;
                            break;
                        }
                    }
                    if (!foundToReturn) {
                        System.out.println("Book not found or was not borrowed.");
                    }
                    break;

                case 5: // Exit
                    exit = true;
                    System.out.println("Thank you for using the Library Management System. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close(); // Close the scanner
    }
}