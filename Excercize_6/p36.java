package Excercize_6;
//print F Pattern with * Characters
public class p36 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter F
	        int width = 5;  // Width of the letter F

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'F'
	                if (j == 0 || (i == 0 && j < width) || (i == height / 2 && j < width)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}