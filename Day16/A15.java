package Day16;

import java.util.Arrays;

public class A15 {
	 public static void main(String[] args) {
	        int[] original = {1, 2, 3, 4, 5};
	        int[] copy = Arrays.copyOf(original, original.length);

	        System.out.println("Copied Array: " + Arrays.toString(copy));
	    }
	}