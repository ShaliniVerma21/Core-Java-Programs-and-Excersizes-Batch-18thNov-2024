package Excercize_6;
//Star Pattern with Crossed Lines
public class p21 {
	 public static void main(String[] args) {
	        int n = 5; // Size of the square
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (i == j || i + j == n + 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}