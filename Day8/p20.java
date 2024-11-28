package Day8;

import java.util.Scanner;

//Problem: Write a program to print all prime numbers within a given range.
public class p20 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the lower bound: ");
	        int lower = scanner.nextInt();
	        System.out.print("Enter the upper bound: ");
	        int upper = scanner.nextInt();

	        System.out.println("Prime numbers between " + lower + " and " + upper + ":");
	        for (int num = lower; num <= upper; num++) {
	            boolean isPrime = true;
	            if (num <= 1) {
	                continue; // Skip numbers less than 2
	            }
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false; // Found a divisor
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(num + " ");
	            }
	        }
	        scanner.close();
	    }
	}