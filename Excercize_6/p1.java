package Excercize_6;
//Star Pattern with Hourglass
public class p1 {
	 public static void main(String[] args) {
	        int n = 5; // Number of rows
	        // Upper part
	        for (int i = n; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        // Lower part
	        for (int i = 2; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}