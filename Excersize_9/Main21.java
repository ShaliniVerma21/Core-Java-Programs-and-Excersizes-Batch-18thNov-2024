package Excersize_9;
//Flight Ticket Booking System
class FlightTicket {
    private String passengerName;
    private String flightNumber;
    private String source;
    private String destination;
    private String departureDate;
    double ticketPrice;

    // Constructor
    public FlightTicket(String passengerName, String flightNumber, String source, String destination, String departureDate, double ticketPrice) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.ticketPrice = ticketPrice;
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Flight Number: " + flightNumber);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Date: " + departureDate);
        System.out.println("Ticket Price: " + ticketPrice);
    }

    // Method to calculate total price for multiple tickets
    public static double calculateTotalPrice(double ticketPrice, int numberOfTickets) {
        return ticketPrice * numberOfTickets;
    }
}

// Example usage
public class Main21 {
    public static void main(String[] args) {
        // Create a flight ticket
        FlightTicket ticket = new FlightTicket("Aarav", "AI202", "Delhi", "Mumbai", "15-12-2022", 5000.0);

        // Display ticket details
        ticket.displayTicketDetails();

        // Calculate total price for 3 tickets
        int numberOfTickets = 3;
        double totalPrice = FlightTicket.calculateTotalPrice(ticket.ticketPrice, numberOfTickets);
        System.out.println("Total Price for " + numberOfTickets + " tickets: " + totalPrice);
    }
}