package Day16;
//Finding the Maximum and Minimum Elements in an Array

public class A17 {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}