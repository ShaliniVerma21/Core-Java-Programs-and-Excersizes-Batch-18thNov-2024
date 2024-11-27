package Excercize_6;

// Print P Pattern with * Characters
public class p45 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter P
        int width = 7;  // Width of the letter P

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Conditions to print '*' for the letter 'P'
                if (j == 0) {
                    System.out.print("*"); // Vertical line of P
                } else if (i == 0 && j < width - 1) {
                    System.out.print("*"); // Top horizontal line of P
                } else if (i == height / 2 && j < width - 1) {
                    System.out.print("*"); // Middle horizontal line of P
                } else if (j == width - 1 && i < height / 2) {
                    System.out.print("*"); // Right vertical line of P (top half)
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}