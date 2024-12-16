package Day16;
//Finding the Second Largest Element in an Array
public class A23{
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest Element: " + secondLargest);
    }
}