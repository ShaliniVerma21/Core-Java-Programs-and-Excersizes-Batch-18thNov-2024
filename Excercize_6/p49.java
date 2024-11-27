package Excercize_6;

// Print T Pattern with * Characters
public class p49 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter T
        int width = 7;  // Width of the letter T

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'T'
                if (i == 0) {
                    System.out.print("*"); // Top horizontal line of T
                } else if (j == width / 2) {
                    System.out.print("*"); // Vertical line of T
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}