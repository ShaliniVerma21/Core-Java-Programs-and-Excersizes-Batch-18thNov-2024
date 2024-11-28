package Day8;

import java.util.Scanner;

// Peterson Number in Java
public class p5 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int originalNumber = number; // Store the original number for comparison
	        int sumOfFactorials = 0;

	        // Array to store factorials of digits 0-9
	        int[] factorials = new int[10];
	        factorials[0] = 1; // 0! = 1
	        for (int i = 1; i < 10; i++) {
	            factorials[i] = factorials[i - 1] * i; // Calculate factorials
	        }

	        // Calculate the sum of the factorials of the digits
	        while (number > 0) {
	            int digit = number % 10; // Get the last digit
	            sumOfFactorials += factorials[digit]; // Add the factorial of the digit
	            number /= 10; // Remove the last digit
	        }

	        // Check if the sum of factorials equals the original number
	        if (sumOfFactorials == originalNumber) {
	            System.out.println(originalNumber + " is a Peterson number.");
	        } else {
	            System.out.println(originalNumber + " is not a Peterson number.");
	        }

	        scanner.close();
	    }
	}