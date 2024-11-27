package Excercize_6;
//Star Pattern with Diagonal
public class p17 {
	 public static void main(String[] args) {
	        int n = 5; // Size of the square
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (j == 1 || j == n || i == j) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}