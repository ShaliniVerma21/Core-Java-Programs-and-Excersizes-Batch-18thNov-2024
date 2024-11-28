package Day8;

import java.util.Scanner;

//Problem: Write a program to count the number of vowels and consonants in a given string.
public class p11 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = scanner.nextLine().toLowerCase();
	        int vowels = 0, consonants = 0;

	        for (char ch : str.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                if ("aeiou".indexOf(ch) != -1) {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Number of vowels: " + vowels);
	        System.out.println("Number of consonants: " + consonants);
	        scanner.close();
	    }
	}