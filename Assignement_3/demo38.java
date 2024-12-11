package Assignement_3;
//Student Library Fee Calculator 💵: Calculate overdue charges and generate invoices.

//Abstract class representing a LibraryItem
abstract class LibraryItem {
 protected String title;
 protected int daysOverdue;

 // Constructor
 public LibraryItem(String title, int daysOverdue) {
     this.title = title;
     this.daysOverdue = daysOverdue;
 }

 // Abstract method to calculate overdue charges
 public abstract double calculateOverdueCharges();

 // Method to display item details
 public void displayDetails() {
     System.out.println("Title: " + title);
     System.out.println("Days Overdue: " + daysOverdue);
     System.out.println("Overdue Charges: $" + calculateOverdueCharges());
 }
}

//Concrete class representing a Book1
class Book1 extends LibraryItem {
 private static final double DAILY_FINE = 0.50; // Fine per day for Book1s

 // Constructor
 public Book1(String title, int daysOverdue) {
     super(title, daysOverdue);
 }

 // Method to calculate overdue charges
 @Override
 public double calculateOverdueCharges() {
     return daysOverdue * DAILY_FINE;
 }
}

//Concrete class representing a DVD
class DVD extends LibraryItem {
 private static final double DAILY_FINE = 1.00; // Fine per day for DVDs

 // Constructor
 public DVD(String title, int daysOverdue) {
     super(title, daysOverdue);
 }

 // Method to calculate overdue charges
 @Override
 public double calculateOverdueCharges() {
     return daysOverdue * DAILY_FINE;
 }
}

//Class representing the Library
class Library {
 private LibraryItem[] items;
 private int itemCount;

 // Constructor
 public Library(int capacity) {
     items = new LibraryItem[capacity];
     itemCount = 0;
 }

 // Method to add a library item
 public void addItem(LibraryItem item) {
     if (itemCount < items.length) {
         items[itemCount] = item;
         itemCount++;
         System.out.println("Item added: " + item.title);
     } else {
         System.out.println("Library is full. Cannot add more items.");
     }
 }

 // Method to display all items and their charges
 public void displayAllItems() {
     System.out.println("Library Items:");
     for (int i = 0; i < itemCount; i++) {
         items[i].displayDetails();
         System.out.println();
     }
 }
}

//Main class to manage the Student Library Fee Calculator
public class demo38 {
 public static void main(String[] args) {
     // Create a Library with a capacity of 5 items
     Library library = new Library(5);

     // Create library items
     LibraryItem Book11 = new Book1("Java Programming", 3);
     LibraryItem dvd1 = new DVD("Inception", 2);
     LibraryItem Book12 = new Book1("Data Structures", 5);
     LibraryItem dvd2 = new DVD("The Matrix", 1);

     // Add items to the Library
     library.addItem(Book11);
     library.addItem(dvd1);
     library.addItem(Book12);
     library.addItem(dvd2);

     // Display all items and their overdue charges
     library.displayAllItems();
 }
}