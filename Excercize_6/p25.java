package Excercize_6;
// Create a kite Pattern
public class p25 {
	    public static void main(String[] args) {
	        int n = 7; // Size of the kite

	        // Print the petals of the kite
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if (i + j >= n / 2 && j - i <= n / 2 && i - j <= n / 2) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }

	        // Print the stem of the kite
	        for (int i = 0; i < n / 2; i++) {
	            for (int j = 0; j < n; j++) {
	                if (j == n / 2) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
}