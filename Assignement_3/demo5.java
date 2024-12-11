package Assignement_3;
//Hospital Management System 🏥: Patient records, doctor schedules, and billing

//Abstract class representing a Person1
abstract class Person1 {
 protected String name;
 protected int age;

 // Constructor
 public Person1(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Abstract method to display Person1 details
 public abstract void displayDetails();
}

//Concrete class representing a Patient
class Patient extends Person1 {
 private String patientId;
 private double billAmount;

 // Constructor
 public Patient(String name, int age, String patientId) {
     super(name, age);
     this.patientId = patientId;
     this.billAmount = 0.0; // Initial bill amount
 }

 // Method to display patient details
 @Override
 public void displayDetails() {
     System.out.println("Patient ID: " + patientId);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Bill Amount: $" + billAmount);
 }

 // Method to add to the bill
 public void addToBill(double amount) {
     billAmount += amount;
     System.out.println("Added $" + amount + " to bill for patient: " + name);
 }

 // Method to pay the bill
 public void payBill(double amount) {
     if (amount <= billAmount) {
         billAmount -= amount;
         System.out.println("Paid $" + amount + " for patient: " + name);
     } else {
         System.out.println("Payment exceeds bill amount for patient: " + name);
     }
 }
}

//Concrete class representing a Doctor
class Doctor extends Person1 {
 private String specialization;

 // Constructor
 public Doctor(String name, int age, String specialization) {
     super(name, age);
     this.specialization = specialization;
 }

 // Method to display doctor details
 @Override
 public void displayDetails() {
     System.out.println("Doctor Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Specialization: " + specialization);
 }
}

//Class representing the Hospital Management System
class HospitalManagementSystem {
 Patient[] patients;
 private Doctor[] doctors;
 private int patientCount;
 private int doctorCount;

 // Constructor
 public HospitalManagementSystem(int patientCapacity, int doctorCapacity) {
     patients = new Patient[patientCapacity];
     doctors = new Doctor[doctorCapacity];
     patientCount = 0;
     doctorCount = 0;
 }

 // Method to add a patient
 public void addPatient(String name, int age, String patientId) {
     if (patientCount < patients.length) {
         patients[patientCount] = new Patient(name, age, patientId);
         System.out.println("Patient added: " + name);
         patientCount++;
     } else {
         System.out.println("Patient list is full. Cannot add more patients.");
     }
 }

 // Method to add a doctor
 public void addDoctor(String name, int age, String specialization) {
     if (doctorCount < doctors.length) {
         doctors[doctorCount] = new Doctor(name, age, specialization);
         System.out.println("Doctor added: " + name);
         doctorCount++;
     } else {
         System.out.println("Doctor list is full. Cannot add more doctors.");
     }
 }

 // Method to display all patients
 public void displayPatients() {
     System.out.println("Patient Records:");
     for (int i = 0; i < patientCount; i++) {
         patients[i].displayDetails();
         System.out.println();
     }
 }

 // Method to display all doctors
 public void displayDoctors() {
     System.out.println("Doctor Records:");
     for (int i = 0; i < doctorCount; i++) {
         doctors[i].displayDetails();
         System.out.println();
     }
 }
}

//Main class to manage the hospital system
public class demo5 {
 public static void main(String[] args) {
     // Create an instance of the hospital management system
     HospitalManagementSystem hospital = new HospitalManagementSystem(5, 5);

     // Add patients
     hospital.addPatient("Alice", 30, "P001");
     hospital.addPatient("Bob", 40, "P002");

     // Add doctors
     hospital.addDoctor("Dr. Smith", 45, "Cardiology");
     hospital.addDoctor("Dr. Jones", 50, "Neurology");

     // Display all patients
     hospital.displayPatients();

     // Display all doctors
     hospital.displayDoctors();

     // // Add billing operations for a patient
     Patient patient = hospital.patients[0]; // Assuming Alice is the first patient
     patient.addToBill(150.00);
     patient.payBill(50.00);
     patient.displayDetails(); // Display updated patient details

     // Attempt to pay more than the bill amount
     patient.payBill(200.00);
 }
}
