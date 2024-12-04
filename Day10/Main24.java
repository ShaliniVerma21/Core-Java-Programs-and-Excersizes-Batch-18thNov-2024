package Day10;
//Mobile Recharge
class MobileRecharge {
    private String mobileNumber;
    private String operator;
    private int rechargeAmount;

    // Constructor
    public MobileRecharge(String mobileNumber, String operator, int rechargeAmount) {
        this.mobileNumber = mobileNumber;
        this.operator = operator;
        this.rechargeAmount = rechargeAmount;
    }

    // Method to recharge mobile
    public void recharge() {
        System.out.println("Recharged " + mobileNumber + " with " + rechargeAmount + " rupees on " + operator);
    }
}

// Example usage
public class Main24 {
    public static void main(String[] args) {
        MobileRecharge recharge = new MobileRecharge("9876543210", "Airtel", 100);
        recharge.recharge();
    }
}