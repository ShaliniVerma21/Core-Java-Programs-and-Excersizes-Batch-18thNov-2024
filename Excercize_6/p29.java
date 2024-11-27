package Excercize_6;
//Simple Christmas Tree Pattern
public class p29 {
	    public static void main(String[] args) {
	        int height = 5; // Height of the tree

	        for (int i = 1; i <= height; i++) {
	            // Print leading spaces
	            for (int j = height; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Print asterisks
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Print the trunk of the tree
	        for (int i = 0; i < height - 1; i++) {
	            System.out.print(" ");
	        }
	        System.out.println("|");
	    }
	}