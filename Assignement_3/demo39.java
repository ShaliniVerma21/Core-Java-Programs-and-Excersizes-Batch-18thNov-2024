package Assignement_3;
//To-Do List and Reminder App ✅: Create, edit, and track tasks and deadlines.

//Abstract class representing a Task
abstract class Task {
 protected String title;
 protected String description;
 protected String deadline;

 // Constructor
 public Task(String title, String description, String deadline) {
     this.title = title;
     this.description = description;
     this.deadline = deadline;
 }

 // Abstract method to display task details
 public abstract void displayTask();

 // Method to check if the task is overdue
 public boolean isOverdue(String currentDate) {
     return currentDate.compareTo(deadline) > 0;
 }
}

//Concrete class representing a Simple Task
class SimpleTask extends Task {
 private boolean isCompleted;

 // Constructor
 public SimpleTask(String title, String description, String deadline) {
     super(title, description, deadline);
     this.isCompleted = false;
 }

 // Method to mark the task as completed
 public void completeTask() {
     isCompleted = true;
 }

 // Method to display task details
 @Override
 public void displayTask() {
     System.out.println("Task: " + title);
     System.out.println("Description: " + description);
     System.out.println("Deadline: " + deadline);
     System.out.println("Status: " + (isCompleted ? "Completed" : "Pending"));
 }
}

//Concrete class representing a Reminder Task
class ReminderTask extends Task {
 private String reminderTime;

 // Constructor
 public ReminderTask(String title, String description, String deadline, String reminderTime) {
     super(title, description, deadline);
     this.reminderTime = reminderTime;
 }

 // Method to display task details
 @Override
 public void displayTask() {
     System.out.println("Reminder Task: " + title);
     System.out.println("Description: " + description);
     System.out.println("Deadline: " + deadline);
     System.out.println("Reminder Time: " + reminderTime);
 }
}

//Class representing the To-Do List
class ToDoList {
 private Task[] tasks;
 private int taskCount;

 // Constructor
 public ToDoList(int capacity) {
     tasks = new Task[capacity];
     taskCount = 0;
 }

 // Method to add a task
 public void addTask(Task task) {
     if (taskCount < tasks.length) {
         tasks[taskCount] = task;
         taskCount++;
         System.out.println("Task added: " + task.title);
     } else {
         System.out.println("To-Do List is full. Cannot add more tasks.");
     }
 }

 // Method to display all tasks
 public void displayTasks() {
     System.out.println("To-Do List:");
     for (int i = 0; i < taskCount; i++) {
         tasks[i].displayTask();
         System.out.println();
     }
 }

 // Method to find overdue tasks
 public void displayOverdueTasks(String currentDate) {
     System.out.println("Overdue Tasks:");
     for (int i = 0; i < taskCount; i++) {
         if (tasks[i].isOverdue(currentDate)) {
             tasks[i].displayTask();
             System.out.println();
         }
     }
 }
}

//Main class to manage the To-Do List and Reminder App
public class demo39 {
 public static void main(String[] args) {
     // Create a To-Do List with a capacity of 5 tasks
     ToDoList toDoList = new ToDoList(5);

     // Create tasks
     Task task1 = new SimpleTask("Finish homework", "Complete math and science assignments", "2023-10-15");
     Task task2 = new ReminderTask("Doctor Appointment", "Visit the doctor for a check-up", "2023-10-20", "2023-10-19 10:00 AM");

     // Add tasks to the To-Do List
     toDoList.addTask(task1);
     toDoList.addTask(task2);

     // Display all tasks
     toDoList.displayTasks();

     // Simulate current date
     String currentDate = "2023-10-16";

     // Display overdue tasks
     toDoList.displayOverdueTasks(currentDate);
 }
}