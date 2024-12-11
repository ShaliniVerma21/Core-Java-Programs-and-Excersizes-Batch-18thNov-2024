package Assignement_3;
//Real Estate Listing System 🏘️: Property listings, seller-buyer interactions.

//Abstract class representing a Property
abstract class Property {
 protected String propertyId;
 protected String address;
 protected double price;

 // Constructor
 public Property(String propertyId, String address, double price) {
     this.propertyId = propertyId;
     this.address = address;
     this.price = price;
 }

 // Abstract method to display property details
 public abstract void displayDetails();

 // Method to get the price of the property
 public double getPrice() {
     return price;
 }
}

//Concrete class representing a House
class House extends Property {
 private int numberOfRooms;

 // Constructor
 public House(String propertyId, String address, double price, int numberOfRooms) {
     super(propertyId, address, price);
     this.numberOfRooms = numberOfRooms;
 }

 // Method to display property details
 @Override
 public void displayDetails() {
     System.out.println("House ID: " + propertyId);
     System.out.println("Address: " + address);
     System.out.println("Price: $" + price);
     System.out.println("Number of Rooms: " + numberOfRooms);
 }
}

//Concrete class representing an Apartment
class Apartment extends Property {
 private int floorNumber;

 // Constructor
 public Apartment(String propertyId, String address, double price, int floorNumber) {
     super(propertyId, address, price);
     this.floorNumber = floorNumber;
 }

 // Method to display property details
 @Override
 public void displayDetails() {
     System.out.println("Apartment ID: " + propertyId);
     System.out.println("Address: " + address);
     System.out.println("Price: $" + price);
     System.out.println("Floor Number: " + floorNumber);
 }
}

//Class representing the Real Estate Listing System
class RealEstateSystem {
 private Property[] properties;
 private int propertyCount;

 // Constructor
 public RealEstateSystem(int capacity) {
     properties = new Property[capacity];
     propertyCount = 0;
 }

 // Method to add a property
 public void addProperty(Property property) {
     if (propertyCount < properties.length) {
         properties[propertyCount] = property;
         propertyCount++;
         System.out.println("Property added: " + property.propertyId);
     } else {
         System.out.println("Property list is full. Cannot add more properties.");
     }
 }

 // Method to display all properties
 public void displayProperties() {
     System.out.println("Property Listings:");
     for (Property property : properties) {
         if (property != null) {
             property.displayDetails();
             System.out.println();
         }
     }
 }

 // Method to find a property by ID
 public Property findPropertyById(String propertyId) {
     for (Property property : properties) {
         if (property != null && property.propertyId.equals(propertyId)) {
             return property;
         }
     }
     return null; // Property not found
 }

 // Method to simulate a buyer making an offer
 public void makeOffer(String propertyId, double offerPrice) {
     Property property = findPropertyById(propertyId);
     if (property != null) {
         if (offerPrice >= property.getPrice()) {
             System.out.println("Offer accepted for " + propertyId + " at $" + offerPrice);
         } else {
             System.out.println("Offer rejected for " + propertyId + ". Offer price is too low.");
         }
     } else {
         System.out.println("Property not found.");
     }
 }
}

//Main class to manage the real estate system
public class demo40 {
 public static void main(String[] args) {
     // Create an instance of the real estate system
     RealEstateSystem realEstateSystem = new RealEstateSystem(5);

     // Create properties
     Property house1 = new House("H001", "123 Main St", 300000, 4);
     Property apartment1 = new Apartment("A001", "456 Elm St", 200000, 2);

     // Add properties to the real estate system
     realEstateSystem.addProperty(house1);
     realEstateSystem.addProperty(apartment1);

     // Display all properties
     realEstateSystem.displayProperties();

     // Simulate a buyer making an offer
     realEstateSystem.makeOffer("H001", 310000); // Accepted
     realEstateSystem.makeOffer("A001", 150000); // Rejected
     realEstateSystem.makeOffer("A002", 250000); // Not found
 }
}