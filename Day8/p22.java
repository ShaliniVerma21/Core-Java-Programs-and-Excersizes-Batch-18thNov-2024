package Day8;
//Problem: Write a program to find the second largest element in an array.
public class p22 {
	    public static void main(String[] args) {
	        int[] arr = {3, 5, 7, 2, 8, -1, 4};
	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > largest) {
	                secondLargest = largest; // Update second largest
	                largest = num; // Update largest
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num; // Update second largest if it's not equal to largest
	            }
	        }

	        System.out.println("Second Largest Element: " + secondLargest);
	    }
	}