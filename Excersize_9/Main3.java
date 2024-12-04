package Excersize_9;
//Taxi Booking
class Taxi {
    private String driverName;
    private String carModel;
    private double fare;

    // Constructor
    public Taxi(String driverName, String carModel, double fare) {
        this.driverName = driverName;
        this.carModel = carModel;
        this.fare = fare;
    }

    // Method to display taxi details
    public void displayTaxiDetails() {
        System.out.println("Driver: " + driverName + ", Car Model: " + carModel + ", Fare: " + fare);
    }
}

// Example usage
public class Main3 {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("Vikram", "Toyota Innova", 15.0);
        taxi.displayTaxiDetails();
    }
}