package Excercize_6;

// Print S Pattern with * Characters
public class p48 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter S
        int width = 7;  // Width of the letter S

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'S'
                if (i == 0 && j < width) {
                    System.out.print("*"); // Top horizontal line of S
                } else if (i == height - 1 && j < width) {
                    System.out.print("*"); // Bottom horizontal line of S
                } else if (j == 0 && i > 0 && i < height / 2) {
                    System.out.print("*"); // Left vertical line (top half)
                } else if (j == width - 1 && i > height / 2 && i < height - 1) {
                    System.out.print("*"); // Right vertical line (bottom half)
                } else if (i == height / 2) {
                    System.out.print("*"); // Middle line of S
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}