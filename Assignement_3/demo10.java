package Assignement_3;
//User Behavior Tracker 📈: Monitor app usage patterns.

//Base class for App
class App {
 private String appName;
 private String category;

 // Constructor
 public App(String appName, String category) {
     this.appName = appName;
     this.category = category;
 }

 // Method to display app details
 public void displayAppDetails() {
     System.out.println("App Name: " + appName);
     System.out.println("Category: " + category);
 }
}

//Derived class for UserBehavior
class UserBehavior extends App {
 private String userName;
 private int usageTime; // in minutes
 private static int totalUsageTime = 0; // Static variable to keep track of total usage time

 // Constructor
 public UserBehavior(String appName, String category, String userName) {
     super(appName, category);
     this.userName = userName;
     this.usageTime = 0; // Initialize usage time to 0
 }

 // Method to log usage time
 public void logUsage(int minutes) {
     if (minutes > 0) {
         this.usageTime += minutes;
         totalUsageTime += minutes;
     } else {
         System.out.println("Usage time must be positive.");
     }
 }

 // Method to display user behavior
 public void displayUserBehavior() {
     System.out.println(":User  " + userName);
     System.out.println("Usage Time: " + usageTime + " minutes");
 }

 // Recursive method to calculate average usage time
 public double calculateAverageUsage(int totalSessions, int index) {
     if (index <= 0) {
         return 0; // Base case
     }
     return (double) usageTime / totalSessions; // Average usage time
 }

 // Static method to get total usage time
 public static int getTotalUsageTime() {
     return totalUsageTime;
 }
}

//Final class for UsageReport
final class UsageReport {
 private String reportTitle;

 // Constructor
 public UsageReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Usage Report: " + reportTitle);
 }
}

//Main class
public class demo10 {
 public static void main(String[] args) {
     // Create an app
     App app = new App("Fitness Tracker", "Health & Fitness");
     app.displayAppDetails();

     // Create user behavior tracker
     UserBehavior userBehavior = new UserBehavior("Fitness Tracker", "Health & Fitness", "Alice");
     userBehavior.logUsage(30); // Log 30 minutes of usage
     userBehavior.logUsage(45); // Log 45 minutes of usage

     // Display user behavior
     userBehavior.displayUserBehavior();

     // Calculate average usage time
     double averageUsage = userBehavior.calculateAverageUsage(2, 2); // Assuming 2 sessions
     System.out.println("Average Usage Time: " + averageUsage + " minutes");

     // Display total usage time using static method
     System.out.println("Total Usage Time (Static): " + UserBehavior.getTotalUsageTime() + " minutes");

     // Create and display a usage report
     UsageReport report = new UsageReport("Weekly Usage Report");
     report.displayReport();
 }
}