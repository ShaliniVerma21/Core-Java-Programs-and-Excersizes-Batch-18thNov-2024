package Excercize_6;
//Java Program to Print a Proper House Pattern-3
public class p54 {
	    public static void main(String[] args) {
	        int height = 5; // Height of the house
	        int width = 13; // Width of the house

	        // Print the roof
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                if (j == (width / 2) - i || j == (width / 2) + i || i == height - 1) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	        // Print the walls
	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                if (j == 0 || j == width - 1) {
	                    System.out.print("*"); // Walls
	                } else if (i == height - 1) {
	                    System.out.print("*"); // Base
	                } else {
	                    System.out.print(" "); // Interior
	                }
	            }
	            System.out.println();
	        }
	    }
	}