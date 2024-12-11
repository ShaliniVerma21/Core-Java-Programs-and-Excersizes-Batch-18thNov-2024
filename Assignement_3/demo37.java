package Assignement_3;
//Household Chore Scheduler 🏠: Plan daily and weekly tasks for family members.

//Abstract class representing a Chore
abstract class Chore {
 protected String name;
 protected String assignedTo;
 protected String frequency; // Daily or Weekly

 // Constructor
 public Chore(String name, String assignedTo, String frequency) {
     this.name = name;
     this.assignedTo = assignedTo;
     this.frequency = frequency;
 }

 // Abstract method to display chore details
 public abstract void displayChore();

 // Method to check if the chore is due
 public boolean isDue(String currentDay) {
     return frequency.equalsIgnoreCase("Daily") || (frequency.equalsIgnoreCase("Weekly") && currentDay.equalsIgnoreCase("Sunday"));
 }
}

//Concrete class representing a Daily Chore
class DailyChore extends Chore {
 // Constructor
 public DailyChore(String name, String assignedTo) {
     super(name, assignedTo, "Daily");
 }

 // Method to display chore details
 @Override
 public void displayChore() {
     System.out.println("Daily Chore: " + name);
     System.out.println("Assigned To: " + assignedTo);
     System.out.println("Frequency: " + frequency);
 }
}

//Concrete class representing a Weekly Chore
class WeeklyChore extends Chore {
 // Constructor
 public WeeklyChore(String name, String assignedTo) {
     super(name, assignedTo, "Weekly");
 }

 // Method to display chore details
 @Override
 public void displayChore() {
     System.out.println("Weekly Chore: " + name);
     System.out.println("Assigned To: " + assignedTo);
     System.out.println("Frequency: " + frequency);
 }
}

//Class representing the Household Chore Scheduler
class ChoreScheduler {
 private Chore[] chores;
 private int choreCount;

 // Constructor
 public ChoreScheduler(int capacity) {
     chores = new Chore[capacity];
     choreCount = 0;
 }

 // Method to add a chore
 public void addChore(Chore chore) {
     if (choreCount < chores.length) {
         chores[choreCount] = chore;
         choreCount++;
         System.out.println("Chore added: " + chore.name);
     } else {
         System.out.println("Chore Scheduler is full. Cannot add more chores.");
     }
 }

 // Method to display all chores
 public void displayChores(String currentDay) {
     System.out.println("Chore List:");
     for (int i = 0; i < choreCount; i++) {
         if (chores[i].isDue(currentDay)) {
             chores[i].displayChore();
             System.out.println();
         }
     }
 }
}

//Main class to manage the Household Chore Scheduler
public class demo37 {
 public static void main(String[] args) {
     // Create a Chore Scheduler with a capacity of 5 chores
     ChoreScheduler choreScheduler = new ChoreScheduler(5);

     // Create chores
     Chore chore1 = new DailyChore("Wash Dishes", "Alice");
     Chore chore2 = new WeeklyChore("Clean the Garage", "Bob");
     Chore chore3 = new DailyChore("Take Out Trash", "Charlie");
     Chore chore4 = new WeeklyChore("Grocery Shopping", "Diana");

     // Add chores to the Chore Scheduler
     choreScheduler.addChore(chore1);
     choreScheduler.addChore(chore2);
     choreScheduler.addChore(chore3);
     choreScheduler.addChore(chore4);

     // Simulate current day
     String currentDay = "Sunday";

     // Display all chores due today
     choreScheduler.displayChores(currentDay);
 }
}