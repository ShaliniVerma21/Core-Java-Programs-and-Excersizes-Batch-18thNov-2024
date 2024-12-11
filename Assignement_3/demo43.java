package Assignement_3;
//Personal Expense Tracker 📊: Track daily expenses and budgets.

//Abstract class representing a Transaction
abstract class Transaction {
 protected String date;
 protected double amount;

 // Constructor
 public Transaction(String date, double amount) {
     this.date = date;
     this.amount = amount;
 }

 // Abstract method to display transaction details
 public abstract void displayDetails();
}

//Concrete class representing an Expense
class Expense extends Transaction {
 private String category;

 // Constructor
 public Expense(String date, double amount, String category) {
     super(date, amount);
     this.category = category;
 }

 // Method to display expense details
 @Override
 public void displayDetails() {
     System.out.println("Expense Date: " + date);
     System.out.println("Amount: $" + amount);
     System.out.println("Category: " + category);
 }
}

//Concrete class representing a Budget
class Budget extends Transaction {
 private String description;

 // Constructor
 public Budget(String date, double amount, String description) {
     super(date, amount);
     this.description = description;
 }

 // Method to display budget details
 @Override
 public void displayDetails() {
     System.out.println("Budget Date: " + date);
     System.out.println("Amount: $" + amount);
     System.out.println("Description: " + description);
 }
}

//Class representing the Expense Tracker
class ExpenseTracker {
 private Transaction[] transactions;
 private int transactionCount;

 // Constructor
 public ExpenseTracker(int capacity) {
     transactions = new Transaction[capacity];
     transactionCount = 0;
 }

 // Method to add a transaction
 public void addTransaction(Transaction transaction) {
     if (transactionCount < transactions.length) {
         transactions[transactionCount] = transaction;
         transactionCount++;
         System.out.println("Transaction added.");
     } else {
         System.out.println("Transaction list is full. Cannot add more transactions.");
     }
 }

 // Method to display all transactions
 public void displayTransactions() {
     System.out.println("All Transactions:");
     for (Transaction transaction : transactions) {
         if (transaction != null) {
             transaction.displayDetails();
             System.out.println();
         }
     }
 }

 // Method to calculate total expenses
 public double calculateTotalExpenses() {
     double total = 0;
     for (Transaction transaction : transactions) {
         if (transaction instanceof Expense) {
             total += transaction.amount;
         }
     }
     return total;
 }

 // Method to calculate total budget
 public double calculateTotalBudget() {
     double total = 0;
     for (Transaction transaction : transactions) {
         if (transaction instanceof Budget) {
             total += transaction.amount;
         }
     }
     return total;
 }
}

//Main class to manage the personal expense tracker
public class demo43 {
 public static void main(String[] args) {
     // Create an instance of the expense tracker
     ExpenseTracker tracker = new ExpenseTracker(10); // Capacity for 10 transactions

     // Create expenses
     Transaction expense1 = new Expense("2023-10-01", 50.00, "Groceries");
     Transaction expense2 = new Expense("2023-10-02", 20.00, "Transport");

     // Create budgets
     Transaction budget1 = new Budget("2023-10-01", 200.00, "Monthly Budget");
     Transaction budget2 = new Budget("2023-10-02", 100.00, "Transport Budget");

     // Add transactions to the tracker
     tracker.addTransaction(expense1);
     tracker.addTransaction(expense2);
     tracker.addTransaction(budget1);
     tracker.addTransaction(budget2);

     // Display all transactions
     tracker.displayTransactions();

     // Calculate and display total expenses and budgets
     System.out.println("Total Expenses: $" + tracker.calculateTotalExpenses());
     System.out.println("Total Budgets: $" + tracker.calculateTotalBudget());
 }
}