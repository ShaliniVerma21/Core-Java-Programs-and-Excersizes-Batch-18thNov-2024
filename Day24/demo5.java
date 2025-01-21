package Day24;

/*
1. Railway Reservation System:

Java-based railway applications are designed to manage train schedules, ticket 
booking, and passenger details, leveraging Java collections for efficient data 
management and object-oriented programming (OOP) principles for modular and 
scalable design.

Features and Modules:

1. **Train Schedule Management**:
   - Maintain a schedule of trains with details such as train ID, name, 
     source, destination, timings, and availability of seats.
   - Use Java collections (e.g., HashMap, ArrayList) to store and manage 
     train schedules.
   - Implement methods to add, update, or remove train details.

2. **Passenger Accounts and Authentication**:
   - Enable passenger registration and secure login functionality.
   - Maintain passenger profiles with personal details, travel history, and 
     preferences.
   - Implement role-based access control for passengers and administrators.

3. **Ticket Booking and Cancellation**:
   - Allow passengers to book, update, or cancel tickets.
   - Use collections like HashMap or LinkedHashMap to store booking details 
     with passenger information, train details, and seat numbers.
   - Calculate ticket fares dynamically based on travel distance and class.

4. **Train Search and Availability**:
   - Allow users to search trains by source, destination, and travel date.
   - Display available trains with seat availability and fare details.
   - Use efficient search algorithms for a responsive user experience.

5. **Payment Processing**:
   - Integrate payment gateways to handle transactions securely.
   - Support multiple payment options, such as credit cards, wallets, and 
     net banking.
   - Use APIs to validate payments and update booking statuses.

6. **Admin Dashboard**:
   - Provide tools for administrators to manage train schedules, bookings, and 
     passenger details.
   - Generate reports on booking trends, revenue, and train utilization.
   - Monitor application performance and resolve issues.

Technology Stack:
- Core Java
- OOP Concepts
- Collection Framework
- Java Built-In methods

Example Implementation Steps:
- Step 1: Design the database schema with tables like Trains, Passengers, 
  Bookings, and Payments.
- Step 2: Implement user authentication and session management.
- Step 3: Build train schedule and ticket booking features using collections.
- Step 4: Add payment integration and admin tools.
- Step 5: Implement search, availability check, and reporting functionalities.

Scalability and Security:
- Use multithreading to handle concurrent users and high traffic.
- Secure sensitive data like user passwords and payment information with 
  encryption.
- Employ input validation and error handling to prevent vulnerabilities.

Objective:
To develop a robust, secure, and user-friendly railway reservation system 
that streamlines ticket booking while providing efficient tools for administrators 
to manage operations.
*/
import java.util.*;

class Train {
    private String trainId;
    private String name;
    private String source;
    private String destination;
    private String timing;
    private int availableSeats;
    private double baseFare; // Base fare for the train

    public Train(String trainId, String name, String source, String destination, String timing, int availableSeats, double baseFare) {
        this.trainId = trainId;
        this.name = name;
        this.source = source;
        this.destination = destination;
        this.timing = timing;
        this.availableSeats = availableSeats;
        this.baseFare = baseFare;
    }

    public String getTrainId() {
        return trainId;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getTiming() {
        return timing;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void bookSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        } else {
            System.out.println("No seats available.");
        }
    }

    public void cancelSeat() {
        availableSeats++;
    }

    @Override
    public String toString() {
        return "Train ID: " + trainId + ", Name: " + name + ", Source: " + source + ", Destination: " + destination + ", Timing: " + timing + ", Available Seats: " + availableSeats + ", Base Fare: " + baseFare;
    }
}

class Passenger {
    private String name;
    private String email;
    private String password;
    private List<Booking> bookings;

    public Passenger(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.bookings = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public String getName() {
        return name;
    }
}

class Booking {
    Train train;
    private Passenger passenger;
    private String seatNumber;
    private double fare;

    public Booking(Train train, Passenger passenger, String seatNumber, double fare) {
        this.train = train;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.fare = fare;
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {
        return "Booking [Train: " + train.getName() + ", Passenger: " + passenger.getEmail() + ", Seat: " + seatNumber + ", Fare: " + fare + "]";
    }
}

class Payment {
    private String paymentId;
    private double amount;
    private String paymentMethod; // e.g., Credit Card, Wallet
    private boolean status; // true for success, false for failure

    public Payment(String paymentId, double amount, String paymentMethod) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = false; // Default status is failure
    }

    public void processPayment() {
        // Simulate payment processing
        this.status = true; // Assume payment is successful
        System.out.println("Payment of " + amount + " processed successfully using " + paymentMethod);
    }

    public boolean isSuccessful() {
        return status;
    }
}

class RailwayReservationSystem {
    private Map<String, Train> trains;
    private Map<String, Passenger> passengers;
    private List<Booking> bookingHistory;

