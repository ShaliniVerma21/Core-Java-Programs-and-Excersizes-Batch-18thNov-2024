package Excercize_6;

// Print O Pattern with * Characters
public class p44 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter O
        int width = 7;  // Width of the letter O

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'O'
                if ((i == 0 || i == height - 1) && (j > 0 && j < width - 1)) {
                    System.out.print("*"); // Top and bottom horizontal lines of O
                } else if (j == 0 || j == width - 1) {
                    System.out.print("*"); // Vertical lines of O
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}