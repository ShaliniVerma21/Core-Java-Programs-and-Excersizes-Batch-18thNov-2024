package Excercize_6;
//Hollow Diamond Star Pattern
public class Pyramid5 {
	  public static void main(String[] args) {
	        int n = 5; // Number of rows for the upper part
	        // Upper Hollow Pyramid
	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                if (j == 1 || j == (2 * i - 1) || i == n) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        // Lower Hollow Pyramid
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                if (j == 1 || j == (2 * i - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}