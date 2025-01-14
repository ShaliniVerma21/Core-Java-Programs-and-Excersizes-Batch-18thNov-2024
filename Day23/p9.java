package Day23;
/*
 20. Local Inner Class: Banking System
Problem: Create a banking system where a Bank class uses a local inner class Account to manage account details. 
 */
class Bank {
    private String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void createAccount(String accountHolder, double initialBalance) {
        class Account {
            private String holder;
            private double balance;

            Account(String holder, double initialBalance) {
                this.holder = holder;
                this.balance = initialBalance;
            }

            void deposit(double amount) {
                balance += amount;
                System.out.println("Deposited: $" + amount + ", New Balance: $" + balance);
            }

            void withdraw(double amount) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrew: $" + amount + ", New Balance: $" + balance);
                } else {
                    System.out.println("Insufficient funds!");
                }
            }

            void display() {
                System.out.println("Account Holder: " + holder + ", Balance: $" + balance);
            }
        }

        Account account = new Account(accountHolder, initialBalance);
        account.display();
        account.deposit(100);
        account.withdraw(50);
        account.withdraw(200);
    }
}

public class p9{
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        bank.createAccount("Alice", 500);
    }
}