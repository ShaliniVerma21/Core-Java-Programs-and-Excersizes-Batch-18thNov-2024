package Excersize_5;
import java.util.Scanner;
public class p4 {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String input;
	        boolean isPalindrome;

	        // Check for palindromes using a do-while loop
	        do {
	            System.out.print("Enter a word (or 'exit' to quit): ");
	            input = scanner.nextLine();
	            if (input.equalsIgnoreCase("exit")) {
	                break; // Exit the loop if user types 'exit'
	            }

	            isPalindrome = true; // Assume it is a palindrome
	            int length = input.length();
	            for (int i = 0; i < length / 2; i++) {
	                if (input.charAt(i) != input.charAt(length - 1 - i)) {
	                    isPalindrome = false; // Not a palindrome
	                    break;
	                }
	            }

	            System.out.println(input + " is a palindrome: " + isPalindrome);
	        } while (true); // Continue until the user decides to exit
	    }
	}