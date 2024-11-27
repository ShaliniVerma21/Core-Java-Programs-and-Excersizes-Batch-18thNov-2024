package Excercize_6;

// Print Y Pattern with * Characters
public class p6 {
    public static void main(String[] args) {
        int height = 7; // Height of the letter Y
        int midPoint = height / 2; // Midpoint for the Y shape

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {
                // Conditions to print '*' for the letter 'Y'
                if (i < midPoint) {
                    // Upper part of Y
                    if (j == midPoint - i || j == midPoint + i) {
                        System.out.print("*"); // Print '*' at the appropriate positions
                    } else {
                        System.out.print(" "); // Print space
                    }
                } else {
                    // Lower part of Y
                    if (j == midPoint) {
                        System.out.print("*"); // Print '*' for the vertical part of Y
                    } else {
                        System.out.print(" "); // Print space
                    }
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}