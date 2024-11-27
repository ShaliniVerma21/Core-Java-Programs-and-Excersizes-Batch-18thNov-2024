package Excercize_6;
//Star Pattern with Cross
public class p18 {
	 public static void main(String[] args) {
	        int n = 5; // Size of the square
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (i == (n / 2) + 1 || j == (n / 2) + 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}