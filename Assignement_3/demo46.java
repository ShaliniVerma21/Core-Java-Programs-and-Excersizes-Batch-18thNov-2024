package Assignement_3;
//Parking Lot Management System 🅿️: Allocate and track parking slots.

//Abstract class representing a Vehicle
abstract class Vehicle {
 protected String licensePlate;
 protected String ownerName;

 // Constructor
 public Vehicle(String licensePlate, String ownerName) {
     this.licensePlate = licensePlate;
     this.ownerName = ownerName;
 }

 // Abstract method to display vehicle details
 public abstract void displayDetails();
}

//Concrete class representing a Car
class Car extends Vehicle {
 private String carType;

 // Constructor
 public Car(String licensePlate, String ownerName, String carType) {
     super(licensePlate, ownerName);
     this.carType = carType;
 }

 // Method to display car details
 @Override
 public void displayDetails() {
     System.out.println("Car Type: " + carType);
     System.out.println("License Plate: " + licensePlate);
     System.out.println("Owner Name: " + ownerName);
 }
}

//Concrete class representing a Bike
class Bike extends Vehicle {
 private String bikeType;

 // Constructor
 public Bike(String licensePlate, String ownerName, String bikeType) {
     super(licensePlate, ownerName);
     this.bikeType = bikeType;
 }

 // Method to display bike details
 @Override
 public void displayDetails() {
     System.out.println("Bike Type: " + bikeType);
     System.out.println("License Plate: " + licensePlate);
     System.out.println("Owner Name: " + ownerName);
 }
}

//Class representing a Parking Slot
class ParkingSlot {
 int slotNumber;
 private boolean isOccupied;
 private Vehicle vehicle;

 // Constructor
 public ParkingSlot(int slotNumber) {
     this.slotNumber = slotNumber;
     this.isOccupied = false; // Slot is available by default
 }

 // Method to allocate a vehicle to the slot
 public boolean allocateVehicle(Vehicle vehicle) {
     if (!isOccupied) {
         this.vehicle = vehicle;
         isOccupied = true;
         return true;
     }
     return false;
 }

 // Method to release the vehicle from the slot
 public void releaseVehicle() {
     vehicle = null;
     isOccupied = false;
 }

 // Method to check if the slot is occupied
 public boolean isOccupied() {
     return isOccupied;
 }

 // Method to display slot details
 public void displaySlotDetails() {
     System.out.println("Slot Number: " + slotNumber);
     System.out.println("Occupied: " + (isOccupied ? "Yes" : "No"));
     if (isOccupied) {
         System.out.println("Vehicle Details:");
         vehicle.displayDetails();
     }
 }
}

//Class representing the Parking Lot Management System
class ParkingLot {
 private ParkingSlot[] slots;
 private int slotCount;

 // Constructor
 public ParkingLot(int capacity) {
     slots = new ParkingSlot[capacity];
     for (int i = 0; i < capacity; i++) {
         slots[i] = new ParkingSlot(i + 1); // Slot numbers start from 1
     }
     slotCount = capacity;
 }

 // Method to park a vehicle
 public boolean parkVehicle(Vehicle vehicle) {
     for (ParkingSlot slot : slots) {
         if (!slot.isOccupied()) {
             if (slot.allocateVehicle(vehicle)) {
                 System.out.println("Vehicle parked in slot number: " + slot.slotNumber);
                 return true;
             }
         }
     }
     System.out.println("No available slots for parking.");
     return false;
 }

 // Method to release a vehicle from a slot
 public void releaseVehicle(int slotNumber) {
     if (slotNumber > 0 && slotNumber <= slotCount) {
         ParkingSlot slot = slots[slotNumber - 1];
         if (slot.isOccupied()) {
             slot.releaseVehicle();
             System.out.println("Vehicle released from slot number: " + slotNumber);
         } else {
             System.out.println("Slot number " + slotNumber + " is already empty.");
         }
     } else {
         System.out.println("Invalid slot number.");
     }
 }

 // Method to display all slots
 public void displaySlots() {
     System.out.println("Parking Slots:");
     for (ParkingSlot slot : slots) {
         slot.displaySlotDetails();
         System.out.println();
     }
 }
}

//Main class to manage the parking lot system
public class demo46 {
 public static void main(String[] args) {
     // Create an instance of the parking lot
     ParkingLot parkingLot = new ParkingLot(5); // 5 parking slots

// Create vehicles
     Vehicle car1 = new Car("ABC123", "John Doe", "Sedan");
     Vehicle bike1 = new Bike("XYZ789", "Jane Smith", "Sport");

     // Park vehicles
     parkingLot.parkVehicle(car1);
     parkingLot.parkVehicle(bike1);

     // Display all parking slots
     parkingLot.displaySlots();

     // Release a vehicle from a slot
     parkingLot.releaseVehicle(1); // Release vehicle from slot 1

     // Display all parking slots after release
     parkingLot.displaySlots();
 }
}
