package Excercize_6;
//print D Pattern with * Characters
public class p34 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter D
	        int width = 5;  // Width of the letter D

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'D'
	                if (j == 0 || (i == 0 && j < width) || (i == height - 1 && j < width) || (j == width - 1 && i != 0 && i != height - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}