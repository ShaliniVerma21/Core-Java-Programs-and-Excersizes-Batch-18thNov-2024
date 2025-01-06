package Day22;
//Ticket Booking System using Multi threading

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Class representing a ticket
class Ticket {
    private final int ticketId; // Unique identifier for the ticket
    private boolean booked; // Status of the ticket

    public Ticket(int ticketId) {
        this.ticketId = ticketId; // Initialize ticket ID
        this.booked = false; // Initially, the ticket is not booked
    }

    public int getTicketId() {
        return ticketId; // Getter for ticket ID
    }

    // Synchronized method to book the ticket
    public synchronized boolean book() {
        if (!booked) {
            booked = true; // Mark the ticket as booked
            System.out.println("Ticket " + ticketId + " booked successfully.");
            return true; // Return true if booking is successful
        } else {
            System.out.println("Ticket " + ticketId + " is already booked.");
            return false; // Return false if the ticket is already booked
        }
    }

    // Synchronized method to check if the ticket is booked
    public synchronized boolean isBooked() {
        return booked; // Check if the ticket is booked
    }
}

// Class representing a ticket booking agent
class BookingAgent implements Runnable {
    private final Ticket ticket; // Ticket to be booked

    public BookingAgent(Ticket ticket) {
        this.ticket = ticket; // Initialize the ticket
    }

    @Override
    public void run() {
        // Attempt to book the ticket
        if (ticket.book()) {
            // Simulate some processing time after booking
            try {
                Thread.sleep(1000); // Simulate time taken to process the booking
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}

// Class representing a ticket booking system
class TicketBookingSystem {
    private final List<Ticket> tickets; // List of available tickets

    public TicketBookingSystem(int numberOfTickets) {
        tickets = new ArrayList<>(); // Initialize the list of tickets
        for (int i = 1; i <= numberOfTickets; i++) {
            tickets.add(new Ticket(i)); // Create tickets and add to the list
        }
    }

    // Method to book tickets using multiple agents
    public void bookTickets() {
        // Create a thread pool for booking agents
        ExecutorService executor = Executors.newFixedThreadPool(3); // 3 agents can book tickets concurrently

        // Create and submit booking agents for each ticket
        for (Ticket ticket : tickets) {
            BookingAgent agent = new BookingAgent(ticket); // Create a booking agent
            executor.submit(agent); // Submit the agent to the executor
        }

        // Shutdown the executor service
        executor.shutdown();
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Force shutdown if not terminated
            }
        } catch (InterruptedException e) {
            executor.shutdownNow(); // Force shutdown on interruption
        }

        System.out.println("Ticket Booking System has completed processing.");
    }

    // Method to display available tickets
    public void displayAvailableTickets() {
        System.out.println("Available Tickets:");
        for (Ticket ticket : tickets) {
            if (!ticket.isBooked()) {
                System.out.println("Ticket ID: " + ticket.getTicketId());
            }
        }
    }
}

// Main class to execute the Ticket Booking System
public class demo30 {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = new TicketBookingSystem(5); // Create a booking system with 5 tickets
        bookingSystem.displayAvailableTickets(); // Display available tickets
        bookingSystem.bookTickets(); // Start the ticket booking process
        bookingSystem.displayAvailableTickets(); // Display available tickets after booking
    }
}