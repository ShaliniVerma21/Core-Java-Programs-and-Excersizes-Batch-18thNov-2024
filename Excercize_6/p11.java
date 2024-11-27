package Excercize_6;
// Inverted Triangle Pattern
public class p11 {
	  public static void main(String[] args) {
	        int n = 5; // Number of rows
	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}