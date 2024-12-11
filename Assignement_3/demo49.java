package Assignement_3;
//Attendance Tracker 📝: Track employee or student attendance digitally.

//Abstract class representing a Person2
abstract class Person2 {
 protected String name;
 protected int id;

 // Constructor
 public Person2(String name, int id) {
     this.name = name;
     this.id = id;
 }

 // Abstract method to display Person2 details
 public abstract void displayDetails();
}

//Concrete class representing an Employee
class Employee extends Person2 {
 private String department;

 // Constructor
 public Employee(String name, int id, String department) {
     super(name, id);
     this.department = department;
 }

 // Method to display employee details
 @Override
 public void displayDetails() {
     System.out.println("Employee ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Department: " + department);
 }
}

//Concrete class representing a Student
class Student extends Person2 {
 private String course;

 // Constructor
 public Student(String name, int id, String course) {
     super(name, id);
     this.course = course;
 }

 // Method to display student details
 @Override
 public void displayDetails() {
     System.out.println("Student ID: " + id);
     System.out.println("Name: " + name);
     System.out.println("Course: " + course);
 }
}

//Class representing the Attendance Tracker
class AttendanceTracker {
 private Person2[] Person2s;
 private boolean[][] attendance; // attendance[Person2Index][dayIndex]
 private int Person2Count;
 private int days;

 // Constructor
 public AttendanceTracker(int capacity, int days) {
     Person2s = new Person2[capacity];
     attendance = new boolean[capacity][days];
     Person2Count = 0;
     this.days = days;
 }

 // Method to add a Person2 (Employee or Student)
 public void addPerson2(Person2 Person2) {
     if (Person2Count < Person2s.length) {
         Person2s[Person2Count] = Person2;
         System.out.println("Added: " + Person2.name);
         Person2Count++;
     } else {
         System.out.println("Attendance list is full. Cannot add more Person2s.");
     }
 }

 // Method to mark attendance
 public void markAttendance(int Person2Index, int dayIndex) {
     if (Person2Index < Person2Count && dayIndex < days) {
         attendance[Person2Index][dayIndex] = true;
         System.out.println("Attendance marked for " + Person2s[Person2Index].name + " on day " + (dayIndex + 1));
     } else {
         System.out.println("Invalid Person2 index or day index.");
     }
 }

 // Method to display attendance for a Person2
 public void displayAttendance(int Person2Index) {
     if (Person2Index < Person2Count) {
         System.out.println("Attendance for " + Person2s[Person2Index].name + ":");
         for (int i = 0; i < days; i++) {
             System.out.println("Day " + (i + 1) + ": " + (attendance[Person2Index][i] ? "Present" : "Absent"));
         }
     } else {
         System.out.println("Invalid Person2 index.");
     }
 }

 // Method to display all Person2s
 public void displayPerson2s() {
     System.out.println("Person2s in the Attendance Tracker:");
     for (int i = 0; i < Person2Count; i++) {
         Person2s[i].displayDetails();
         System.out.println();
     }
 }
}

//Main class to manage the attendance tracker
public class demo49 {
 public static void main(String[] args) {
     // Create an instance of the attendance tracker
     AttendanceTracker tracker = new AttendanceTracker(5, 7); // 5 Person2s, 7 days

     // Add employees and students
     tracker.addPerson2(new Employee("Alice", 101, "HR"));
     tracker.addPerson2(new Student("Bob", 201, "Computer Science"));
     tracker.addPerson2(new Employee("Charlie", 102, "Finance"));
     tracker.addPerson2(new Student("David", 202, "Mathematics"));

     // Display all Person2s
     tracker.displayPerson2s();

     // Mark attendance
     tracker.markAttendance(0, 0); // Alice on Day 1
     tracker.markAttendance(1, 1); // Bob on Day 2
     tracker.markAttendance(0, 1); // Alice on Day 2
     tracker.markAttendance(2, 0); // Charlie on Day 1
     tracker.markAttendance(3, 2); // David on Day 3

     // Display attendance for each Person2
     tracker.displayAttendance(0); // Alice tracker.displayAttendance(1); // Bob
     tracker.displayAttendance(2); // Charlie
     tracker.displayAttendance(3); // David
 }
}