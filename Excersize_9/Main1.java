package Excersize_9;
//Charity Organization
class Donation {
    private String donorName;
    private double amount;
    private String cause;

    // Constructor
    public Donation(String donorName, double amount, String cause) {
        this.donorName = donorName;
        this.amount = amount;
        this.cause = cause;
    }

    // Method to display donation details
    public void displayDonationDetails() {
        System.out.println("Donor: " + donorName 
        		+ ",\nAmount: " + amount 
        		+ ",\nCause: " + cause);
    }
}

// Example usage
public class Main1 {
    public static void main(String[] args) {
        Donation donation = new Donation("Priya", 5000.0, "Education for Underprivileged");
        donation.displayDonationDetails();
    }
}