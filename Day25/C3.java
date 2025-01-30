package Day25;
//TreeSet

import java.util.Scanner;
import java.util.TreeSet;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // Sort by name
    }
}

public class C3 {

    public static void main(String[] args) {
        // Create a TreeSet to manage students
        TreeSet<Student> studentSet = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new student
                    addStudent(studentSet, scanner);
                    break;

                case 2:
                    // View all students
                    viewStudents(studentSet);
                    break;

                case 3:
                    // Search for a specific student
                    searchStudent(studentSet, scanner);
                    break;

                case 4:
                    // Remove a student
                    removeStudent(studentSet, scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Student Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add a student
    private static void addStudent(TreeSet<Student> studentSet, Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Student newStudent = new Student(name, age);
        if (studentSet.add(newStudent)) {
            System.out.println("Student added: " + newStudent);
        } else {
            System.out.println("Student with this name already exists.");
        }
    }

    // Method to view all students
    private static void viewStudents(TreeSet<Student> studentSet) {
        if (studentSet.isEmpty()) {
            System.out.println("No students available.");
        } else {
            System.out.println("Current Students:");
            for (Student student : studentSet) {
                System.out.println(student);
            }
        }
    }

    // Method to search for a specific student
    private static void searchStudent(TreeSet<Student> studentSet, Scanner scanner) {
        System.out.print("Enter student name to search for: ");
        String searchName = scanner.nextLine();
        for (Student student : studentSet) {
            if (student.name.equalsIgnoreCase(searchName)) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student not found: " + searchName);
    }

    // Method to remove a student
    private static void removeStudent(TreeSet<Student> studentSet, Scanner scanner) {
        System.out.print("Enter student name to remove: ");
        String removeName = scanner.nextLine();
        Student studentToRemove = new Student(removeName, 0); // Create a temporary student for comparison
        if (studentSet.remove(studentToRemove)) {
            System.out.println("Student removed: " + removeName);
        } else {
            System.out.println("Student not found: " + removeName);
        }
    }
}