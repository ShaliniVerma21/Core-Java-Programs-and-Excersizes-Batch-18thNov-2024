package Excercize_6;

// Print $ Pattern with * Characters
public class p9 {
    public static void main(String[] args) {
        int height = 7; // Height of the dollar sign pattern

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                // Conditions to print '*' for the dollar sign '$'
                if (i == 0 || i == height - 1) {
                    System.out.print("*"); // Print '*' for the top and bottom horizontal lines
                } else if (i == height / 2) {
                    System.out.print("*"); // Print '*' for the middle horizontal line
                } else if (i % 2 == 0) {
                    // Print '*' for the vertical lines of the dollar sign
                    if (j == 0 || j == height - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    // Print '*' for the diagonal lines of the dollar sign
                    if (j == i || j == height - i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}