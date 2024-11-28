package Day8;
//Problem: Write a program to count the number of even and odd numbers in an array.
public class p13 {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int evenCount = 0, oddCount = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }

	        System.out.println("Number of even numbers: " + evenCount);
	        System.out.println("Number of odd numbers: " + oddCount);
	    }
	}