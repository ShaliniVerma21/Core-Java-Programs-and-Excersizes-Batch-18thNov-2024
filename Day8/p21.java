package Day8;

import java.util.Scanner;

//Problem: Write a program to calculate the power of a number using loops.
public class p21 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter base: ");
	        int base = scanner.nextInt();
	        System.out.print("Enter exponent: ");
	        int exponent = scanner.nextInt();
	        long result = 1;

	        for (int i = 0; i < exponent; i++) {
	            result *= base; // Multiply base exponent times
	        }

	        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	        scanner.close();
	    }
	}