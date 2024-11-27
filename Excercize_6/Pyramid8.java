package Excercize_6;
//Inverted Pyramid Star Pattern
public class Pyramid8 {
		 public static void main(String[] args) {
		        int n = 5; // Number of rows
		        for (int i = n; i >= 1; i--) {
		            for (int j = n; j > i; j--) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		}