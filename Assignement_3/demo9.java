package Assignement_3;
//Bus Ticket Booking System 🚌: Seat booking and route management.
//Bus Ticket Booking System 

//Abstract class representing a Bus
abstract class Bus {
 protected String busNumber;
 protected String route;
 protected int totalSeats;
 protected int availableSeats;

 // Constructor
 public Bus(String busNumber, String route, int totalSeats) {
     this.busNumber = busNumber;
     this.route = route;
     this.totalSeats = totalSeats;
     this.availableSeats = totalSeats;
 }

 // Method to book a seat
 public void bookSeat() {
     if (availableSeats > 0) {
         availableSeats--;
         System.out.println("Seat booked successfully. Remaining seats: " + availableSeats);
     } else {
         System.out.println("No seats available.");
     }
 }

 // Method to cancel a booking
 public void cancelBooking() {
     if (availableSeats < totalSeats) {
         availableSeats++;
         System.out.println("Booking cancelled successfully. Remaining seats: " + availableSeats);
     } else {
         System.out.println("No bookings to cancel.");
     }
 }

 // Abstract method to display bus details
 public abstract void displayDetails();
}

//Concrete class representing a Volvo Bus
class VolvoBus extends Bus {
 private int fare;

 // Constructor
 public VolvoBus(String busNumber, String route, int totalSeats, int fare) {
     super(busNumber, route, totalSeats);
     this.fare = fare;
 }

 // Method to display bus details
 @Override
 public void displayDetails() {
     System.out.println("Bus Number: " + busNumber);
     System.out.println("Route: " + route);
     System.out.println("Total Seats: " + totalSeats);
     System.out.println("Available Seats: " + availableSeats);
     System.out.println("Fare: " + fare);
 }
}

//Concrete class representing a Deluxe Bus
class DeluxeBus extends Bus {
 private int fare;

 // Constructor
 public DeluxeBus(String busNumber, String route, int totalSeats, int fare) {
     super(busNumber, route, totalSeats);
     this.fare = fare;
 }

 // Method to display bus details
 @Override
 public void displayDetails() {
     System.out.println("Bus Number: " + busNumber);
     System.out.println("Route: " + route);
     System.out.println("Total Seats: " + totalSeats);
     System.out.println("Available Seats: " + availableSeats);
     System.out.println("Fare: " + fare);
 }
}

//Interface representing a Route
interface Route {
 void displayRoute();
}

//Class implementing the Route interface
class RouteImpl implements Route {
 private String routeName;

 // Constructor
 public RouteImpl(String routeName) {
     this.routeName = routeName;
 }

 // Method to display route
 @Override
 public void displayRoute() {
     System.out.println("Route Name: " + routeName);
 }
}

//Class representing a Bus Ticket Booking System
public class demo9 {
 public static void main(String[] args) {
     // Create buses
     VolvoBus volvoBus = new VolvoBus("KA-01-1234", "Bangalore - Chennai", 50, 1000);
     DeluxeBus deluxeBus = new DeluxeBus("KA-02-5678", "Bangalore - Hyderabad", 40, 800);

     // Create routes
     RouteImpl route1 = new RouteImpl("Bangalore - Chennai");
     RouteImpl route2 = new RouteImpl("Bangalore - Hyderabad");

     // Display bus details
     volvoBus.displayDetails();
     deluxeBus.displayDetails();

     // Display routes
     route1.displayRoute();
     route2.displayRoute();

     // Book seats
     volvoBus.bookSeat();
     deluxeBus.bookSeat();

     // Cancel bookings
     volvoBus.cancelBooking();
     deluxeBus.cancelBooking();
 }
}