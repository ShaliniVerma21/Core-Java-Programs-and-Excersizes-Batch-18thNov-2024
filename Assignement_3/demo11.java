package Assignement_3;
//Adventure Trip Organizer 🏕️: Plan and schedule adventure trips.

//Base class for Trip
class Trip {
 private String destination;
 private String date;

 // Constructor
 public Trip(String destination, String date) {
     this.destination = destination;
     this.date = date;
 }

 // Method to display trip details
 public void displayTripDetails() {
     System.out.println("Destination: " + destination);
     System.out.println("Date: " + date);
 }
}

//Derived class for AdventureTrip
class AdventureTrip extends Trip {
 private String activity;
 private int participants;
 private static int totalTrips = 0; // Static variable to keep track of total trips

 // Constructor
 public AdventureTrip(String destination, String date, String activity, int participants) {
     super(destination, date);
     this.activity = activity;
     this.participants = participants;
     totalTrips++; // Increment total trips
 }

 // Method to display adventure trip details
 public void displayAdventureTripDetails() {
     displayTripDetails(); // Call the superclass method
     System.out.println("Activity: " + activity);
     System.out.println("Participants: " + participants);
 }

 // Recursive method to calculate total participants
 public int calculateTotalParticipants(int index) {
     if (index <= 0) {
         return 0; // Base case
     }
     return participants + calculateTotalParticipants(index - 1); // Recursive case
 }

 // Static method to get total trips
 public static int getTotalTrips() {
     return totalTrips;
 }
}

//Final class for TripReport
final class TripReport {
 private String reportTitle;

 // Constructor
 public TripReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Trip Report: " + reportTitle);
 }
}

//Main class
public class demo11 {
 public static void main(String[] args) {
     // Create an adventure trip
     AdventureTrip trip1 = new AdventureTrip("Grand Canyon", "2023-09-15", "Hiking", 5);
     trip1.displayAdventureTripDetails();

     // Create another adventure trip
     AdventureTrip trip2 = new AdventureTrip("Yosemite National Park", "2023-10-10", "Rock Climbing", 3);
     trip2.displayAdventureTripDetails();

     // Calculate total participants for trip1
     int totalParticipantsTrip1 = trip1.calculateTotalParticipants(1); // Assuming 1 session
     System.out.println("Total Participants in Trip 1: " + totalParticipantsTrip1);

     // Display total trips using static method
     System.out.println("Total Adventure Trips Organized: " + AdventureTrip.getTotalTrips());

     // Create and display a trip report
     TripReport report = new TripReport("Monthly Adventure Trip Report");
     report.displayReport();
 }
}