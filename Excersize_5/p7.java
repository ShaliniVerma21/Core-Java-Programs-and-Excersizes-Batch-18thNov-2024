package Excersize_5;

public class p7 {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5}; // Array of numbers
	        int sum = 0;

	        // Calculate the sum of the array using a for-each loop
	        for (int number : numbers) {
	            sum += number; // Add each number to the sum
	        }

	        System.out.println("Sum of array elements: " + sum);
	    }
	}