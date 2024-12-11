package Assignement_3;
//Custom T-Shirt Designer 👕: Design and order custom T-shirts.

//Base class for TShirt
class TShirt {
 protected String size;
 protected String color;
 protected String design;

 // Constructor
 public TShirt(String size, String color, String design) {
     this.size = size;
     this.color = color;
     this.design = design;
 }

 // Method to display T-shirt details
 public void displayDetails() {
     System.out.println("T-Shirt Size: " + size);
     System.out.println("T-Shirt Color: " + color);
     System.out.println("T-Shirt Design: " + design);
 }
}

//Derived class for CustomTShirt
class CustomTShirt extends TShirt {
 private static int orderCount = 0; // Static variable to keep track of total orders

 // Constructor
 public CustomTShirt(String size, String color, String design) {
     super(size, color, design);
     orderCount++; // Increment order count
 }

 // Method to calculate price based on size
 public double calculatePrice() {
     double basePrice = 20.0; // Base price for a T-shirt
     switch (size.toLowerCase()) {
         case "s":
             return basePrice;
         case "m":
             return basePrice + 2.0; // Extra for medium
         case "l":
             return basePrice + 4.0; // Extra for large
         case "xl":
             return basePrice + 6.0; // Extra for extra large
         default:
             return basePrice; // Default price
     }
 }

 // Method to display custom T-shirt details
 public void displayCustomTShirtDetails() {
     displayDetails(); // Call the superclass method
     System.out.println("Price: $" + calculatePrice());
     System.out.println("Total Orders: " + getOrderCount());
 }

 // Static method to get total orders
 public static int getOrderCount() {
     return orderCount;
 }
}

//Final class for OrderReport
final class OrderReport {
 private String reportTitle;

 // Constructor
 public OrderReport(String reportTitle) {
     this.reportTitle = reportTitle;
 }

 // Method to display report
 public void displayReport() {
     System.out.println("Order Report: " + reportTitle);
 }
}

//Main class
public class demo13 {
 public static void main(String[] args) {
     // Create custom T-shirts
     CustomTShirt tShirt1 = new CustomTShirt("M", "Blue", "Cool Design");
     tShirt1.displayCustomTShirtDetails();

     CustomTShirt tShirt2 = new CustomTShirt("L", "Red", "Awesome Design");
     tShirt2.displayCustomTShirtDetails();

     // Create and display an order report
     OrderReport report = new OrderReport("Monthly Custom T-Shirt Order Report");
     report.displayReport();
 }
}