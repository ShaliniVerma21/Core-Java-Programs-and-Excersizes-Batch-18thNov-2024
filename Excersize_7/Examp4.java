package Excersize_7;

import java.util.Scanner;

public class Examp4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String accountHolderName;
        double balance = 0.0; // Initial balance
        boolean exit = false;

        System.out.print("Enter your name to create an account: ");
        accountHolderName = scanner.nextLine(); // Using escape sequence for better formatting

        System.out.println("Welcome, " + accountHolderName + "! Your account has been created.");

        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");

            int choice = scanner.nextInt(); // User choice

            switch (choice) {
                case 1: // Deposit Money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount; // Update balance
                        System.out.printf("Successfully deposited: $%.2f%n", depositAmount);
                    } else {
                        System.out.println("Invalid deposit amount. Please enter a positive value.");
                    }
                    break;

                case 2: // Withdraw Money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount; // Update balance
                        System.out.printf("Successfully withdrew: $%.2f%n", withdrawAmount);
                    } else {
                        System.out.println("Invalid withdrawal amount. Please enter a positive value not exceeding your balance.");
                    }
                    break;

                case 3: // Check Balance
                    System.out.printf("Your current balance is: $%.2f%n", balance);
                    break;

                case 4: // Exit
                    exit = true; // Exit the loop
                    System.out.println("Thank you for using the banking application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }

        scanner.close(); // Close the scanner
    }
}