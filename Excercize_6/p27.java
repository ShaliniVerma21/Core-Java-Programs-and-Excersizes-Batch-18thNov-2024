package Excercize_6;
//Checkerboard Pattern
public class p27 {
	 public static void main(String[] args) {
	        int n = 8; // Size of the checkerboard

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}