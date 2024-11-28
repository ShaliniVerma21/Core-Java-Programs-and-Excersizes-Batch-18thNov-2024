package Day8;

import java.util.Scanner;

//Problem: Write a program to check if a number is prime.
public class p12 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        boolean isPrime = true;

	        if (number <= 1) {
	            isPrime = false; // Numbers less than 2 are not prime
	        } else {
	            for (int i = 2; i <= Math.sqrt(number); i++) {
	                if (number % i == 0) {
	                    isPrime = false; // Found a divisor
	                    break;
	                }
	            }
	        }

	        System.out.println("Is the number prime? " + isPrime);
	        scanner.close();
	    }
	}