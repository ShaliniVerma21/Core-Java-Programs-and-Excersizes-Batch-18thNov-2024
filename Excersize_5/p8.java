package Excersize_5;

public class p8 {
	    public static void main(String[] args) {
	        char[] letters = {'A', 'B', 'C'}; // Array of letters

	        // Labeled outer loop for first letter
	        outer: for (char first : letters) {
	            // Inner loop for second letter
	            for (char second : letters) {
	                if (first == second) {
	                    continue; // Skip if both letters are the same
	                }
	                System.out.println("Combination: " + first + second); // Print combination
	            }
	        }
	    }
	}