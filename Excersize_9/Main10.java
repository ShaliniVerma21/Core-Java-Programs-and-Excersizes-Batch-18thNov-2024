package Excersize_9;
// Fitness Tracker
class FitnessTracker {
    private String userName;
    private int steps;
    private double distance;

    // Constructor
    public FitnessTracker(String userName, int steps, double distance) {
        this.userName = userName;
        this.steps = steps;
        this.distance = distance;
    }

    // Method to display fitness details
    public void displayFitnessDetails() {
        System.out.println(":User  " + userName + ", Steps: " + steps + ", Distance: " + distance + " km");
    }
}

// Example usage
public class Main10 {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker("Aarav", 10000, 8.0);
        tracker.displayFitnessDetails();
    }
}