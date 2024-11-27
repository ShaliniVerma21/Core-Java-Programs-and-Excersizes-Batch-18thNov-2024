package Excercize_6;
//Hollow Rectangle Pattern
public class p14 {
	 public static void main(String[] args) {
	        int rows = 5; // Number of rows
	        int cols = 10; // Number of columns
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= cols; j++) {
	                if (i == 1 || i == rows || j == 1 || j == cols) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}