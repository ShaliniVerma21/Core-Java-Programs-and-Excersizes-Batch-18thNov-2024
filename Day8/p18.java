package Day8;

import java.util.Scanner;

/*
 * Problem: Write a program to find the greatest common divisor (GCD) 
 * of two numbers using the Euclidean algorithm.
 */
public class p18 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();
	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();

	        while (b != 0) {
	            int temp = b;
	            b = a % b; // Remainder
	            a = temp; // Update a
	        }

	        System.out.println("GCD is: " + a);
	        scanner.close();
	    }
	}