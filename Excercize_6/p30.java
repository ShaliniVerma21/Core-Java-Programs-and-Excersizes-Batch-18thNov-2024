package Excercize_6;
//Inverted Tree Pattern
public class p30 {
	    public static void main(String[] args) {
	        int height = 5; // Height of the tree

	        // Upper part of the inverted tree
	        for (int i = height; i >= 1; i--) {
	            // Print leading spaces
	            for (int j = height; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print asterisks for the tree
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Trunk of the tree
	        for (int i = 0; i < height - 1; i++) {
	            System.out.print(" ");
	        }
	        System.out.println("|");
	    }
	}