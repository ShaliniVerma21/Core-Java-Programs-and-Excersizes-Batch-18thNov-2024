package Excercize_6;
//print K Pattern with * Characters
public class p40 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter K
	        int width = 5;  // Width of the letter K

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'K'
	                if (j == 0) {
	                    System.out.print("*"); // Vertical line of K
	                } else if (i + j == height / 2 || i - j == height / 2) {
	                    System.out.print("*"); // Diagonal lines of K
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}