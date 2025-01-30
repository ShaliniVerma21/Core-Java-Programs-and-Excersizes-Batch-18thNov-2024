package Day25;
//Stack
import java.util.Scanner;
import java.util.Stack;

public class C12 {

    public static void main(String[] args) {
        // Create a Stack to manage tasks
        Stack<String> taskStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nTask Management System");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Search Task");
            System.out.println("5. Sort Tasks");
            System.out.println("6. Clear All Tasks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new task
                    System.out.print("Enter the task to add: ");
                    String newTask = scanner.nextLine();
                    taskStack.push(newTask);
                    System.out.println("Task added: " + newTask);
                    break;

                case 2:
                    // View all tasks
                    viewTasks(taskStack);
                    break;

                case 3:
                    // Complete a task
                    if (!taskStack.isEmpty()) {
                        String completedTask = taskStack.pop();
                        System.out.println("Completed task: " + completedTask);
                    } else {
                        System.out.println("No tasks to complete.");
                    }
                    break;

                case 4:
                    // Search for a specific task
                    System.out.print("Enter the task to search for: ");
                    String searchTask = scanner.nextLine();
                    searchTask(taskStack, searchTask);
                    break;

                case 5:
                    // Sort tasks (Note: Stack does not support sorting directly)
                    sortTasks(taskStack);
                    break;

                case 6:
                    // Clear all tasks
                    taskStack.clear();
                    System.out.println("All tasks cleared.");
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

    // Method to view all tasks in the stack
    private static void viewTasks(Stack<String> taskStack) {
        if (taskStack.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            System.out.println("Current Tasks:");
            for (String task : taskStack) {
                System.out.println("- " + task);
            }
        }
    }

    // Method to search for a specific task
    private static void searchTask(Stack<String> taskStack, String searchTask) {
        if (taskStack.contains(searchTask)) {
            System.out.println("Task found: " + searchTask);
        } else {
            System.out.println("Task not found: " + searchTask);
        }
    }

    // Method to sort tasks (Note: This creates a temporary sorted list)
    private static void sortTasks(Stack<String> taskStack) {
        if (taskStack.isEmpty()) {
            System.out.println("No tasks to sort.");
            return;
        }

        // Create a temporary stack to hold sorted tasks
        Stack<String> tempStack = new Stack<>();
        while (!taskStack.isEmpty()) {
            String currentTask = taskStack.pop();
            while (!tempStack.isEmpty() && tempStack.peek().compareTo(currentTask) < 0) {
                taskStack.push(tempStack.pop());
            }
            tempStack.push(currentTask);
        }

        // Restore the original stack with sorted tasks
        while (!tempStack.isEmpty()) {
            taskStack.push(tempStack.pop());
        }

        System.out.println("Tasks sorted.");
        viewTasks(taskStack);
    }
}