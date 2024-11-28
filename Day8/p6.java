package Day8;

import java.util.Scanner;
//Java Program: Number to Word Conversion 
public class p6 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        long number = scanner.nextLong();
	        
	        // Arrays to hold the words for units, tens, and thousands
	        String[] units = {
	            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
	            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
	            "Seventeen", "Eighteen", "Nineteen"
	        };

	        String[] tens = {
	            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
	        };

	        String[] thousands = {
	            "", "Thousand", "Million", "Billion"
	        };

	        // Check for zero
	        if (number == 0) {
	            System.out.println("Number in words: Zero");
	        } else {
	            String words = "";
	            int thousandCounter = 0;

	            while (number > 0) {
	                int part = (int) (number % 1000);
	                String partInWords = "";

	                if (part > 0) {
	                    // Handle hundreds
	                    if (part >= 100) {
	                        partInWords += units[part / 100] + " Hundred ";
	                        part %= 100;
	                    }

	                    // Handle tens and units
	                    if (part >= 20) {
	                        partInWords += tens[part / 10] + " ";
	                        part %= 10;
	                    }

	                    if (part > 0) {
	                        partInWords += units[part] + " ";
	                    }

	                    // Append the thousand scale
	                    partInWords += thousands[thousandCounter] + " ";
	                    words = partInWords + words; // Prepend the current part
	                }

	                number /= 1000; // Move to the next group of thousands
	                thousandCounter++; // Increment the thousand counter
	            }

	            System.out.println("Number in words: " + words.trim());
	        }
	        
	        scanner.close();
	    }
	}