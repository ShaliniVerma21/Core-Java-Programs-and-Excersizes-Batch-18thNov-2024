package Day8;

import java.util.Scanner;

//Problem: Write a program to check if a number is an Armstrong number.
public class p17 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int originalNumber = number;
	        int sum = 0;

	        while (number != 0) {
	            int digit = number % 10; // Get the last digit
	            sum += Math.pow(digit, 3); // Cube the digit and add to sum
	            number /= 10; // Remove the last digit
	        }

	        System.out.println("Is " + originalNumber + " an Armstrong number? " + (sum == originalNumber));
	        scanner.close();
	    }
	}