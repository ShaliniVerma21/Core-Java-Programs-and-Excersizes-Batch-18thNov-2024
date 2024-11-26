package Day5;
import java.util.Scanner;

public class demo8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Simulated user input
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Simulated user roles and access levels
        String role = "Editor"; // This would typically come from a database
        boolean isAuthenticated = username.equals("admin") && password.equals("password123");

        if (isAuthenticated) {
            System.out.println("Authentication successful!");

            // Check user role
            if (role.equals("Admin")) {
                System.out.println("Welcome, Admin!");
                System.out.println("You have full access to the system.");
                // Additional admin actions
                System.out.println("1. Manage Users");
                System.out.println("2. View Reports");
                System.out.println("3. Configure Settings");
            } else if (role.equals("Editor")) {
                System.out.println("Welcome, Editor!");
                System.out.println("You can edit content.");
                // Additional editor actions
                System.out.println("1. Edit Articles");
                System.out.println("2. Publish Articles");
            } else if (role.equals("Viewer")) {
                System.out.println("Welcome, Viewer!");
                System.out.println("You can view content.");
                // Additional viewer actions
                System.out.println("1. Read Articles");
                System.out.println("2. Comment on Articles");
            } else {
                System.out.println("Role not recognized. Access denied.");
            }
        } else {
            System.out.println("Authentication failed. Please check your username and password.");
        }

        scanner.close();
    }
}