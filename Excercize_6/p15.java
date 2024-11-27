package Excercize_6;
//Pentagon Pattern
public class p15 {
	 public static void main(String[] args) {
	        int n = 8; // Number of rows
	        for (int i = 0; i < n; i++) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}