package Excercize_6;

// Print J Pattern with * Characters
public class p4 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter J
        int width = 5;  // Width of the letter J

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'J'
                if (j == width / 2 && i < height - 1) {
                    System.out.print("*"); // Vertical line of J
                } else if (i == height - 1 && j < width) {
                    System.out.print("*"); // Bottom line of J
                } else if (i == 0 && j == width - 1 && height > 1) {
                    System.out.print("*"); // Top right corner of J
                } else if (i == height - 1 && j == 0) {
                    System.out.print(" "); // Space for the bottom left corner
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}