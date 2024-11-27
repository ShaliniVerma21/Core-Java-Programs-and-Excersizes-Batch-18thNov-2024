package Excercize_6;
//Pyramid Star Pattern with Alternating Rows
public class Pyramid6 {
	 public static void main(String[] args) {
	        int n = 5; // Number of rows
	        for (int i = 1; i <= n; i++) {
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                if (i % 2 == 0) {
	                    System.out.print(" ");
	                } else {
	                    System.out.print("*");
	                }
	            }
	            System.out.println();
	        }
	    }
	}