package Assignement_3;
//Flight Reservation System ✈️: Manage flights, passengers, and ticket status.

//Abstract class representing a Person4
abstract class Person4 {
 protected String name;
 protected String contact;

 // Constructor
 public Person4(String name, String contact) {
     this.name = name;
     this.contact = contact;
 }

 // Abstract method to display Person4 details
 public abstract void displayDetails();
}

//Concrete class representing a Passenger
class Passenger extends Person4 {
 String passportNumber;

 // Constructor
 public Passenger(String name, String contact, String passportNumber) {
     super(name, contact);
     this.passportNumber = passportNumber;
 }

 // Method to display passenger details
 @Override
 public void displayDetails() {
     System.out.println("Passenger Name: " + name);
     System.out.println("Contact: " + contact);
     System.out.println("Passport Number: " + passportNumber);
 }
}

//Class representing a Flight
class Flight {
 private String flightNumber;
 private String destination;
 private boolean isAvailable;
 private double ticketPrice;

 // Constructor
 public Flight(String flightNumber, String destination, double ticketPrice) {
     this.flightNumber = flightNumber;
     this.destination = destination;
     this.isAvailable = true; // Flight is available by default
     this.ticketPrice = ticketPrice;
 }

 // Method to book a flight
 public boolean bookFlight() {
     if (isAvailable) {
         isAvailable = false;
         return true;
     }
     return false;
 }

 // Method to cancel a flight
 public void cancelFlight() {
     isAvailable = true;
 }

 // Method to check availability
 public boolean isAvailable() {
     return isAvailable;
 }

 // Method to display flight details
 public void displayFlightDetails() {
     System.out.println("Flight Number: " + flightNumber);
     System.out.println("Destination: " + destination);
     System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
     System.out.println("Ticket Price: $" + ticketPrice);
 }

 // Getter for flightNumber
 public String getFlightNumber() {
     return flightNumber;
 }
}

//Class representing the Flight Reservation System
class FlightReservationSystem {
 private Flight[] flights;
 private Passenger[] passengers;
 private int flightCount;
 private int passengerCount;

 // Constructor
 public FlightReservationSystem(int flightCapacity, int passengerCapacity) {
     flights = new Flight[flightCapacity];
     passengers = new Passenger[passengerCapacity];
     flightCount = 0;
     passengerCount = 0;
 }

 // Method to add a flight
 public void addFlight(Flight flight) {
     if (flightCount < flights.length) {
         flights[flightCount] = flight;
         flightCount++;
         System.out.println("Flight added: " + flight.getFlightNumber());
     } else {
         System.out.println("Flight list is full. Cannot add more flights.");
     }
 }

 // Method to add a passenger
 public void addPassenger(Passenger passenger) {
     if (passengerCount < passengers.length) {
         passengers[passengerCount] = passenger;
         passengerCount++;
         System.out.println("Passenger added: " + passenger.name);
     } else {
         System.out.println("Passenger list is full. Cannot add more passengers.");
     }
 }

 // Method to book a flight for a passenger
 public void bookFlight(String flightNumber, String passportNumber) {
     Flight flightToBook = null;
     for (Flight flight : flights) {
         if (flight != null && flight.getFlightNumber().equals(flightNumber) && flight.isAvailable()) {
             flightToBook = flight;
             break;
         }
     }

     if (flightToBook != null) {
         for (Passenger passenger : passengers) {
             if (passenger != null && passenger.passportNumber.equals(passportNumber)) {
                 if (flightToBook.bookFlight()) {
                     System.out.println("Flight " + flightNumber + " booked for passenger: " + passenger.name);
                 } else {
                     System.out.println("Flight " + flightNumber + " is already booked.");
                 }
                 return;
             }
         }
         System.out.println("Passenger not found with passport number: " + passportNumber);
     } else {
         System.out.println("Flight not available or does not exist.");
     }
 }

 // Method to display all flights
 public void displayFlights() {
     System.out.println("Available Flights:");
     for (Flight flight : flights) {
         if (flight != null) {
             flight.displayFlightDetails();
             System.out.println();
         }
     }
}

 // Method to display all passengers
 public void displayPassengers() {
     System.out.println("Registered Passengers:");
     for (Passenger passenger : passengers) {
         if (passenger != null) {
             passenger.displayDetails();
             System.out.println();
         }
     }
 }
}

//Main class to manage the flight reservation system
public class demo44 {
 public static void main(String[] args) {
     // Create an instance of the flight reservation system
     FlightReservationSystem reservationSystem = new FlightReservationSystem(5, 5); // 5 flight and passenger capacity

     // Create flights
     Flight flight1 = new Flight("FL123", "New York", 300.00);
     Flight flight2 = new Flight("FL456", "Los Angeles", 250.00);

     // Create passengers
     Passenger passenger1 = new Passenger("Alice Johnson", "123-456-7890", "P123456");
     Passenger passenger2 = new Passenger("Bob Smith", "987-654-3210", "P654321");

     // Add flights and passengers to the reservation system
     reservationSystem.addFlight(flight1);
     reservationSystem.addFlight(flight2);
     reservationSystem.addPassenger(passenger1);
     reservationSystem.addPassenger(passenger2);

     // Display all flights and passengers
     reservationSystem.displayFlights();
     reservationSystem.displayPassengers();

     // Book a flight for a passenger
     reservationSystem.bookFlight("FL123", "P123456"); // Book flight1 for passenger1

     // Display all flights after booking
     reservationSystem.displayFlights();
 }
}