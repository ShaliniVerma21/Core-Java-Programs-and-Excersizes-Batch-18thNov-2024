package Day25;
//EnumMap

import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

enum Role {
    MANAGER,
    DEVELOPER,
    DESIGNER,
    TESTER
}

class Employee1 {
    String name;
    Role role;

    public Employee1(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}

public class C9 {

    public static void main(String[] args) {
        // Create an EnumMap to manage Employees by their roles
        EnumMap<Role, Employee1> Employee1Map = new EnumMap<>(Role.class);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by Role");
            System.out.println("4. Remove Employee");
            System.out.println("5. Update Employee Role");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new Employee1
                    addEmployee1(Employee1Map, scanner);
                    break;

                case 2:
                    // View all Employee1s
                    viewEmployee1s(Employee1Map);
                    break;

                case 3:
                    // Search for a specific Employee1 by role
                    searchEmployee1ByRole(Employee1Map, scanner);
                    break;

                case 4:
                    // Remove an Employee1
                    removeEmployee1(Employee1Map, scanner);
                    break;

                case 5:
                    // Update Employee1 role
                    updateEmployee1Role(Employee1Map, scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Employee Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add an Employee1
    private static void addEmployee1(EnumMap<Role, Employee1> Employee1Map, Scanner scanner) {
        System.out.print("Enter Employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee role (MANAGER, DEVELOPER, DESIGNER, TESTER): ");
        String roleInput = scanner.nextLine().toUpperCase();

        try {
            Role role = Role.valueOf(roleInput);
            if (Employee1Map.containsKey(role)) {
                System.out.println("An Employee with this role already exists. Use update option to change the Employee1.");
            } else {
                Employee1 newEmployee1 = new Employee1(name, role);
                Employee1Map.put(role, newEmployee1);
                System.out.println("Employee added: " + newEmployee1);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role. Please enter MANAGER, DEVELOPER, DESIGNER, or TESTER.");
        }
    }

    // Method to view all Employee1s
    private static void viewEmployee1s(EnumMap<Role, Employee1> Employee1Map) {
        if (Employee1Map.isEmpty()) {
            System.out.println("No Employees available.");
        } else {
            System.out.println("Current Employee1s:");
            for (Map.Entry<Role, Employee1> entry : Employee1Map.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Method to search for a specific Employee1 by role
    private static void searchEmployee1ByRole(EnumMap<Role, Employee1> Employee1Map, Scanner scanner) {
        System.out.print("Enter role to search for (MANAGER, DEVELOPER, DESIGNER, TESTER): ");
        String roleInput = scanner.nextLine().toUpperCase();

        try {
            Role role = Role.valueOf(roleInput);
            if (Employee1Map.containsKey(role)) {
                System.out.println("Employee found: " + Employee1Map.get(role));
            } else {
                System.out.println("No Employee found with role: " + role);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role. Please enter MANAGER, DEVELOPER, DESIGNER, or TESTER.");
        }
    }

    // Method to remove an Employee1
    private static void removeEmployee1(EnumMap<Role, Employee1> Employee1Map, Scanner scanner) {
        System.out.print("Enter role of Employee to remove (MANAGER, DEVELOPER, DESIGNER, TESTER): ");
        String roleInput = scanner.nextLine().toUpperCase();

        try {
            Role role = Role.valueOf(roleInput);
            if (Employee1Map.remove(role) != null) {
                System.out.println("Employee removed with role: " + role);
            } else {
                System.out.println("No Employee found with role: " + role);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role. Please enter MANAGER, DEVELOPER, DESIGNER, or TESTER.");
        }
    }

    // Method to update an Employee1's role
    private static void updateEmployee1Role(EnumMap<Role, Employee1> Employee1Map, Scanner scanner) {
        System.out.print("Enter role of Employee to update (MANAGER, DEVELOPER, DESIGNER, TESTER): ");
        String roleInput = scanner.nextLine().toUpperCase();

        try {
            Role role = Role.valueOf(roleInput);
            if (Employee1Map.containsKey(role)) {
                System.out.print("Enter new Employee name: ");
                String newName = scanner.nextLine();
                Employee1 updatedEmployee1 = new Employee1(newName, role);
                Employee1Map.put(role, updatedEmployee1);
                System.out.println("Employee updated: " + updatedEmployee1);
            } else {
                System.out.println("No Employee found with role: " + role);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid role. Please enter MANAGER, DEVELOPER, DESIGNER, or TESTER.");
        }
    }
}