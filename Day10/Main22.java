package Day10;
//Railway Ticket Booking
class RailwayTicket {
    private String passengerName;
    private String trainNumber;
    private String sourceStation;
    private String destinationStation;
    private int ticketNumber;

    // Constructor
    public RailwayTicket(String passengerName, String trainNumber, String sourceStation, String destinationStation) {
        this.passengerName = passengerName;
        this.trainNumber = trainNumber;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.ticketNumber = generateTicketNumber();
    }

    // Method to generate ticket number
    private int generateTicketNumber() {
        // Generate a unique ticket number
        return (int) (Math.random() * 100000);
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Source Station: " + sourceStation);
        System.out.println("Destination Station: " + destinationStation);
        System.out.println("Ticket Number: " + ticketNumber);
    }
}

// Example usage
public class Main22 {
    public static void main(String[] args) {
        RailwayTicket ticket = new RailwayTicket("Rahul", "12345", "New Delhi", "Mumbai");
        ticket.displayTicketDetails();
    }
}