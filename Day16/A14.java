package Day16;

import java.util.Arrays;

public class A14 {
	  public static void main(String[] args) {
	        int[] numbers = {5, 3, 8, 1, 2};
	        Arrays.sort(numbers); // Sort first for binary search

	        int index = Arrays.binarySearch(numbers, 3);
	        System.out.println("Element 3 found at index: " + index);
	    }
	}