package Excercize_6;
//Java Program to Print a Proper House Pattern-2
public class p53 {
	    public static void main(String[] args) {
	        int height = 6; // Height of the house
	        int width = 17; // Width of the house

	        // Print the roof
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                if (j >= (width / 2) - i && j <= (width / 2) + i) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	        // Print the walls with windows
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                if (j == 0 || j == width - 1) {
	                    System.out.print("*"); // Walls
	                } else if (i == height - 1) {
	                    System.out.print("*"); // Base
	                } else if (i == height / 2 && (j == (width / 4) || j == (3 * width / 4))) {
	                    System.out.print("O"); // Windows
	                } else {
	                    System.out.print(" "); // Interior
	                }
	            }
	            System.out.println();
	        }
	    }
	}