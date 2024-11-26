package Excersize_5;
import java.util.Scanner;
public class p3 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number, reversed = 0;

	        // Reverse a number using a while loop
	        while (true) {
	            System.out.print("Enter a number (or -1 to exit): ");
	            number = scanner.nextInt();
	            if (number == -1) {
	                break; // Exit the loop if user types -1
	            }

	            int temp = number; // Store original number
	            while (temp != 0) {
	                int digit = temp % 10; // Get last digit
	                reversed = reversed * 10 + digit; // Build reversed number
	                temp /= 10; // Remove last digit
	            }

	            System.out.println("Reversed Number: " + reversed);
	            reversed = 0; // Reset reversed for next iteration
	        }
	    }
	}