package Day8;

import java.util.Scanner;

//Problem: Write a program to check if a number is even or odd.
public class p2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number % 2 == 0) {
	            System.out.println(number + " is even.");
	        } else {
	            System.out.println(number + " is odd.");
	        }
	        scanner.close();
	    }
	}