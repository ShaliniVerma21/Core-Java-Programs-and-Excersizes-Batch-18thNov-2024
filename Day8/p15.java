package Day8;

import java.util.Scanner;

//Problem: Write a program to print the multiplication table of a given number.
public class p15 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        System.out.println("Multiplication Table of " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	        scanner.close();
	    }
	}