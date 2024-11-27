package Excercize_6;

// Print U Pattern with * Characters
public class p5 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter U
        int width = 7;  // Width of the letter U

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'U'
                if (j == 0 || j == width - 1) {
                    System.out.print("*"); // Vertical lines of U
                } else if (i == height - 1) {
                    System.out.print("*"); // Bottom horizontal line of U
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}