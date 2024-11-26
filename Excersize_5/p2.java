package Excersize_5;
import java.util.Scanner;
public class p2 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int number;

	        // Calculate sum of digits using a while loop
	        while (true) {
	            System.out.print("Enter a number (or -1 to exit): ");
	            number = scanner.nextInt();
	            if (number == -1) {
	                break; // Exit the loop if user types -1
	            }

	            int sum = 0;
	            int temp = number; // Store original number
	            while (temp != 0) {
	                sum += temp % 10; // Add last digit to sum
	                temp /= 10; // Remove last digit
	            }

	            System.out.println("Sum of digits: " + sum);
	        }
	    }
	}