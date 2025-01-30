package Day25;
//LinkedHashMap
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    String name;
    String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}

public class C5 {

    public static void main(String[] args) {
        // Create a LinkedHashMap to manage employees
        LinkedHashMap<Integer, Employee> employeeMap = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Remove Employee");
            System.out.println("5. Update Employee");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new employee
                    addEmployee(employeeMap, scanner);
                    break;

                case 2:
                    // View all employees
                    viewEmployees(employeeMap);
                    break;

                case 3:
                    // Search for a specific employee
                    searchEmployee(employeeMap, scanner);
                    break;

                case 4:
                    // Remove an employee
                    removeEmployee(employeeMap, scanner);
                    break;

                case 5:
                    // Update employee information
                    updateEmployee(employeeMap, scanner);
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

    // Method to add an employee
    private static void addEmployee(LinkedHashMap<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.print("Enter employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee position: ");
        String position = scanner.nextLine();
        Employee newEmployee = new Employee(name, position);
        employeeMap.put(id, newEmployee);
        System.out.println("Employee added: " + newEmployee);
    }

    // Method to view all employees
    private static void viewEmployees(LinkedHashMap<Integer, Employee> employeeMap) {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            System.out.println("Current Employees:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
            }
        }
    }

    // Method to search for a specific employee
    private static void searchEmployee(LinkedHashMap<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.print("Enter employee ID to search for: ");
        int searchId = scanner.nextInt();
        if (employeeMap.containsKey(searchId)) {
            System.out.println("Employee found: " + employeeMap.get(searchId));
        } else {
            System.out.println("Employee not found with ID: " + searchId);
        }
    }

    // Method to remove an employee
    private static void removeEmployee(LinkedHashMap<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.print("Enter employee ID to remove: ");
        int removeId = scanner.nextInt();
        if (employeeMap.remove(removeId) != null) {
            System.out.println("Employee removed with ID: " + removeId);
        } else {
            System.out.println("Employee not found with ID: " + removeId);
        }
    }

    // Method to update employee information
    private static void updateEmployee(LinkedHashMap<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.print("Enter employee ID to update: ");
        int updateId = scanner.nextInt();
        if (employeeMap.containsKey(updateId)) {
            scanner.nextLine(); // Consume newline
            System.out.print("Enter new employee name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new employee position: ");
            String newPosition = scanner.nextLine();
            Employee updatedEmployee = new Employee(newName, newPosition);
            employeeMap.put(updateId, updatedEmployee);
            System.out.println("Employee updated: " + updatedEmployee);
        } else {
            System.out.println("Employee not found with ID: " + updateId);
        }
    }
}