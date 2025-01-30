package Day25;
//HashTable

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class C7 {

    public static void main(String[] args) {
        // Create a Hashtable to manage students and their grades
        Hashtable<String, Integer> studentGrades = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nStudent Grade Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Update Student Grade");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new student
                    addStudent(studentGrades, scanner);
                    break;

                case 2:
                    // View all students
                    viewStudents(studentGrades);
                    break;

                case 3:
                    // Search for a specific student
                    searchStudent(studentGrades, scanner);
                    break;

                case 4:
                    // Remove a student
                    removeStudent(studentGrades, scanner);
                    break;

                case 5:
                    // Update student grade
                    updateStudentGrade(studentGrades, scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Student Grade Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add a student and their grade
    private static void addStudent(Hashtable<String, Integer> studentGrades, Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student grade: ");
        int grade = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (studentGrades.containsKey(name)) {
            System.out.println("Student already exists. Use update option to change the grade.");
        } else {
            studentGrades.put(name, grade);
            System.out.println("Student added: " + name + " with grade " + grade);
        }
    }

    // Method to view all students and their grades
    private static void viewStudents(Hashtable<String, Integer> studentGrades) {
        if (studentGrades.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("Current Students and Grades:");
            Enumeration<String> keys = studentGrades.keys();
            while (keys.hasMoreElements()) {
                String name = keys.nextElement();
                System.out.println("Name: " + name + ", Grade: " + studentGrades.get(name));
            }
        }
    }

    // Method to search for a specific student
    private static void searchStudent(Hashtable<String, Integer> studentGrades, Scanner scanner) {
        System.out.print("Enter student name to search for: ");
        String searchName = scanner.nextLine();
        if (studentGrades.containsKey(searchName)) {
            System.out.println("Student found: " + searchName + " with grade " + studentGrades.get(searchName));
        } else {
            System.out.println("Student not found: " + searchName);
        }
    }

    // Method to remove a student from the system
    private static void removeStudent(Hashtable<String, Integer> studentGrades, Scanner scanner) {
        System.out.print("Enter student name to remove: ");
        String removeName = scanner.nextLine();
        if (studentGrades.remove(removeName) != null) {
            System.out.println("Student removed: " + removeName);
        } else {
            System.out.println("Student not found: " + removeName);
        }
    }

    // Method to update a student's grade
    private static void updateStudentGrade(Hashtable<String, Integer> studentGrades, Scanner scanner) {
        System.out.print("Enter student name to update: ");
        String updateName = scanner.nextLine();
        if (studentGrades.containsKey(updateName)) {
            System.out.print("Enter new grade: ");
            int newGrade = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            studentGrades.put(updateName, newGrade);
            System.out.println("Updated grade for " + updateName + " to " + newGrade);
        } else {
            System.out.println("Student not found: " + updateName);
        }
    }
}