package Assignement_3;
//Hotel Room Booking System 🏨: Room availability, booking, and customer details.

//Abstract class representing a Person3
abstract class Person3 {
 protected String name;
 protected String contact;

 // Constructor
 public Person3(String name, String contact) {
     this.name = name;
     this.contact = contact;
 }

 // Abstract method to display Person3 details
 public abstract void displayDetails();
}

//Concrete class representing a Customer
class Customer extends Person3 {
 private String customerId; // Changed to private for encapsulation

 // Constructor
 public Customer(String name, String contact, String customerId) {
     super(name, contact);
     this.customerId = customerId;
 }

 // Method to display customer details
 @Override
 public void displayDetails() {
     System.out.println("Customer ID: " + customerId);
     System.out.println("Name: " + name);
     System.out.println("Contact: " + contact);
 }

 // Getter for customerId
 public String getCustomerId() {
     return customerId;
 }
}

//Class representing a Room
class Room {
 private int roomNumber;
 private boolean isAvailable;
 private double price;

 // Constructor
 public Room(int roomNumber, double price) {
     this.roomNumber = roomNumber;
     this.isAvailable = true; // Room is available by default
     this.price = price;
 }

 // Method to book the room
 public boolean bookRoom() {
     if (isAvailable) {
         isAvailable = false;
         return true;
     }
     return false;
 }

 // Method to release the room
 public void releaseRoom() {
     isAvailable = true;
 }

 // Method to check availability
 public boolean isAvailable() {
     return isAvailable;
 }

 // Method to get room details
 public void displayRoomDetails() {
     System.out.println("Room Number: " + roomNumber);
     System.out.println("Price: $" + price);
     System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
 }

 // Getter for roomNumber
 public int getRoomNumber() {
     return roomNumber;
 }
}

//Class representing the Hotel Booking System
class HotelBookingSystem {
 private Room[] rooms;
 private Customer[] customers;
 private int roomCount;
 private int customerCount;

 // Constructor
 public HotelBookingSystem(int roomCapacity, int customerCapacity) {
     rooms = new Room[roomCapacity];
     customers = new Customer[customerCapacity];
     roomCount = 0;
     customerCount = 0;
 }

 // Method to add a room
 public void addRoom(Room room) {
     if (roomCount < rooms.length) {
         rooms[roomCount] = room;
         roomCount++;
         System.out.println("Room added: " + room.getRoomNumber());
     } else {
         System.out.println("Room list is full. Cannot add more rooms.");
     }
 }

 // Method to add a customer
 public void addCustomer(Customer customer) {
     if (customerCount < customers.length) {
         customers[customerCount] = customer;
         customerCount++;
         System.out.println("Customer added: " + customer.name);
     } else {
         System.out.println("Customer list is full. Cannot add more customers.");
     }
 }

 // Method to book a room for a customer
 public void bookRoom(int roomNumber, String customerId) {
     for (int i = 0; i < roomCount; i++) {
         if (rooms[i].getRoomNumber() == roomNumber && rooms[i].isAvailable()) {
             rooms[i].bookRoom();
             System.out.println("Room " + roomNumber + " booked for customer ID: " + customerId);
             return;
         }
     }
     System.out.println("Room not available or does not exist.");
 }

 // Method to display all rooms
 public void displayRooms() {
     System.out.println("Rooms in the Hotel:");
     for (int i = 0; i < roomCount; i++) {
         rooms[i].displayRoomDetails();
         System.out.println();
     }
 }

 // Method to display all customers
 public void displayCustomers() {
     System.out.println("Customers in the Hotel:");
     for (int i = 0; i < customerCount; i++) {
         customers[i].displayDetails();
         System.out.println();
     }
 }
}

//Main class to manage the hotel booking system
public class demo47 {
 public static void main(String[] args) {
     // Create an instance of the hotel booking system
     HotelBookingSystem hotel = new HotelBookingSystem(5, 5); // 5 rooms, 5 customers

     // Add rooms to the hotel
     hotel.addRoom(new Room(101, 150.00));
     hotel.addRoom(new Room(102, 200.00));
     hotel.addRoom(new Room(103, 250.00));
     hotel.addRoom(new Room(104, 300.00));
     hotel.addRoom(new Room(105, 350.00));

     // Add customers to the hotel
     Customer customer1 = new Customer("John Doe", "123-456-7890", "CUST001");
     Customer customer2 = new Customer("Jane Smith", "098-765-4321", "CUST002");
     hotel.addCustomer(customer1);
     hotel.addCustomer(customer2);

     // Display all rooms and customers
     hotel.displayRooms();
     hotel.displayCustomers();

     // Book a room for a customer
     hotel.bookRoom(101, customer1.getCustomerId());
     hotel.bookRoom(102, customer2.getCustomerId());

     // Display updated room details
     hotel.displayRooms();
 }
}