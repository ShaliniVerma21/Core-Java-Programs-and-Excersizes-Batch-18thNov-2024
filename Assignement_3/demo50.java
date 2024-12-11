package Assignement_3;
//Library Management System 📚: Manage book inventory, issue, and return logs.

//Abstract class representing a Book
abstract class Book {
 protected String title;
 protected String author;
 protected String isbn;
 protected boolean isIssued;

 // Constructor
 public Book(String title, String author, String isbn) {
     this.title = title;
     this.author = author;
     this.isbn = isbn;
     this.isIssued = false; // Initially, the book is not issued
 }

 // Abstract method to display book details
 public abstract void displayDetails();

 // Method to issue the book
 public void issueBook() {
     if (!isIssued) {
         isIssued = true;
         System.out.println("Book issued: " + title);
     } else {
         System.out.println("Book is already issued: " + title);
     }
 }

 // Method to return the book
 public void returnBook() {
     if (isIssued) {
         isIssued = false;
         System.out.println("Book returned: " + title);
     } else {
         System.out.println("Book was not issued: " + title);
     }
 }
}

//Concrete class representing a Fiction Book
class FictionBook extends Book {
 private String genre;

 // Constructor
 public FictionBook(String title, String author, String isbn, String genre) {
     super(title, author, isbn);
     this.genre = genre;
 }

 // Method to display book details
 @Override
 public void displayDetails() {
     System.out.println("Fiction Book:");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("ISBN: " + isbn);
     System.out.println("Genre: " + genre);
     System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
 }
}

//Concrete class representing a Non-Fiction Book
class NonFictionBook extends Book {
 private String subject;

 // Constructor
 public NonFictionBook(String title, String author, String isbn, String subject) {
     super(title, author, isbn);
     this.subject = subject;
 }

 // Method to display book details
 @Override
 public void displayDetails() {
     System.out.println("Non-Fiction Book:");
     System.out.println("Title: " + title);
     System.out.println("Author: " + author);
     System.out.println("ISBN: " + isbn);
     System.out.println("Subject: " + subject);
     System.out.println("Issued: " + (isIssued ? "Yes" : "No"));
 }
}

//Class representing the Library Management System
class LibraryManagementSystem {
 private Book[] books;
 private int bookCount;

 // Constructor
 public LibraryManagementSystem(int capacity) {
     books = new Book[capacity];
     bookCount = 0;
 }

 // Method to add a book
 public void addBook(Book book) {
     if (bookCount < books.length) {
         books[bookCount] = book;
         System.out.println("Book added: " + book.title);
         bookCount++;
     } else {
         System.out.println("Library is full. Cannot add more books.");
     }
 }

 // Method to display all books
 public void displayBooks() {
     System.out.println("Library Inventory:");
     for (int i = 0; i < bookCount; i++) {
         books[i].displayDetails();
         System.out.println();
     }
 }

 // Method to issue a book by title
 public void issueBook(String title) {
     for (int i = 0; i < bookCount; i++) {
         if (books[i].title.equalsIgnoreCase(title)) {
             books[i].issueBook();
             return;
         }
     }
     System.out.println("Book not found: " + title);
 }

 // Method to return a book by title
 public void returnBook(String title) {
     for (int i = 0; i < bookCount; i++) {
         if (books[i].title.equalsIgnoreCase(title)) {
             books[i].returnBook();
             return;
         }
     }
     System.out.println("Book not found: " + title);
 }
}

//Main class to manage the library system
public class demo50 {
 public static void main(String[] args) {
     // Create an instance of the library management system
     LibraryManagementSystem library = new LibraryManagementSystem(5);

     // Add books to the library
     library.addBook(new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "978074327356 5", "Classic"));
     library.addBook(new NonFictionBook("Sapiens", "Yuval Noah Harari", "9780062316097", "History"));
     library.addBook(new FictionBook("1984", "George Orwell", "9780451524935", "Dystopian"));

     // Display all books in the library
     library.displayBooks();

     // Issue a book
     library.issueBook("1984");

     // Attempt to issue the same book again
     library.issueBook("1984");

     // Return the book
     library.returnBook("1984");

     // Attempt to return the book again
     library.returnBook("1984");

     // Display all books after issuing and returning
     library.displayBooks();
 }
}