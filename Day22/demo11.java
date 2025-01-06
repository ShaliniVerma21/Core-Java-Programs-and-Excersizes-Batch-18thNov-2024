package Day22;

// Bank Account Transaction System
public class demo11 {
    // Main class to demonstrate bank account transaction system using multithreading

    // Inner class to represent a bank account
    class BankAccount {
        // Balance of the bank account
        private double balance;

        // Constructor to initialize the bank account balance
        public BankAccount(double balance) {
            this.balance = balance;
        }

        // Method to deposit money into the bank account
        public synchronized void deposit(double amount) {
            // Add the deposit amount to the balance
            balance += amount;
        }

        // Method to withdraw money from the bank account
        public synchronized void withdraw(double amount) {
            // Check if the balance is sufficient for withdrawal
            if (balance >= amount) {
                // Subtract the withdrawal amount from the balance
                balance -= amount;
            }
        }

        // Method to get the current balance of the bank account
        public double getBalance() {
            return balance;
        }
    }

    // Inner class to represent a transaction
    class Transaction implements Runnable {
        // Bank account involved in the transaction
        private BankAccount account;
        // Amount of the transaction
        private double amount;
        // Type of transaction (deposit or withdrawal)
        private boolean isDeposit;

        // Constructor to initialize the transaction
        public Transaction(BankAccount account, double amount, boolean isDeposit) {
            this.account = account;
            this.amount = amount;
            this.isDeposit = isDeposit;
        }

        // Method to perform the transaction
        @Override
        public void run() {
            // Perform the transaction based on the type
            if (isDeposit) {
                // Deposit money into the bank account
                account.deposit(amount);
            } else {
                // Withdraw money from the bank account
                account.withdraw(amount);
            }
        }
    }

    // Main method to demonstrate the bank account transaction system
    public static void main(String[] args) {
        // Create an instance of the demo11 class
        demo11 bankAccountSystem = new demo11();

        // Create a bank account with an initial balance
        BankAccount account = bankAccountSystem.new BankAccount(1000);

        // Create transactions for the bank account
        Transaction transaction1 = bankAccountSystem.new Transaction(account, 500, true);
        Transaction transaction2 = bankAccountSystem.new Transaction(account, 200, false);

        // Create threads for the transactions
        Thread thread1 = new Thread(transaction1);
        Thread thread2 = new Thread(transaction2);

        // Start the threads to perform the transactions
        thread1.start();
        thread2.start();

        try {
            // Wait for the threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            // If the thread is interrupted, interrupt the current thread
            Thread.currentThread().interrupt();
        }

        // Print the final balance of the bank account
        System.out.println("Final balance: " + account.getBalance());
    }
}