package Day25;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Scanner;
//ArrayDequeue
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class C14 {

    public static void main(String[] args) {
        // Create a Deque to manage books
        Deque<Book> bookDeque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book to Front");
            System.out.println("2. Add Book to Back");
            System.out.println("3. View All Books");
            System.out.println("4. Remove Book from Front");
            System.out.println("5. Remove Book from Back");
            System.out.println("6. Search Book");
            System.out.println("7. Sort Books");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new book to the front
                    addBookToFront(bookDeque, scanner);
                    break;

                case 2:
                    // Add a new book to the back
                    addBookToBack(bookDeque, scanner);
                    break;

                case 3:
                    // View all books
                    viewBooks(bookDeque);
                    break;

                case 4:
                    // Remove a book from the front
                    removeBookFromFront(bookDeque);
                    break;

                case 5:
                    // Remove a book from the back
                    removeBookFromBack(bookDeque);
                    break;

                case 6:
                    // Search for a specific book
                    searchBook(bookDeque, scanner);
                    break;

                case 7:
                    // Sort books
                    sortBooks(bookDeque);
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

    // Method to add a book to the front of the deque
    private static void addBookToFront(Deque<Book> bookDeque, Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        bookDeque.addFirst(new Book(title, author));
        System.out.println("Book added to the front: " + title);
    }

    // Method to add a book to the back of the deque
    private static void addBookToBack(Deque<Book> bookDeque, Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        bookDeque.addLast(new Book(title, author));
        System.out.println("Book added to the back: " + title);
    }

    // Method to view all books in the deque
    private static void viewBooks(Deque<Book> bookDeque) {
        if (bookDeque.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Current Books:");
            for (Book book : bookDeque) {
                System.out.println(book);
            }
        }
    }

    // Method to remove a book from the front of the deque
    private static void removeBookFromFront(Deque<Book> bookDeque) {
        if (!bookDeque.isEmpty()) {
            Book removedBook = bookDeque.removeFirst();
            System.out.println("Removed book from front: " + removedBook);
        } else {
            System.out.println("No books to remove from the front.");
        }
    }

    // Method to remove a book from the back of the deque
    private static void removeBookFromBack(Deque<Book> bookDeque) {
        if (!bookDeque.isEmpty()) {
            Book removedBook = bookDeque.removeLast();
            System.out.println("Removed book from back: " + removedBook);
        } else {
            System.out.println(" No books to remove from the back.");
        }
    }

    // Method to search for a specific book
    private static void searchBook(Deque<Book> bookDeque, Scanner scanner) {
        System.out.print("Enter book title to search for: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;
        for (Book book : bookDeque) {
            if (book.title.equalsIgnoreCase(searchTitle)) {
                System.out.println("Book found: " + book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found: " + searchTitle);
        }
    }

    // Method to sort books by title
    private static void sortBooks(Deque<Book> bookDeque) {
        ArrayList<Book> bookList = new ArrayList<>(bookDeque);
        Collections.sort(bookList, Comparator.comparing(b -> b.title));
        System.out.println("Books sorted by title:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}