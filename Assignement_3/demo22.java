package Assignement_3;
//Driver Scheduling System 🚕: Assign shifts and track driver availability.

import java.util.Scanner;

// Interface for Driver Operations
interface DriverOperations {
    void assignShift(String shift);
    void displayAvailability();
}

// Abstract class for Person6
abstract class Person6 {
    protected String name;
    protected int age;

    public Person6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayInfo();
}

// Concrete class for Driver
class Driver extends Person6 implements DriverOperations {
    private String[] shifts;
    private int shiftCount;

    public Driver(String name, int age) {
        super(name, age);
        this.shifts = new String[7]; // Maximum 7 shifts (one for each day of the week)
        this.shiftCount = 0;
    }

    @Override
    public void assignShift(String shift) {
        if (shiftCount < shifts.length) {
            shifts[shiftCount] = shift;
            System.out.println("Shift assigned to " + name + ": " + shift);
            shiftCount++;
        } else {
            System.out.println("Shift limit reached for " + name);
        }
    }

    @Override
    public void displayAvailability() {
        System.out.println("Availability for " + name + ":");
        for (int i = 0; i < shiftCount; i++) {
            System.out.println("- " + shifts[i]);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Driver Name: " + name);
        System.out.println("Driver Age: " + age);
    }
}

// Main class
public class demo22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a Driver
        System.out.print("Enter driver's name: ");
        String driverName = scanner.nextLine();
        System.out.print("Enter driver's age: ");
        int driverAge = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Driver driver = new Driver(driverName, driverAge);

        // Assign shifts
        driver.assignShift("Monday: 9 AM - 5 PM");
        driver.assignShift("Tuesday: 10 AM - 6 PM");
        driver.assignShift("Wednesday: 11 AM - 7 PM");

        // Display driver info and availability
        driver.displayInfo();
        driver.displayAvailability();

        scanner.close();
    }
}