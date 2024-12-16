package Day16;

import java.util.Arrays;

//Reversing an Array
public class A19 {

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};

	        // Reversing the array
	        for (int i = 0; i < numbers.length / 2; i++) {
	            int temp = numbers[i];
	            numbers[i] = numbers[numbers.length - 1 - i];
	            numbers[numbers.length - 1 - i] = temp;
	        }

	        System.out.println("Reversed Array: " + Arrays.toString(numbers));
	    }
	}