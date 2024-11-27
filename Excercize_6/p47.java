package Excercize_6;

// Print R Pattern with * Characters
public class p47 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter R
        int width = 7;  // Width of the letter R

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'R'
                if (j == 0) {
                    System.out.print("*"); // Vertical line of R
                } else if (i == 0 && j < width - 1) {
                    System.out.print("*"); // Top horizontal line of R
                } else if (i == height / 2 && j < width - 1) {
                    System.out.print("*"); // Middle horizontal line of R
                } else if (j == width - 1 && i < height / 2) {
                    System.out.print("*"); // Right vertical line of R (top half)
                } else if (j == width - 1 && i > height / 2) {
                    System.out.print(" "); // No right vertical line in the bottom half
                } else if (i - j == height / 2 - 1) {
                    System.out.print("*"); // Diagonal line for the leg of R
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}