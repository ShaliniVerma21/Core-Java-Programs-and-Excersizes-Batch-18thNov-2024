package Day16;
// Finding the Missing Number in an Array
public class A25 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 2, 8, 4, 5}; // 6 is missing
        int n = numbers.length + 1; // Total numbers should be n

        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arraySum = 0;

        for (int num : numbers) {
            arraySum += num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing Number: " + missingNumber);
    }
}