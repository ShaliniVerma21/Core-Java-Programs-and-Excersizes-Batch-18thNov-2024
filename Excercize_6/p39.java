package Excercize_6;
//print I Pattern with * Characters
public class p39 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter I
	        int width = 5;  // Width of the letter I

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'I'
	                if (i == 0 || i == height - 1 || j == width / 2) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}