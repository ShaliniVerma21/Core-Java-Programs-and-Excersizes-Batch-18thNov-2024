package Excercize_6;

// Print N Pattern with * Characters
public class p43 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter N
        int width = 7;  // Width of the letter N

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'N'
                if (j == 0 || j == width - 1) {
                    System.out.print("*"); // Vertical lines of N
                } else if (i == j) {
                    System.out.print("*"); // Diagonal line of N
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}