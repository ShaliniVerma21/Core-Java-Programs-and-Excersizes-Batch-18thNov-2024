package Excercize_6;
//print C Pattern with * Characters
public class p33 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter C
	        int width = 5;  // Width of the letter C

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'C'
	                if (j == 0 || (i == 0 && j < width) || (i == height - 1 && j < width)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}