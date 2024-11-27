package Excercize_6;
//print X Pattern with * Characters
public class p51 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter V

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < height; j++) {
	                // Conditions to print '*' for the letter 'V'
	                if (j == i || j == height - i - 1) {
	                    System.out.print("*"); // Print '*' at the appropriate positions
	                } else {
	                    System.out.print(" "); // Print space
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}