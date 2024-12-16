package Day16;

import java.util.Arrays;

//Merging Two Arrays
public class A18 {
	    public static void main(String[] args) {
	        int[] array1 = {1, 2, 3};
	        int[] array2 = {4, 5, 6};

	        int[] mergedArray = new int[array1.length + array2.length];

	        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
	        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

	        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	    }
	}