package Day10;
//Health Insurance
class HealthInsurance {
    private String policyHolderName;
    private String policyNumber;
    private double coverageAmount;

    // Constructor
    public HealthInsurance(String policyHolderName, String policyNumber, double coverageAmount) {
        this.policyHolderName = policyHolderName;
        this.policyNumber = policyNumber;
        this.coverageAmount = coverageAmount;
    }

    // Method to display insurance details
    public void displayInsuranceDetails() {
        System.out.println("Policy Holder: " + policyHolderName + ", Policy Number: " + policyNumber + ", Coverage Amount: " + coverageAmount);
    }
}

// Example usage
public class Main5 {
    public static void main(String[] args) {
        HealthInsurance insurance = new HealthInsurance("Sita", "H123456", 500000.0);
        insurance.displayInsuranceDetails();
    }
}