package Day16;
//Checking if an Array is a Palindrome
public class A22{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1};
        boolean isPalindrome = true;

        for (int i = 0; i < numbers.length / 2; i++) {
            if (numbers[i] != numbers[numbers.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is the array a palindrome? " + isPalindrome);
    }
}