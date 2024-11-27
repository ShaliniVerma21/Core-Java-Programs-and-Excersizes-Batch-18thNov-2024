package Excercize_6;
//Diamond Star Pattern
public class Pyramid4 {
	  public static void main(String[] args) {
	        int n = 5; // Number of rows for the upper part
	        // Upper Pyramid
	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        // Lower Pyramid
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}