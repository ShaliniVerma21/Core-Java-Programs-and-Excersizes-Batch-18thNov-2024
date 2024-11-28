package Day8;

import java.util.Scanner;

//Problem: Write a program to swap two numbers without using a temporary variable.
public class p16 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();

	        a = a + b; // Step 1: Add both numbers
	        b = a - b; // Step 2: Subtract the new value of a from b
	        a = a - b; // Step 3: Subtract the new value of b from a

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	        scanner.close();
	    }
	}