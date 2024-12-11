package Assignement_3;
//Digital Wallet Application 💰: Manage funds, transactions, and transfers.

//Abstract class representing a User
abstract class User {
 protected String name;
 protected String email;

 // Constructor
 public User(String name, String email) {
     this.name = name;
     this.email = email;
 }

 // Abstract method to display user details
 public abstract void displayDetails();
}

//Concrete class representing a Wallet User
class WalletUser  extends User {
 private double balance;
 private String walletId;

 // Constructor
 public WalletUser (String name, String email, String walletId) {
     super(name, email);
     this.balance = 0.0; // Initial balance
     this.walletId = walletId;
 }

 // Method to display user details
 @Override
 public void displayDetails() {
     System.out.println("Wallet ID: " + walletId);
     System.out.println("Name: " + name);
     System.out.println("Email: " + email);
     System.out.println("Balance: $" + balance);
 }

 // Method to add funds to the wallet
 public void addFunds(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Added $" + amount + " to wallet ID: " + walletId);
     } else {
         System.out.println("Invalid amount. Cannot add funds.");
     }
 }

 // Method to make a transaction
 public void makeTransaction(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Transaction of $" + amount + " made from wallet ID: " + walletId);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Method to transfer funds to another wallet
 public void transferFunds(WalletUser  recipient, double amount) {
     if (recipient != null && amount > 0 && amount <= balance) {
         this.makeTransaction(amount);
         recipient.addFunds(amount);
         System.out.println("Transferred $" + amount + " to wallet ID: " + recipient.walletId);
     } else {
         System.out.println("Transfer failed. Check recipient and amount.");
     }
 }
}

//Class representing the Digital Wallet Application
class DigitalWalletApplication {
 private WalletUser [] users;
 private int userCount;

 // Constructor
 public DigitalWalletApplication(int capacity) {
     users = new WalletUser [capacity];
     userCount = 0;
 }

 // Method to add a user
 public void addUser (WalletUser  user) {
     if (userCount < users.length) {
         users[userCount] = user;
         System.out.println("User  added: " + user.name);
         userCount++;
     } else {
         System.out.println("User  list is full. Cannot add more users.");
     }
 }

 // Method to display all users
 public void displayUsers() {
     System.out.println("Users in the Digital Wallet Application:");
     for (int i = 0; i < userCount; i++) {
         users[i].displayDetails();
         System.out.println();
     }
 }
}

//Main class to manage the digital wallet application
public class demo48 {
 public static void main(String[] args) {
     // Create an instance of the digital wallet application
     DigitalWalletApplication walletApp = new DigitalWalletApplication(5); // 5 users

     // Create wallet users
     WalletUser  user1 = new WalletUser ("Alice", "alice@example.com", "WALLET001");
     WalletUser  user2 = new WalletUser ("Bob", "bob@example.com", "WALLET002");

     // Add users to the application
     walletApp.addUser (user1);
     walletApp.addUser (user2);

     // Display all users
     walletApp.displayUsers();

     // Add funds to user1's wallet
     user1.addFunds(100.00);

     // Make a transaction from user1's wallet
     user1.makeTransaction(30.00);

     // Transfer funds from user1 to user2
     user1.transferFunds(user2, 50.00);

     // Display updated user details
     walletApp.displayUsers();
 }
}