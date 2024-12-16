package Day16;
//Rotating an Array

import java.util.Arrays;

public class A21{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int rotationCount = 2; // Number of positions to rotate

        // Rotate the array
        int length = numbers.length;
        rotationCount = rotationCount % length; // Handle rotation greater than array length

        int[] rotatedArray = new int[length];
        for (int i = 0; i < length; i++) {
            rotatedArray[i] = numbers[(i + rotationCount) % length];
        }

        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }
}