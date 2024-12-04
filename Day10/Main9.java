package Day10;
//PAN Card
class PANCard {
    private String name;
    private String panNumber;
    private String dateOfBirth;

    // Constructor
    public PANCard(String name, String panNumber, String dateOfBirth) {
        this.name = name;
        this.panNumber = panNumber;
        this.dateOfBirth = dateOfBirth;
    }

    // Method to display PAN details
    public void displayPANDetails() {
        System.out.println("Name: " + name);
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

// Example usage
public class Main9 {
    public static void main(String[] args) {
        PANCard pan = new PANCard("Anjali", "ABCDE1234F", "15-05-1990");
        pan.displayPANDetails();
    }
}