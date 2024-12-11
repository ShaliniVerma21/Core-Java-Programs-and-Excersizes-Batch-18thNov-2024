package Assignement_3;
//Pet Care Management 🐕: Schedule appointments and track health records.

import java.util.Scanner;

// Interface for Pet Care Operations
interface PetCareOperations {
    void scheduleAppointment(String date, String time);
    void addHealthRecord(String record);
    void displayPetInfo();
}

// Abstract class for Pet
abstract class Pet {
    protected String name;
    protected String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract void displayInfo();
}

// Concrete class for Dog
class Dog extends Pet implements PetCareOperations {
    private String[] healthRecords;
    private String[] appointments;
    private int healthRecordCount;
    private int appointmentCount;

    public Dog(String name) {
        super(name, "Dog");
        this.healthRecords = new String[10]; // Maximum 10 health records
        this.appointments = new String[10]; // Maximum 10 appointments
        this.healthRecordCount = 0;
        this.appointmentCount = 0;
    }

    @Override
    public void scheduleAppointment(String date, String time) {
        if (appointmentCount < appointments.length) {
            appointments[appointmentCount] = "Appointment on " + date + " at " + time;
            System.out.println("Appointment scheduled for " + name + ": " + date + " at " + time);
            appointmentCount++;
        } else {
            System.out.println("Appointment limit reached.");
        }
    }

    @Override
    public void addHealthRecord(String record) {
        if (healthRecordCount < healthRecords.length) {
            healthRecords[healthRecordCount] = record;
            System.out.println("Health record added for " + name + ": " + record);
            healthRecordCount++;
        } else {
            System.out.println("Health record limit reached.");
        }
    }

    @Override
    public void displayPetInfo() {
        System.out.println("Pet Name: " + name);
        System.out.println("Pet Type: " + type);
        System.out.println("Health Records:");
        for (int i = 0; i < healthRecordCount; i++) {
            System.out.println("- " + healthRecords[i]);
        }
        System.out.println("Appointments:");
        for (int i = 0; i < appointmentCount; i++) {
            System.out.println("- " + appointments[i]);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
    }
}

// Main class
public class demo24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Dog
        System.out.print("Enter dog's name: ");
        String dogName = scanner.nextLine();

        Dog dog = new Dog(dogName);

        // Schedule appointments
        dog.scheduleAppointment("2023-10-15", "10:00 AM");
        dog.scheduleAppointment("2023-10-20", "2:00 PM");

        // Add health records
        dog.addHealthRecord("Vaccination - Rabies");
        dog.addHealthRecord("Check-up - Healthy");

        // Display pet info
        dog.displayPetInfo();

        scanner.close();
    }
}