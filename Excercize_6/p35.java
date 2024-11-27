package Excercize_6;
//print E Pattern with * Characters
public class p35 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter E
	        int width = 5;  // Width of the letter E

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'E'
	                if (j == 0 || (i == 0 && j < width) || (i == height / 2 && j < width) || (i == height - 1 && j < width)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}