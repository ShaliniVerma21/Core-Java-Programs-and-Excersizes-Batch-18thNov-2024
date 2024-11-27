package Excercize_6;
//print B Pattern with * Characters
public class p32 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter B
	        int width = 5;  // Width of the letter B

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'B'
	                if (j == 0 || (i == 0 && j < width - 1) || (i == height / 2 && j < width - 1) || (i == height - 1 && j < width - 1) || (j == width - 1 && (i != 0 && i != height / 2 && i != height - 1))) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}