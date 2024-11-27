package Excercize_6;

// Print # Pattern with * Characters
public class p8 {
    public static void main(String[] args) {
        int height = 7; // Height of the hash pattern
        int width = 7;  // Width of the hash pattern

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the hash pattern
                if (j == 0 || j == width - 1 || i == height / 2 || (i % 2 == 0 && j % 2 == 0)) {
                    System.out.print("*"); // Print '*' for vertical and horizontal lines
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}