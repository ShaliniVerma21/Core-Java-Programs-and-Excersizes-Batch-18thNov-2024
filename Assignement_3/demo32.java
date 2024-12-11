package Assignement_3;
//Eco-Friendly Waste Management System 🌱: Categorize and track waste disposal.

//Abstract class representing a Waste Item
abstract class WasteItem {
 protected String name;
 protected String category; // e.g., Organic, Recyclable, Hazardous
 protected double weight; // in kilograms

 // Constructor
 public WasteItem(String name, String category, double weight) {
     this.name = name;
     this.category = category;
     this.weight = weight;
 }

 // Abstract method to display waste item details
 public abstract void displayDetails();

 // Method to calculate disposal fee based on weight
 public double calculateDisposalFee() {
     return weight * getDisposalRate();
 }

 // Abstract method to get disposal rate
 protected abstract double getDisposalRate();
}

//Concrete class representing Organic Waste
class OrganicWaste extends WasteItem {
 private static final double DISPOSAL_RATE = 0.5; // Fee per kg

 // Constructor
 public OrganicWaste(String name, double weight) {
     super(name, "Organic", weight);
 }

 // Method to display waste item details
 @Override
 public void displayDetails() {
     System.out.println("Waste Item: " + name);
     System.out.println("Category: " + category);
     System.out.println("Weight: " + weight + " kg");
     System.out.println("Disposal Fee: $" + calculateDisposalFee());
 }

 // Method to get disposal rate
 @Override
 protected double getDisposalRate() {
     return DISPOSAL_RATE;
 }
}

//Concrete class representing Recyclable Waste
class RecyclableWaste extends WasteItem {
 private static final double DISPOSAL_RATE = 0.2; // Fee per kg

 // Constructor
 public RecyclableWaste(String name, double weight) {
     super(name, "Recyclable", weight);
 }

 // Method to display waste item details
 @Override
 public void displayDetails() {
     System.out.println("Waste Item: " + name);
     System.out.println("Category: " + category);
     System.out.println("Weight: " + weight + " kg");
     System.out.println("Disposal Fee: $" + calculateDisposalFee());
 }

 // Method to get disposal rate
 @Override
 protected double getDisposalRate() {
     return DISPOSAL_RATE;
 }
}

//Concrete class representing Hazardous Waste
class HazardousWaste extends WasteItem {
 private static final double DISPOSAL_RATE = 2.0; // Fee per kg

 // Constructor
 public HazardousWaste(String name, double weight) {
     super(name, "Hazardous", weight);
 }

 // Method to display waste item details
 @Override
 public void displayDetails() {
     System.out.println("Waste Item: " + name);
     System.out.println("Category: " + category);
     System.out.println("Weight: " + weight + " kg");
     System.out.println("Disposal Fee: $" + calculateDisposalFee());
 }

 // Method to get disposal rate
 @Override
 protected double getDisposalRate() {
     return DISPOSAL_RATE;
 }
}

//Class representing the Waste Management System
class WasteManagementSystem {
 private WasteItem[] wasteItems;
 private int itemCount;

 // Constructor
 public WasteManagementSystem(int capacity) {
     wasteItems = new WasteItem[capacity];
     itemCount = 0;
 }

 // Method to add a waste item
 public void addWasteItem(WasteItem item) {
     if (itemCount < wasteItems.length) {
         wasteItems[itemCount] = item;
         itemCount++;
         System.out.println("Waste item added: " + item.name);
     } else {
         System.out.println("Waste Management System is full. Cannot add more items.");
     }
 }

 // Method to display all waste items
 public void displayAllWasteItems() {
     System.out.println("Waste Management System:");
     for (int i = 0; i < itemCount; i++) {
         wasteItems[i].displayDetails();
         System.out.println();
     }
 }
}

//Main class to manage the Eco-Friendly Waste Management System
public class demo32 {
 public static void main(String[] args) {
     // Create a Waste Management System with a capacity of 5 items
     WasteManagementSystem wasteManagementSystem = new WasteManagementSystem(5);

     // Create waste items
     WasteItem organicWaste = new OrganicWaste("Food Scraps", 10); // 10 kg of organic waste
     WasteItem recyclableWaste = new RecyclableWaste("Plastic Bottles", 5); // 5 kg of recyclable waste
     WasteItem hazardousWaste = new HazardousWaste("Batteries", 2); // 2 kg of hazardous waste

     // Add items to the Waste Management System
     wasteManagementSystem.addWasteItem(organicWaste);
     wasteManagementSystem.addWasteItem(recyclableWaste);
     wasteManagementSystem.addWasteItem(hazardousWaste);

     // Display all waste items
     wasteManagementSystem.displayAllWasteItems();
 }
}