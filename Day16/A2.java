package Day16;
//Removing Duplicates from an Array

import java.util.Arrays;

public class A2{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};

        // Using a temporary array to store unique elements
        int[] temp = new int[numbers.length];
        int j = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (numbers[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = numbers[i];
            }
        }

        // Copy unique elements to a new array
        int[] uniqueArray = Arrays.copyOf(temp, j);
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}