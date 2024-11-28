package Day8;

import java.util.Scanner;

//Java Program to Check if a Given Number is Perfect Square
public class p26 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to check if it is a perfect square: ");
	        long number = scanner.nextLong();

	        if (isPerfectSquare(number)) {
	            System.out.println(number + " is a perfect square.");
	        } else {
	            System.out.println(number + " is not a perfect square.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is a perfect square
	    private static boolean isPerfectSquare(long number) {
	        if (number < 0) {
	            return false; // Negative numbers cannot be perfect squares
	        }

	        long left = 0;
	        long right = number;

	        while (left <= right) {
	            long mid = left + (right - left) / 2; // To avoid overflow
	            long square = mid * mid;

	            if (square == number) {
	                return true; // Found the perfect square
	            } else if (square < number) {
	                left = mid + 1; // Search in the right half
	            } else {
	                right = mid - 1; // Search in the left half
	            }
	        }

	        return false; // No perfect square found
	    }
	}