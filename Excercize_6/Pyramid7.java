package Excercize_6;
//Pyramid Star Pattern with Custom Width
public class Pyramid7 {
	 public static void main(String[] args) {
		    int n = 5; // Number of rows
	        int width = 3; // Custom width for each star
	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*".repeat(width));
	            }
	            System.out.println();
	        }
	    }
	}