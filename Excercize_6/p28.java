package Excercize_6;

public class p28 {
	 public static void main(String[] args) {
	        int n = 5; // Height of the diamond

	        // Upper part of the diamond
	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            if (i > 1) {
	                for (int j = 1; j < (2 * i - 2); j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower part of the diamond
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            if (i > 1) {
	                for (int j = 1; j < (2 * i - 2); j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        // Upper part of the diamond
	        for (int i = 1; i <= n; i++) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            if (i > 1) {
	                for (int j = 1; j < (2 * i - 2); j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower part of the diamond
	        for (int i = n - 1; i >= 1; i--) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            System.out.print("*");
	            if (i > 1) {
	                for (int j = 1; j < (2 * i - 2); j++) {
	                    System.out.print(" ");
	                }
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}