package Excersize_9;
//Aadhaar Card
class AadhaarCard {
    private String name;
    private String aadhaarNumber;
    private String dateOfBirth;
    private String address;

    // Constructor
    public AadhaarCard(String name, String aadhaarNumber, String dateOfBirth, String address) {
        this.name = name;
        this.aadhaarNumber = aadhaarNumber;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    // Method to display Aadhaar details
    public void displayAadhaarDetails() {
        System.out.println("Name: " + name);
        System.out.println("Aadhaar Number: " + aadhaarNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Address: " + address);
    }
}

// Example usage
public class Main25 {
    public static void main(String[] args) {
        AadhaarCard aadhaar = new AadhaarCard("Rahul", "123456789012", "12-02-1995", "New Delhi");
        aadhaar.displayAadhaarDetails();
    }
}