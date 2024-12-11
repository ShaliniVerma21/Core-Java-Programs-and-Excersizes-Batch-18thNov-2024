package Assignement_3;
//Medical Prescription Tracker 💊: Track and renew prescriptions.

//Abstract class representing a Prescription
abstract class Prescription {
 protected String patientName;
 protected String medicationName;
 protected int dosage; // in mg
 protected int duration; // in days

 // Constructor
 public Prescription(String patientName, String medicationName, int dosage, int duration) {
     this.patientName = patientName;
     this.medicationName = medicationName;
     this.dosage = dosage;
     this.duration = duration;
 }

 // Abstract method to display prescription details
 public abstract void displayPrescriptionDetails();

 // Method to renew the prescription
 public void renewPrescription(int additionalDays) {
     this.duration += additionalDays;
     System.out.println("Prescription renewed for " + additionalDays + " days.");
 }
}

//Concrete class representing a Standard Prescription
class StandardPrescription extends Prescription {
 private static final String TYPE = "Standard";

 // Constructor
 public StandardPrescription(String patientName, String medicationName, int dosage, int duration) {
     super(patientName, medicationName, dosage, duration);
 }

 // Method to display prescription details
 @Override
 public void displayPrescriptionDetails() {
     System.out.println("Prescription Type: " + TYPE);
     System.out.println("Patient Name: " + patientName);
     System.out.println("Medication Name: " + medicationName);
     System.out.println("Dosage: " + dosage + " mg");
     System.out.println("Duration: " + duration + " days");
 }
}

//Concrete class representing a Controlled Substance Prescription
class ControlledSubstancePrescription extends Prescription {
 private static final String TYPE = "Controlled Substance";

 // Constructor
 public ControlledSubstancePrescription(String patientName, String medicationName, int dosage, int duration) {
     super(patientName, medicationName, dosage, duration);
 }

 // Method to display prescription details
 @Override
 public void displayPrescriptionDetails() {
     System.out.println("Prescription Type: " + TYPE);
     System.out.println("Patient Name: " + patientName);
     System.out.println("Medication Name: " + medicationName);
     System.out.println("Dosage: " + dosage + " mg");
     System.out.println("Duration: " + duration + " days");
 }
}

//Class representing the Prescription Tracker
class PrescriptionTracker {
 private Prescription[] prescriptions;
 private int prescriptionCount;

 // Constructor
 public PrescriptionTracker(int capacity) {
     prescriptions = new Prescription[capacity];
     prescriptionCount = 0;
 }

 // Method to add a prescription
 public void addPrescription(Prescription prescription) {
     if (prescriptionCount < prescriptions.length) {
         prescriptions[prescriptionCount] = prescription;
         prescriptionCount++;
         System.out.println("Prescription added for: " + prescription.patientName);
     } else {
         System.out.println("Prescription Tracker is full. Cannot add more prescriptions.");
     }
 }

 // Method to display all prescriptions
 public void displayAllPrescriptions() {
     System.out.println("Medical Prescription Tracker:");
     for (int i = 0; i < prescriptionCount; i++) {
         prescriptions[i].displayPrescriptionDetails();
         System.out.println();
     }
 }
}

//Main class to manage the Medical Prescription Tracker
public class demo31 {
 public static void main(String[] args) {
     // Create a Prescription Tracker with a capacity of 5 prescriptions
     PrescriptionTracker prescriptionTracker = new PrescriptionTracker(5);

     // Create prescriptions
     Prescription standardPrescription = new StandardPrescription("John Doe", "Amoxicillin", 500, 7);
     Prescription controlledPrescription = new ControlledSubstancePrescription("Jane Smith", "Oxycodone", 10, 5);

     // Add prescriptions to the tracker
     prescriptionTracker.addPrescription(standardPrescription);
     prescriptionTracker.addPrescription(controlledPrescription);

     // Display all prescriptions
     prescriptionTracker.displayAllPrescriptions();

     // Renew a prescription
     standardPrescription.renewPrescription(3);
     System.out.println("After renewal:");
     prescriptionTracker.displayAllPrescriptions();
 }
}