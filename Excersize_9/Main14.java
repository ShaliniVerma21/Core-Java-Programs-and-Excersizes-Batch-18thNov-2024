package Excersize_9;
//Travel Agency
class TravelPackage {
    private String packageName;
    private double price;
    private String duration;

    // Constructor
    public TravelPackage(String packageName, double price, String duration) {
        this.packageName = packageName;
        this.price = price;
        this.duration = duration;
    }

    // Method to display package details
    public void displayPackageDetails() {
        System.out.println("Package: " + packageName + ", Price: " + price + ", Duration: " + duration);
    }
}

// Example usage
public class Main14 {
    public static void main(String[] args) {
        TravelPackage package1 = new TravelPackage("Goa Trip", 15000.0, "5 Days");
        package1.displayPackageDetails();
    }
}