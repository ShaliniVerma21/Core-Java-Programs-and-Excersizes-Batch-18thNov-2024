package Day8;
//Problem: Write a program to reverse a given string.
public class p1 {
	    public static void main(String[] args) {
	        String str = "Hello, World!";
	        String reversed = new StringBuilder(str).reverse().toString();
	        System.out.println("Reversed String: " + reversed);
	    }
	}