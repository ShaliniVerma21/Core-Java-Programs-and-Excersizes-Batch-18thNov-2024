package Assignement_3;
//blood Donation Management System 💉: Manage Donor1 database and stock levels.

//Abstract class representing a Blood Donor1
abstract class Donor1 {
 protected String name;
 protected int age;
 protected String bloodType;
 protected String contactNumber;

 // Constructor
 public Donor1(String name, int age, String bloodType, String contactNumber) {
     this.name = name;
     this.age = age;
     this.bloodType = bloodType;
     this.contactNumber = contactNumber;
 }

 // Abstract method to display Donor1 details
 public abstract void displayDonor1Details();

 // Method to check eligibility for donation
 public boolean isEligibleForDonation() {
     return age >= 18 && age <= 65; // Basic eligibility criteria
 }
}

//Concrete class representing a Regular Donor1
class RegularDonor1 extends Donor1 {
 private static final String TYPE = "Regular";

 // Constructor
 public RegularDonor1(String name, int age, String bloodType, String contactNumber) {
     super(name, age, bloodType, contactNumber);
 }

 // Method to display Donor1 details
 @Override
 public void displayDonor1Details() {
     System.out.println("Donor1 Type: " + TYPE);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Blood Type: " + bloodType);
     System.out.println("Contact Number: " + contactNumber);
     System.out.println("Eligible for Donation: " + (isEligibleForDonation() ? "Yes" : "No"));
 }
}

//Concrete class representing a First-Time Donor1
class FirstTimeDonor1 extends Donor1 {
 private static final String TYPE = "First-Time";

 // Constructor
 public FirstTimeDonor1(String name, int age, String bloodType, String contactNumber) {
     super(name, age, bloodType, contactNumber);
 }

 // Method to display Donor1 details
 @Override
 public void displayDonor1Details() {
     System.out.println("Donor1 Type: " + TYPE);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Blood Type: " + bloodType);
     System.out.println("Contact Number: " + contactNumber);
     System.out.println("Eligible for Donation: " + (isEligibleForDonation() ? "Yes" : "No"));
 }
}

//Class representing the Blood Bank
class BloodBank {
 private Donor1[] Donor1s;
 private int Donor1Count;
 private int[] bloodStock; // Array to hold stock levels for each blood type

 // Constructor
 public BloodBank(int capacity) {
     Donor1s = new Donor1[capacity];
     Donor1Count = 0;
     bloodStock = new int[4]; // Assuming 4 blood types: A, B, AB, O
 }

 // Method to add a Donor1
 public void addDonor1(Donor1 Donor1) {
     if (Donor1Count < Donor1s.length) {
         Donor1s[Donor1Count] = Donor1;
         Donor1Count++;
         System.out.println("Donor1 added: " + Donor1.name);
     } else {
         System.out.println("Blood Bank is full. Cannot add more Donor1s.");
     }
 }

 // Method to update blood stock
 public void updateBloodStock(String bloodType, int quantity) {
     int index = getBloodTypeIndex(bloodType);
     if (index != -1) {
         bloodStock[index] += quantity;
         System.out.println("Updated stock for blood type " + bloodType + ": " + bloodStock[index]);
     } else {
         System.out.println("Invalid blood type.");
     }
 }

 // Method to display all Donor1s
 public void displayAllDonor1s() {
     System.out.println("Blood Donor1 Database:");
     for (int i = 0; i < Donor1Count; i++) {
         Donor1s[i].displayDonor1Details();
         System.out.println();
     }
 }

 // Method to get the index of the blood type
 private int getBloodTypeIndex(String bloodType) {
     switch (bloodType.toUpperCase()) {
         case "A":
             return 0;
         case "B":
             return 1;
         case "AB":
             return 2;
         case "O":
             return 3;
         default:
             return -1; // Invalid blood type
     }
 }
}

//Main class to manage the Blood Donation Management System
public class demo30 {
 public static void main(String[] args) {
     // Create a Blood Bank with a capacity of 5 Donor1s
     BloodBank bloodBank = new BloodBank(5);

     // Create Donor1s
     Donor1 regularDonor1 = new RegularDonor1("Alice Johnson", 30, "A", "123-456-7890");
     Donor1 firstTimeDonor1 = new FirstTimeDonor1("Bob Smith", 25, "O", "098-765-4321");

     // Add Donor1s to the blood bank
     bloodBank.addDonor1(regularDonor1);
     bloodBank.addDonor1(firstTimeDonor1);

     // Display all Donor1s
     bloodBank.displayAllDonor1s();

     // Update blood stock
     bloodBank.updateBloodStock("A", 10);
     bloodBank.updateBloodStock("O", 5);
     
     // Display updated stock
     System.out.println("Blood stock updated successfully.");
 }
}