package Assignement_3;
//Banking System 💳: Customer accounts, transfers, and balance tracking.

//Abstract class representing a Bank Account
abstract class BankAccount {
 protected String accountNumber;
 protected String accountHolderName;
 protected double balance;

 // Constructor
 public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
     this.accountNumber = accountNumber;
     this.accountHolderName = accountHolderName;
     this.balance = initialBalance;
 }

 // Abstract method to display account details
 public abstract void displayAccountDetails();

 // Method to deposit money
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited: $" + amount);
     } else {
         System.out.println("Deposit amount must be positive.");
     }
 }

 // Method to withdraw money
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else {
         System.out.println("Insufficient balance or invalid amount.");
     }
 }

 // Method to get the current balance
 public double getBalance() {
     return balance;
 }

public void applyInterest() {
	// TODO Auto-generated method stub
	
}
}

//Concrete class representing a Savings Account
class SavingsAccount extends BankAccount {
 private double interestRate;

 // Constructor
 public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance, double interestRate) {
     super(accountNumber, accountHolderName, initialBalance);
     this.interestRate = interestRate;
 }

 // Method to apply interest
 public void applyInterest() {
     double interest = balance * interestRate / 100;
     deposit(interest);
     System.out.println("Interest applied: $" + interest);
 }

 // Method to display account details
 @Override
 public void displayAccountDetails() {
     System.out.println("Savings Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Balance: $" + balance);
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}

//Concrete class representing a Checking Account
class CheckingAccount extends BankAccount {
 private double overdraftLimit;

 // Constructor
 public CheckingAccount(String accountNumber, String accountHolderName, double initialBalance, double overdraftLimit) {
     super(accountNumber, accountHolderName, initialBalance);
     this.overdraftLimit = overdraftLimit;
 }

 // Method to withdraw money with overdraft
 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= (balance + overdraftLimit)) {
         balance -= amount;
         System.out.println("Withdrew: $" + amount);
     } else {
         System.out.println("Overdraft limit exceeded or invalid amount.");
     }
 }

 // Method to display account details
 @Override
 public void displayAccountDetails() {
     System.out.println("Checking Account Number: " + accountNumber);
     System.out.println("Account Holder: " + accountHolderName);
     System.out.println("Balance: $" + balance);
     System.out.println("Overdraft Limit: $" + overdraftLimit);
 }
}

//Class representing the Banking System
class BankingSystem {
 private BankAccount[] accounts;
 private int accountCount;

 // Constructor
 public BankingSystem(int capacity) {
     accounts = new BankAccount[capacity];
     accountCount = 0;
 }

 // Method to add an account
 public void addAccount(BankAccount account) {
     if (accountCount < accounts.length) {
         accounts[accountCount] = account;
         accountCount++;
         System.out.println("Account added: " + account.accountHolderName);
     } else {
         System.out.println("Account list is full. Cannot add more accounts.");
     }
 }

 // Method to display all accounts
 public void displayAccounts() {
     System.out.println("Bank Accounts:");
     for (BankAccount account : accounts) {
         if (account != null) {
             account.displayAccountDetails();
             System.out.println();
         }
     }
 }

 // Method to transfer money between accounts
 public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
     BankAccount fromAccount = null;
     BankAccount toAccount = null;

     // Find the accounts
     for (BankAccount account : accounts) {
         if (account != null) {
             if (account.accountNumber.equals(fromAccountNumber)) {
                 fromAccount = account;
             }
             if (account.accountNumber.equals(toAccountNumber)) {
                 toAccount = account;
             }
         }
     }

     // Perform the transfer if both accounts are found
     if (fromAccount != null && toAccount != null) {
         fromAccount.withdraw(amount);
         toAccount.deposit(amount);
         System.out.println("Transferred: $" + amount + " from " + fromAccountNumber + " to " + toAccountNumber);
     } else {
         System.out.println("Transfer failed: One or both account numbers are invalid.");
     }
 }
}

//Main class to manage the banking system
public class demo41 {
 public static void main(String[] args) {
     // Create an instance of the banking system
     BankingSystem bankingSystem = new BankingSystem(5);

     // Create customer accounts
     BankAccount savingsAccount = new SavingsAccount("SA123", "Alice", 1000.0, 5.0);
     BankAccount checkingAccount = new CheckingAccount("CA456", "Bob", 500.0, 200.0);

     // Add accounts to the banking system
     bankingSystem.addAccount(savingsAccount);
     bankingSystem.addAccount(checkingAccount);

     // Display all accounts
     bankingSystem.displayAccounts();

     // Perform some transactions
     savingsAccount.deposit(200);
     checkingAccount.withdraw(100);
     savingsAccount.applyInterest();

     // Transfer money between accounts
     bankingSystem.transfer("SA123", "CA456", 150);
     
     // Display updated account details
     bankingSystem.displayAccounts();
 }
}