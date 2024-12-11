package Assignement_3;
//Fitness Tracker App ⏱️: Log steps, calories, and workout routines.

//Abstract class representing a Fitness Activity
abstract class FitnessActivity {
 protected String activityName;
 protected int duration; // in minutes
 protected int caloriesBurned;

 // Constructor
 public FitnessActivity(String activityName, int duration, int caloriesBurned) {
     this.activityName = activityName;
     this.duration = duration;
     this.caloriesBurned = caloriesBurned;
 }

 // Abstract method to display activity details
 public abstract void displayActivityDetails();

 // Method to calculate total calories burned based on duration
 public int calculateCaloriesBurned() {
     return (caloriesBurned * duration) / 60; // Assuming caloriesBurned is per hour
 }
}

//Concrete class representing a Walking Activity
class WalkingActivity extends FitnessActivity {
 private static final int CALORIES_PER_HOUR = 300; // Example value

 // Constructor
 public WalkingActivity(int duration) {
     super("Walking", duration, CALORIES_PER_HOUR);
 }

 // Method to display activity details
 @Override
 public void displayActivityDetails() {
     System.out.println("Activity: " + activityName);
     System.out.println("Duration: " + duration + " minutes");
     System.out.println("Calories Burned: " + calculateCaloriesBurned() + " calories");
 }
}

//Concrete class representing a Running Activity
class RunningActivity extends FitnessActivity {
 private static final int CALORIES_PER_HOUR = 600; // Example value

 // Constructor
 public RunningActivity(int duration) {
     super("Running", duration, CALORIES_PER_HOUR);
 }

 // Method to display activity details
 @Override
 public void displayActivityDetails() {
     System.out.println("Activity: " + activityName);
     System.out.println("Duration: " + duration + " minutes");
     System.out.println("Calories Burned: " + calculateCaloriesBurned() + " calories");
 }
}

//Class representing the Fitness Tracker
class FitnessTracker {
 private FitnessActivity[] activities;
 private int activityCount;

 // Constructor
 public FitnessTracker(int capacity) {
     activities = new FitnessActivity[capacity];
     activityCount = 0;
 }

 // Method to add a fitness activity
 public void addActivity(FitnessActivity activity) {
     if (activityCount < activities.length) {
         activities[activityCount] = activity;
         activityCount++;
         System.out.println("Activity added: " + activity.activityName);
     } else {
         System.out.println("Fitness Tracker is full. Cannot add more activities.");
     }
 }

 // Method to display all activities
 public void displayAllActivities() {
     System.out.println("Fitness Activities Log:");
     for (int i = 0; i < activityCount; i++) {
         activities[i].displayActivityDetails();
         System.out.println();
     }
 }

 // Method to calculate total calories burned from all activities
 public int calculateTotalCaloriesBurned() {
     int totalCalories = 0;
     for (int i = 0; i < activityCount; i++) {
         totalCalories += activities[i].calculateCaloriesBurned();
     }
     return totalCalories;
 }
}

//Main class to manage the Fitness Tracker App
public class demo34 {
 public static void main(String[] args) {
     // Create a Fitness Tracker with a capacity of 5 activities
     FitnessTracker fitnessTracker = new FitnessTracker(5);

     // Create fitness activities
     FitnessActivity walking = new WalkingActivity(30); // 30 minutes of walking
     FitnessActivity running = new RunningActivity(45); // 45 minutes of running

     // Add activities to the Fitness Tracker
     fitnessTracker.addActivity(walking);
     fitnessTracker.addActivity(running);

     // Display all activities
     fitnessTracker.displayAllActivities();

     // Calculate total calories burned
     int totalCalories = fitnessTracker.calculateTotalCaloriesBurned();
     System.out.println("Total Calories Burned: " + totalCalories + " calories");
 }
}