package Excersize_7;

import java.util.Scanner;

public class Examp3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUMBER_OF_STUDENTS = 5;
        final int NUMBER_OF_SUBJECTS = 3;

        // Arrays to hold student names and their marks
        String[] studentNames = new String[NUMBER_OF_STUDENTS];
        double[][] marks = new double[NUMBER_OF_STUDENTS][NUMBER_OF_SUBJECTS];
        double[] averages = new double[NUMBER_OF_STUDENTS];
        String[] grades = new String[NUMBER_OF_STUDENTS];

        // Input student names and their marks
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.println("Enter marks for " + studentNames[i] + ":");
            for (int j = 0; j < NUMBER_OF_SUBJECTS; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextDouble();
            }
            scanner.nextLine(); // Consume the newline character

            // Calculate average marks
            averages[i] = calculateAverage(marks[i]);

            // Determine grade based on average
            grades[i] = determineGrade(averages[i]);
        }

        // Display the marksheet
        System.out.println("\nMarksheet:");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-10s%n", 
                          "Name", "Subject 1", "Subject 2", "Subject 3", "Average", "Grade");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.printf("%-15s %-10.2f %-10.2f %-10.2f %-10.2f %-10s%n", 
                              studentNames[i], marks[i][0], marks[i][1], marks[i][2], averages[i], grades[i]);
        }

        scanner.close();
    }

    // Method to calculate average
    private static double calculateAverage(double[] marks) {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    // Method to determine grade
    private static String determineGrade(double average) {
        if (average >= 80) {
            return "A";
        } else if (average >= 60) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}