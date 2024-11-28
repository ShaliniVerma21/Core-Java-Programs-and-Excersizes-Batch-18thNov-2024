package Day8;

import java.util.Scanner;

//Problem: Write a program to compute the factorial of a number using a loop.
public class p14 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        long factorial = 1;

	        for (int i = 1; i <= number; i++) {
	            factorial *= i; // Multiply each number to get the factorial
	        }

	        System.out.println("Factorial of " + number + " is: " + factorial);
	        scanner.close();
	    }
	}