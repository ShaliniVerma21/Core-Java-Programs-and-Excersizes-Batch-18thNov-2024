package Excersize_5;

public class p10 {
	    public static void main(String[] args) {
	        int n = 5; // Number to calculate the factorial of
	        int factorial = 1;

	        // Calculate factorial using a for loop
	        for (int i = 1; i <= n; i++) {
	            factorial *= i; // Multiply current factorial by i
	        }

	        System.out.println("Factorial of " + n + " is: " + factorial);
	    }
	}