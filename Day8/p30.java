package Day8;

import java.util.Scanner;

//Java Program to Find Square Root of a Number Without sqrt Method
public class p30 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to find its square root: ");
	        double number = scanner.nextDouble();

	        if (number < 0) {
	            System.out.println("Square root of negative numbers is not defined in real numbers.");
	        } else {
	            double squareRoot = findSquareRoot(number);
	            System.out.printf("The square root of %.2f is approximately %.5f%n", number, squareRoot);
	        }

	        scanner.close();
	    }

	    // Method to find the square root using the Newton-Raphson method
	    private static double findSquareRoot(double number) {
	        double tolerance = 0.00001; // Define the tolerance level
	        double guess = number / 2; // Initial guess

	        while (Math.abs(guess * guess - number) > tolerance) {
	            guess = (guess + number / guess) / 2; // Update guess
	        }

	        return guess;
	    }
	}