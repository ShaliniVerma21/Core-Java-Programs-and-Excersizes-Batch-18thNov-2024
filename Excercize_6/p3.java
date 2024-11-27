package Excercize_6;
//Hollow Christmas Tree Pattern
public class p3 {
	    public static void main(String[] args) {
	        int height = 6; // Height of the tree

	        // Upper part of the hollow tree
	        for (int i = 1; i <= height; i++) {
	            // Print leading spaces
	            for (int j = height; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print asterisks for the tree
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                if (j == 1 || j == (2 * i - 1) || i == height) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
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