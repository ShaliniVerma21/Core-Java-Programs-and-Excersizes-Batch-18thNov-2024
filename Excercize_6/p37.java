package Excercize_6;
//print G Pattern with * Characters
public class p37 {
	    public static void main(String[] args) {
	        int height = 7; // Height of the letter G
	        int width = 7;  // Width of the letter G

	        for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                // Conditions to print '*' for the letter 'G'
	                if (j == 0 || (i == 0 && j < width) || (i == height - 1 && j < width) || 
	                    (i == height / 2 && j >= width / 2) || (j == width - 1 && i > height / 2)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}