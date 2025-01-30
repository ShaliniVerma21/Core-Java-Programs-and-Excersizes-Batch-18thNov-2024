package Day25;
//PriorityQueue
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Ticket {
    String description;
    int priority;

    public Ticket(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}

public class C13 {

    public static void main(String[] args) {
        // Create a PriorityQueue to manage tickets
        PriorityQueue<Ticket> ticketQueue = new PriorityQueue<>(Comparator.comparingInt(t -> t.priority));
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nCustomer Support Ticketing System");
            System.out.println("1. Add Ticket");
            System.out.println("2. View Tickets");
            System.out.println("3. Complete Ticket");
            System.out.println("4. Search Ticket");
            System.out.println("5. Clear All Tickets");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new ticket
                    System.out.print("Enter ticket description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter ticket priority (1-10, where 1 is highest): ");
                    int priority = scanner.nextInt();
                    ticketQueue.add(new Ticket(description, priority));
                    System.out.println("Ticket added: " + description);
                    break;

                case 2:
                    // View all tickets
                    viewTickets(ticketQueue);
                    break;

                case 3:
                    // Complete a ticket
                    if (!ticketQueue.isEmpty()) {
                        Ticket completedTicket = ticketQueue.poll();
                        System.out.println("Completed ticket: " + completedTicket);
                    } else {
                        System.out.println("No tickets to complete.");
                    }
                    break;

                case 4:
                    // Search for a specific ticket
                    System.out.print("Enter ticket description to search for: ");
                    String searchDescription = scanner.nextLine();
                    searchTicket(ticketQueue, searchDescription);
                    break;

                case 5:
                    // Clear all tickets
                    ticketQueue.clear();
                    System.out.println("All tickets cleared.");
                    break;

                case 0:
                    System.out.println("Exiting the Customer Support Ticketing System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to view all tickets in the priority queue
    private static void viewTickets(PriorityQueue<Ticket> ticketQueue) {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets available.");
        } else {
            System.out.println("Current Tickets:");
            for (Ticket ticket : ticketQueue) {
                System.out.println(ticket);
            }
        }
    }

    // Method to search for a specific ticket
    private static void searchTicket(PriorityQueue<Ticket> ticketQueue, String searchDescription) {
        boolean found = false;
        for (Ticket ticket : ticketQueue) {
            if (ticket.description.equalsIgnoreCase(searchDescription)) {
                System.out.println("Ticket found: " + ticket);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Ticket not found: " + searchDescription);
        }
    }
}