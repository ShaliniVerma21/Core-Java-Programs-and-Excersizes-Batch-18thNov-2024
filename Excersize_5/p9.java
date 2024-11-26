package Excersize_5;

public class p9 {
	    public static void main(String[] args) {
	        String text = "Hello World, Hello Java!";
	        char targetChar = 'o'; // Character to count
	        int count = 0;

	        // Labeled outer loop for each character in the string
	        outer: for (int i = 0; i < text.length(); i++) {
	            if (text.charAt(i) == targetChar) {
	                count++; // Increment count if character matches
	            }
	        }

	        System.out.println("Character '" + targetChar + "' occurs " + count + " times.");
	    }
	}