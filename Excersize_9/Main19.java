package Excersize_9;
//Event Management
class Event {
    private String eventName;
    private String date;
    private String location;

    // Constructor
    public Event(String eventName, String date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

    // Method to display event details
    public void displayEventDetails() {
        System.out.println("Event: " + eventName + ", Date: " + date + ", Location: " + location);
    }
}

// Example usage
public class Main19 {
    public static void main(String[] args) {
        Event event = new Event("Wedding", "20-11-2022", "Delhi");
        event.displayEventDetails();
    }
}