package Excersize_9;
//Bank Account
class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Example usage
public class Main23 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Raj", "1234567890", 10000.0);
        account.deposit(5000);
        account.withdraw(2000);
        System.out.println("Current Balance: " + account.getBalance());
    }
}