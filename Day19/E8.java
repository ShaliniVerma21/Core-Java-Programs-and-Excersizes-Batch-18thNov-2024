package Day19;
//After Refactoring:
public class E8 {
	    private String accountNumber;
	    private double balance;

	    // Constructor
	    public E8(String accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0.0; // Initial balance
	    }

	    // Getter for accountNumber
	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    // Getter for balance
	    public double getBalance() {
	        return balance;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    // Method to withdraw money
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient funds or invalid amount.");
	        }
	    }
	}