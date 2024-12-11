package Assignement_3;
//Child Vaccination Tracker 🍼: Track vaccination schedules for children.

//Abstract class representing a Child
abstract class Child {
 protected String name;
 protected int age; // in years
 protected String vaccinationStatus;

 // Constructor
 public Child(String name, int age) {
     this.name = name;
     this.age = age;
     this.vaccinationStatus = "Not Vaccinated";
 }

 // Abstract method to display child details
 public abstract void displayChildDetails();

 // Method to update vaccination status
 public void updateVaccinationStatus(String status) {
     this.vaccinationStatus = status;
 }
}

//Concrete class representing a Regular Child
class RegularChild extends Child {
 private static final String TYPE = "Regular";

 // Constructor
 public RegularChild(String name, int age) {
     super(name, age);
 }

 // Method to display child details
 @Override
 public void displayChildDetails() {
     System.out.println("Child Type: " + TYPE);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age + " years");
     System.out.println("Vaccination Status: " + vaccinationStatus);
 }
}

//Concrete class representing a Special Needs Child
class SpecialNeedsChild extends Child {
 private static final String TYPE = "Special Needs";

 // Constructor
 public SpecialNeedsChild(String name, int age) {
     super(name, age);
 }

 // Method to display child details
 @Override
 public void displayChildDetails() {
     System.out.println("Child Type: " + TYPE);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age + " years");
     System.out.println("Vaccination Status: " + vaccinationStatus);
 }
}

//Class representing the Vaccination Tracker
class VaccinationTracker {
 private Child[] children;
 private int childCount;

 // Constructor
 public VaccinationTracker(int capacity) {
     children = new Child[capacity];
     childCount = 0;
 }

 // Method to add a child
 public void addChild(Child child) {
     if (childCount < children.length) {
         children[childCount] = child;
         childCount++;
         System.out.println("Child added: " + child.name);
     } else {
         System.out.println("Vaccination Tracker is full. Cannot add more children.");
     }
 }

 // Method to update vaccination status
 public void updateVaccinationStatus(String childName, String status) {
     for (int i = 0; i < childCount; i++) {
         if (children[i].name.equalsIgnoreCase(childName)) {
             children[i].updateVaccinationStatus(status);
             System.out.println("Vaccination status updated for " + childName);
             return;
         }
     }
     System.out.println("Child not found: " + childName);
 }

 // Method to display all children
 public void displayAllChildren() {
     System.out.println("Child Vaccination Tracker:");
     for (int i = 0; i < childCount; i++) {
         children[i].displayChildDetails();
         System.out.println();
     }
 }
}

//Main class to manage the Child Vaccination Tracker
public class demo3 {
 public static void main(String[] args) {
     // Create a Vaccination Tracker with a capacity of 5 children
     VaccinationTracker vaccinationTracker = new VaccinationTracker(5);

     // Create children
     Child regularChild = new RegularChild("Alice", 3);
     Child specialNeedsChild = new SpecialNeedsChild("Bob", 4);

     // Add children to the vaccination tracker
     vaccinationTracker.addChild(regularChild);
     vaccinationTracker.addChild(specialNeedsChild);

     // Display all children
     vaccinationTracker.displayAllChildren();

     // Update vaccination status
     vaccinationTracker.updateVaccinationStatus("Alice", "Vaccinated");
     vaccinationTracker.updateVaccinationStatus("Bob", "Vaccinated");

     // Display updated vaccination status
     System.out.println("After updating vaccination status:");
     vaccinationTracker.displayAllChildren();
 }
}