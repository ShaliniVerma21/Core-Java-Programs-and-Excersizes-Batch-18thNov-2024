package Assignement_3;
//Vehicle1 Rental System 🚗: Manage Car1/Bike1 rentals with pickup and drop-off status.

//Abstract class representing a Vehicle1
abstract class Vehicle1 {
 protected String licensePlate;
 protected String ownerName;
 protected boolean isRented;

 // Constructor
 public Vehicle1(String licensePlate, String ownerName) {
     this.licensePlate = licensePlate;
     this.ownerName = ownerName;
     this.isRented = false; // Vehicle1 is available by default
 }

 // Abstract method to display Vehicle1 details
 public abstract void displayDetails();

 // Method to rent the Vehicle1
 public boolean rent() {
     if (!isRented) {
         isRented = true;
         return true;
     }
     return false;
 }

 // Method to return the Vehicle1
 public boolean returnVehicle1() {
     if (isRented) {
         isRented = false;
         return true;
     }
     return false;
 }

 // Method to check rental status
 public boolean isRented() {
     return isRented;
 }
}

//Concrete class representing a Car1
class Car1 extends Vehicle1 {
 private String Car1Type;

 // Constructor
 public Car1(String licensePlate, String ownerName, String Car1Type) {
     super(licensePlate, ownerName);
     this.Car1Type = Car1Type;
 }

 // Method to display Car1 details
 @Override
 public void displayDetails() {
     System.out.println("Car1 Type: " + Car1Type);
     System.out.println("License Plate: " + licensePlate);
     System.out.println("Owner Name: " + ownerName);
     System.out.println("Rented: " + (isRented ? "Yes" : "No"));
 }
}

//Concrete class representing a Bike1
class Bike1 extends Vehicle1 {
 private String Bike1Type;

 // Constructor
 public Bike1(String licensePlate, String ownerName, String Bike1Type) {
     super(licensePlate, ownerName);
     this.Bike1Type = Bike1Type;
 }

 // Method to display Bike1 details
 @Override
 public void displayDetails() {
     System.out.println("Bike1 Type: " + Bike1Type);
     System.out.println("License Plate: " + licensePlate);
     System.out.println("Owner Name: " + ownerName);
     System.out.println("Rented: " + (isRented ? "Yes" : "No"));
 }
}

//Class representing the Vehicle1 Rental System
class Vehicle1RentalSystem {
 private Vehicle1[] Vehicle1s;
 private int Vehicle1Count;

 // Constructor
 public Vehicle1RentalSystem(int capacity) {
     Vehicle1s = new Vehicle1[capacity];
     Vehicle1Count = 0;
 }

 // Method to add a Vehicle1
 public void addVehicle1(Vehicle1 Vehicle1) {
     if (Vehicle1Count < Vehicle1s.length) {
         Vehicle1s[Vehicle1Count] = Vehicle1;
         Vehicle1Count++;
         System.out.println("Vehicle1 added: " + Vehicle1.licensePlate);
     } else {
         System.out.println("Vehicle1 list is full. Cannot add more Vehicle1s.");
     }
 }

 // Method to rent a Vehicle1
 public void rentVehicle1(String licensePlate) {
     for (Vehicle1 Vehicle1 : Vehicle1s) {
         if (Vehicle1 != null && Vehicle1.licensePlate.equals(licensePlate)) {
             if (Vehicle1.rent()) {
                 System.out.println("Vehicle1 rented: " + licensePlate);
             } else {
                 System.out.println("Vehicle1 is already rented: " + licensePlate);
             }
             return;
         }
     }
     System.out.println("Vehicle1 not found: " + licensePlate);
 }

 // Method to return a Vehicle1
 public void returnVehicle1(String licensePlate) {
     for (Vehicle1 Vehicle1 : Vehicle1s) {
         if (Vehicle1 != null && Vehicle1.licensePlate.equals(licensePlate)) {
             if (Vehicle1.returnVehicle1()) {
                 System.out.println("Vehicle1 returned: " + licensePlate);
             } else {
                 System.out.println("Vehicle1 was not rented: " + licensePlate);
             }
             return;
         }
     }
     System.out.println("Vehicle1 not found: " + licensePlate);
 }

 // Method to display all Vehicle1s
 public void displayVehicle1s() {
     System.out.println("Vehicle1s in the Rental System:");
     for (Vehicle1 Vehicle1 : Vehicle1s) {
         if (Vehicle1 != null) {
             Vehicle1.displayDetails();
             System.out.println();
         }
     }
 }
}

//Main class to manage the Vehicle1 rental system
public class demo45 {
 public static void main(String[] args) {
     // Create an instance of the Vehicle1 rental system
     Vehicle1RentalSystem rentalSystem = new Vehicle1RentalSystem(5); // 5 Vehicle1 capacity

     // Create Vehicle1s
     Vehicle1 Car11 = new Car1 ("ABC123", "John Doe", "Sedan");
     Vehicle1 Bike11 = new Bike1("XYZ789", "Jane Smith", "Sport");

     // Add Vehicle1s to the rental system
     rentalSystem.addVehicle1(Car11);
     rentalSystem.addVehicle1(Bike11);

     // Display all Vehicle1s
     rentalSystem.displayVehicle1s();

     // Rent a Vehicle1
     rentalSystem.rentVehicle1("ABC123"); // Rent Car11

     // Display all Vehicle1s after renting
     rentalSystem.displayVehicle1s();

     // Return a Vehicle1
     rentalSystem.returnVehicle1("ABC123"); // Return Car11

     // Display all Vehicle1s after returning
     rentalSystem.displayVehicle1s();
 }
}
 