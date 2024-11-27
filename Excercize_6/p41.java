package Excercize_6;
//print L Pattern with * Characters
public class p41 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter L
	        int width = 5;  // Width of the letter L

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'L'
	                if (j == 0) {
	                    System.out.print("*"); // Vertical line of L
	                } else if (i == height - 1) {
	                    System.out.print("*"); // Bottom line of L
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}