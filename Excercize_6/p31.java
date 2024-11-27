package Excercize_6;
// print A Pattern with * Characters
public class p31 {
	    public static void main(String[] args) {
	        int n = 5; // Height of the letter A
	        char symbol = '*'; // Change this to any character you want
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= 2 * n; j++) {
	                if (j == n - i || j == n + i || (i == n / 2 && j > n - i && j < n + i)) {
	                    System.out.print(symbol);
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}