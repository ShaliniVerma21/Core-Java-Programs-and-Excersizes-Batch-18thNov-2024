package Excercize_6;

// Print Z Pattern with * Characters
public class p7 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter Z

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                // Conditions to print '*' for the letter 'Z'
                if (i == 0 || i == height - 1 || i + j == height - 1) {
                    System.out.print("*"); // Print '*' at the top, bottom, and diagonal
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}