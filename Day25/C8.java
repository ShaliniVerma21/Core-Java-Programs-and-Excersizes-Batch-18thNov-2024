package Day25;
//EnumSet
import java.util.EnumSet;
import java.util.Scanner;

enum TaskStatus {
    PENDING,
    IN_PROGRESS,
    COMPLETED
}

class Task {
    String name;
    TaskStatus status;

    public Task(String name, TaskStatus status) {
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}

public class C8 {

    public static void main(String[] args) {
        // Create an EnumSet to manage task statuses
        EnumSet<TaskStatus> taskStatuses = EnumSet.allOf(TaskStatus.class);
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Search Task by Status");
            System.out.println("4. Remove Task");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new task
                    addTask(scanner);
                    break;

                case 2:
                    // View all tasks
                    viewTasks();
                    break;

                case 3:
                    // Search for tasks by status
                    searchTaskByStatus(scanner);
                    break;

                case 4:
                    // Remove a task
                    removeTask(scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Task Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add a task
    private static void addTask(Scanner scanner) {
        System.out.print("Enter task name: ");
        String name = scanner.nextLine();
        System.out.print("Enter task status (PENDING, IN_PROGRESS, COMPLETED): ");
        String statusInput = scanner.nextLine().toUpperCase();

        try {
            TaskStatus status = TaskStatus.valueOf(statusInput);
            Task newTask = new Task(name, status);
            TaskManager.addTask(newTask);
            System.out.println("Task added: " + newTask);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid status. Please enter PENDING, IN_PROGRESS, or COMPLETED.");
        }
    }

    // Method to view all tasks
    private static void viewTasks() {
        System.out.println("Current Tasks:");
        for (Task task : TaskManager.getTasks()) {
            System.out.println(task);
        }
    }

    // Method to search for tasks by status
    private static void searchTaskByStatus(Scanner scanner) {
        System.out.print("Enter task status to search for (PENDING, IN_PROGRESS, COMPLETED): ");
        String statusInput = scanner.nextLine().toUpperCase();

        try {
            TaskStatus status = TaskStatus.valueOf(statusInput);
            System.out.println("Tasks with status " + status + ":");
            for (Task task : TaskManager.getTasks()) {
                if (task.status == status) {
                    System.out.println(task);
                }
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid status. Please enter PENDING, IN_PROGRESS, or COMPLETED.");
        }
    }

    // Method to remove a task
    private static void removeTask(Scanner scanner) {
        System.out.print("Enter task name to remove: ");
        String name = scanner.nextLine();
        if (TaskManager.removeTask(name)) {
            System.out.println("Task removed: " + name);
        } else {
            System.out.println("Task not found: " + name);
        }
    }
}

class TaskManager {
    private static final java.util.List<Task> tasks = new java.util.ArrayList<>();

    public static void addTask(Task task) {
        tasks.add(task);
    }

    public static java.util.List<Task> getTasks() {
        return tasks;
    }

    public static boolean removeTask(String name) {
        return tasks.removeIf(task -> task.name.equalsIgnoreCase(name));
    }
}