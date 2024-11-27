package Excercize_6;
//Java Program to Print a Proper House Pattern-1
public class p52 {
	    public static void main(String[] args) {
	        int roofHeight = 5; // Height of the roof
	        int houseWidth = 9; // Width of the house
	        int doorWidth = 3;  // Width of the door
	        int doorHeight = 2; // Height of the door

	        // Print the roof of the house
	        for (int i = 0; i < roofHeight; i++) {
	            // Print leading spaces for roof
	            for (int j = roofHeight - i; j > 1; j--) {
	                System.out.print(" ");
	            }
	            // Print stars for roof
	            for (int j = 0; j <= i * 2; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Print the walls of the house
	        for (int i = 0; i < houseWidth - doorHeight; i++) {
	            // Print the walls (base)
	            for (int j = 0; j < houseWidth; j++) {
	                if (j == 0 || j == houseWidth - 1) {
	                    System.out.print("*"); // Print left and right walls
	                } else if (i >= (houseWidth - doorHeight) / 2 && i < (houseWidth - doorHeight) / 2 + doorHeight && j >= (houseWidth - doorWidth) / 2 && j < (houseWidth - doorWidth) / 2 + doorWidth) {
	                    System.out.print(" "); // Print space for door
	                } else {
	                    System.out.print(" "); // Print space for the interior
	                }
	            }
	            System.out.println();
	        }

	        // Print the door of the house
	        for (int i = 0; i < doorHeight; i++) {
	            for (int j = 0; j < houseWidth; j++) {
	                if (j == 0 || j == houseWidth - 1) {
	                    System.out.print("*"); // Print left and right walls
	                } else if (j >= (houseWidth - doorWidth) / 2 && j < (houseWidth - doorWidth) / 2 + doorWidth) {
	                    System.out.print("*"); // Print door
	                } else {
	                    System.out.print(" "); // Print space for the interior
	                }
	            }
	            System.out.println();
	        }
	    }
	}