package Excersize_9;
//Sports Event
class SportsEvent {
    private String eventName;
    private String date;
    private String location;

    // Constructor
    public SportsEvent(String eventName, String date, String location) {
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
public class Main17 {
    public static void main(String[] args) {
        SportsEvent cricketMatch = new SportsEvent("Cricket World Cup", "15-10-2023", "Mumbai");
        cricketMatch.displayEventDetails();
    }
}