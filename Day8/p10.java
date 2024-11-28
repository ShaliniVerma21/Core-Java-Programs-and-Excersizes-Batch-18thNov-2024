package Day8;
import java.util.Scanner;

//Problem: Write a program to calculate the sum of the digits of a given integer.
public class p10 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number = scanner.nextInt();
	        int sum = 0;

	        while (number != 0) {
	            sum += number % 10; // Get the last digit and add it to the sum
	            number /= 10; // Remove the last digit
	        }

	        System.out.println("Sum of digits: " + sum);
	        scanner.close();
	    }
	}