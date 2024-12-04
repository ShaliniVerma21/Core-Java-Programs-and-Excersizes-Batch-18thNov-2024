package Excersize_9;
//Train Schedule
class Train {
    private String trainName;
    private String source;
    private String destination;
    private String departureTime;

    // Constructor
    public Train(String trainName, String source, String destination, String departureTime) {
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    // Method to display train details
    public void displayTrainDetails() {
        System.out.println("Train: " + trainName + ", From: " + source + ", To: " + destination + ", Departure: " + departureTime);
    }
}

// Example usage
public class Main6 {
    public static void main(String[] args) {
        Train train = new Train("Rajdhani Express", "Delhi", "Kolkata", "10:00 AM");
        train.displayTrainDetails();
    }
}