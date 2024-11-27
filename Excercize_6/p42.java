package Excercize_6;

// Print M Pattern with * Characters
public class p42 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter M
        int width = 7;  // Width of the letter M (should be odd for symmetry)

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'M'
                if (j == 0 || j == width - 1) {
                    System.out.print("*"); // Vertical lines of M
                } else if (i == j && j <= width / 2) {
                    System.out.print("*"); // Left diagonal of M
                } else if (i + j == width - 1 && j >= width / 2) {
                    System.out.print("*"); // Right diagonal of M
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}