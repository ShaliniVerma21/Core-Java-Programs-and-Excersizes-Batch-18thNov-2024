package Assignement_3;
//Blood Donation Management System 💉: Manage donors, requests, and blood stock.

//Abstract class representing a Person
abstract class Person {
 protected String name;
 protected int age;
 protected String bloodType;

 // Constructor
 public Person(String name, int age, String bloodType) {
     this.name = name;
     this.age = age;
     this.bloodType = bloodType;
 }

 // Abstract method to display person details
 public abstract void displayDetails();
}

//Concrete class representing a Donor
class Donor extends Person {
 private static int totalDonors = 0; // Static variable to track total donors

 // Constructor
 public Donor(String name, int age, String bloodType) {
     super(name, age, bloodType);
     totalDonors++;
 }

 // Method to display donor details
 @Override
 public void displayDetails() {
     System.out.println("Donor Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Blood Type: " + bloodType);
 }

 // Static method to get total donors
 public static int getTotalDonors() {
     return totalDonors;
 }
}

//Concrete class representing a Blood Request
class BloodRequest {
 private String requesterName;
 private String bloodTypeNeeded;
 private int quantity; // in units

 // Constructor
 public BloodRequest(String requesterName, String bloodTypeNeeded, int quantity) {
     this.requesterName = requesterName;
     this.bloodTypeNeeded = bloodTypeNeeded;
     this.quantity = quantity;
 }

 // Method to display blood request details
 public void displayRequest() {
     System.out.println("Requester Name: " + requesterName);
     System.out.println("Blood Type Needed: " + bloodTypeNeeded);
     System.out.println("Quantity Needed: " + quantity + " units");
 }
}

//Class representing the Blood Donation Management System
class BloodDonationSystem {
 private Donor[] donors;
 private BloodRequest[] requests;
 private int donorCount;
 private int requestCount;

 // Constructor
 public BloodDonationSystem(int donorCapacity, int requestCapacity) {
     donors = new Donor[donorCapacity];
     requests = new BloodRequest[requestCapacity];
     donorCount = 0;
     requestCount = 0;
 }

 // Method to register a donor
 public void registerDonor(String name, int age, String bloodType) {
     if (donorCount < donors.length) {
         donors[donorCount] = new Donor(name, age, bloodType);
         System.out.println("Donor registered: " + name);
         donorCount++;
     } else {
         System.out.println("Registration failed: Donor list is full.");
     }
 }

 // Method to request blood
 public void requestBlood(String requesterName, String bloodTypeNeeded, int quantity) {
     if (requestCount < requests.length) {
         requests[requestCount] = new BloodRequest(requesterName, bloodTypeNeeded, quantity);
         System.out.println("Blood request registered for: " + requesterName);
         requestCount++;
     } else {
         System.out.println("Request failed: Request list is full.");
     }
 }

 // Method to display all donors
 public void displayDonors() {
     System.out.println("Registered Donors:");
     for (int i = 0; i < donorCount; i++) {
         donors[i].displayDetails();
         System.out.println();
     }
 }

 // Method to display all blood requests
 public void displayRequests() {
     System.out.println("Blood Requests:");
     for (int i = 0; i < requestCount; i++) {
         requests[i].displayRequest();
         System.out.println();
     }
 }
}

//Main class to manage the blood donation system
public class demo6 {
 public static void main(String[] args) {
     // Create an instance of the blood donation system
     BloodDonationSystem bloodDonationSystem = new BloodDonationSystem(5, 5);

     // Register donors
     bloodDonationSystem.registerDonor("Alice", 25, "A+");
     bloodDonationSystem.registerDonor("Bob", 30, "B+");
     bloodDonationSystem.registerDonor("Charlie", 22, "O-");

     // Request blood
     bloodDonationSystem.requestBlood("David", "A+", 2);
     bloodDonationSystem.requestBlood("Eve", "O-", 1);

     // Display registered donors
     bloodDonationSystem.displayDonors();

     // Display blood requests
     bloodDonationSystem.displayRequests();

     // Display total donors
     System.out.println("Total donors registered: " + Donor.getTotalDonors());
 }
}