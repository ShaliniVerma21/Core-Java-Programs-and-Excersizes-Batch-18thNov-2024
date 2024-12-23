package Day19;
//Example 2: Encapsulation with Validation

class BankAccount {
    private double balance;

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
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class E2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);
        System.out.println("Current Balance: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());
    }
}