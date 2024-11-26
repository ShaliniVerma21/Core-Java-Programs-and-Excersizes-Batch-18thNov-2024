package Excersize_5;
import java.util.Scanner;
public class p5 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double balance = 1000; // Initial balance
	        int choice;

	        // ATM menu using a do-while loop
	        do {
	            System.out.println("ATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Current balance: $" + balance);
	                    break;
	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double deposit = scanner.nextDouble();
	                    balance += deposit; // Update balance
	                    System.out.println("Deposited: $" + deposit);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdraw = scanner.nextDouble();
	                    if (withdraw <= balance) {
	                        balance -= withdraw; // Update balance
	                        System.out.println("Withdrawn: $" + withdraw);
	                    } else {
	                        System.out.println("Insufficient funds.");
	                    }
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM.");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Try again.");
	            }
	        } while (choice != 4); // Continue until the user chooses to exit
	    }
	}