    public RailwayReservationSystem() {
        trains = new HashMap<>();
        passengers = new HashMap<>();
        bookingHistory = new ArrayList<>();
    }

    public void addTrain(Train train) {
        trains.put(train.getTrainId(), train);
    }

    public void registerPassenger(Passenger passenger) {
        passengers.put(passenger.getEmail(), passenger);
    }

    public Train searchTrain(String source, String destination) {
        for (Train train : trains.values()) {
            if (train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination)) {
                return train;
            }
        }
        return null;
    }

    public Booking bookTicket(String email, String trainId, String seatNumber) {
        Passenger passenger = passengers.get(email);
        Train train = trains.get(trainId);
        if (passenger != null && train != null && train.getAvailableSeats() > 0) {
            double fare = calculateFare(train);
            train.bookSeat();
            Booking booking = new Booking(train, passenger, seatNumber, fare);
            passenger.addBooking(booking);
            bookingHistory.add(booking);
            return booking;
        }
        System.out.println("Booking failed: Invalid passenger or train, or no available seats.");
        return null;
    }

    private double calculateFare(Train train) {
        // Example logic for fare calculation based on distance and class
        return train.getBaseFare() * 1.2; // Assuming a fixed multiplier for simplicity
    }

    public void cancelTicket(String email, Booking booking) {
        Passenger passenger = passengers.get(email);
        if (passenger != null && passenger.getBookings().remove(booking)) {
            booking.train.cancelSeat();
            System.out.println("Booking cancelled: " + booking);
        } else {
            System.out.println("Booking not found.");
        }
    }

    public void displayTrains() {
        for (Train train : trains.values()) {
            System.out.println(train);
        }
    }

    public void displayBookingHistory() {
        System.out.println("Booking History:");
        for (Booking booking : bookingHistory) {
            System.out.println(booking);
        }
    }

    public void viewPassengerBookings(String email) {
        Passenger passenger = passengers.get(email);
        if (passenger != null) {
            System.out.println("Bookings for " + passenger.getName() + ":");
            for (Booking booking : passenger.getBookings()) {
                System.out.println(booking);
            }
        } else {
            System.out.println("Passenger not found.");
        }
    }
}

class Admin {
    private RailwayReservationSystem system;

    public Admin(RailwayReservationSystem system) {
        this.system = system;
    }

    public void addTrain(String trainId, String name, String source, String destination, String timing, int availableSeats, double baseFare) {
        Train train = new Train(trainId, name, source, destination, timing, availableSeats, baseFare);
        system.addTrain(train);
        System.out.println("Train added: " + train);
    }

    public void viewAllTrains() {
        System.out.println("Available Trains:");
        system.displayTrains();
    }
}

public class demo5 {
    public static void main(String[] args) {
        RailwayReservationSystem railwaySystem = new RailwayReservationSystem();
        Admin admin = new Admin(railwaySystem);

        // Adding realistic Indian trains
        admin.addTrain("T001", "Rajdhani Express", "New Delhi", "Mumbai", "17:10", 200, 1500.00);
        admin.addTrain("T002", "Shatabdi Express", "New Delhi", "Amritsar", "15:00", 150, 800.00);
        admin.addTrain("T003", "Duronto Express", "Kolkata", "Delhi", "20:00", 180, 1200.00);
        admin.addTrain("T004", "Nizamuddin Express", "Hyderabad", "Delhi", "22:00", 120, 1000.00);
        admin.addTrain("T005", "Konkan Kanya Express", "Mumbai", "Kochi", "06:00", 100, 900.00);
        admin.addTrain("T006", "Jan Shatabdi", "Lucknow", "Kanpur", "08:00", 80, 600.00);

        // Registering passengers
        Passenger passenger1 = new Passenger("Rahul Sharma", "rahul@example.com", "password123");
        railwaySystem.registerPassenger(passenger1);
        Passenger passenger2 = new Passenger("Anjali Verma", "anjali@example.com", "password456");
        railwaySystem.registerPassenger(passenger2);

        // Searching for trains
        Train foundTrain = railwaySystem.searchTrain("New Delhi", "Mumbai");
        if (foundTrain != null) {
            System.out.println("Found Train: " + foundTrain);
            // Booking a ticket
            Booking booking = railwaySystem.bookTicket("rahul@example.com", foundTrain.getTrainId(), "1A");
            if (booking != null) {
                System.out.println("Ticket booked: " + booking);
            }
        } else {
            System.out.println("No trains found.");
        }

        // Displaying all trains
        admin.viewAllTrains();

        // Displaying booking history
        railwaySystem.displayBookingHistory();

        // Viewing passenger bookings
        railwaySystem.viewPassengerBookings("rahul@example.com");
        railwaySystem.viewPassengerBookings("anjali@example.com");
    }
}