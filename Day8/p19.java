package Day8;
//Problem: Write a program to find the minimum and maximum elements in an array.
public class p19 {
	    public static void main(String[] args) {
	        int[] arr = {3, 5, 7, 2, 8, -1, 4};
	        int min = arr[0];
	        int max = arr[0];

	        for (int num : arr) {
	            if (num < min) {
	                min = num; // Update min
	            }
	            if (num > max) {
	                max = num; // Update max
	            }
	        }

	        System.out.println("Minimum Element: " + min);
	        System.out.println("Maximum Element: " + max);
	    }
	}