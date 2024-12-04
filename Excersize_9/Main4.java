package Excersize_9;
//E-commerce Order
class Order {
    private String orderId;
    private String productName;
    private int quantity;

    // Constructor
    public Order(String orderId, String productName, int quantity) {
        this.orderId = orderId;
        this.productName = productName;
        this.quantity = quantity;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Product: " + productName + ", Quantity: " + quantity);
    }
}

// Example usage
public class Main4 {
    public static void main(String[] args) {
        Order order = new Order("ORD123", "Smartphone", 2);
        order.displayOrderDetails();
    }
}