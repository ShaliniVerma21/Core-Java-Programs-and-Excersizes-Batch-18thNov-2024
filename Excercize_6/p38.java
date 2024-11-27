package Excercize_6;
//print H Pattern with * Characters
public class p38 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter H
	        int width = 5;  // Width of the letter H

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'H'
	                if (j == 0 || j == width - 1 || i == height / 2) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}