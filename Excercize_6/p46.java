package Excercize_6;

// Print Q Pattern with * Characters
public class p46 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter Q
        int width = 7;  // Width of the letter Q

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'Q'
                if ((i == 0 || i == height - 1) && (j > 0 && j < width - 1)) {
                    System.out.print("*"); // Top and bottom horizontal lines of Q
                } else if (j == 0 || j == width - 1) {
                    System.out.print("*"); // Vertical lines of Q
                } else if (i == j && i > height / 2) {
                    System.out.print("*"); // Diagonal line for the tail of Q
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}