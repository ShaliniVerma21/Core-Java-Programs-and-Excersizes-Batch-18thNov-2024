package Assignement_3;
//Farmers’ Produce Management System 🌾: Track inventory, pricing, and sales.

//Abstract class representing a Produce Item
abstract class ProduceItem {
 protected String name;
 protected double pricePerUnit; // Price per unit in currency
 protected int quantity; // Quantity in stock

 // Constructor
 public ProduceItem(String name, double pricePerUnit, int quantity) {
     this.name = name;
     this.pricePerUnit = pricePerUnit;
     this.quantity = quantity;
 }

 // Abstract method to display item details
 public abstract void displayItemDetails();

 // Method to calculate total value of the item in stock
 public double calculateTotalValue() {
     return pricePerUnit * quantity;
 }

 // Method to sell a certain quantity of the item
 public boolean sellItem(int quantityToSell) {
     if (quantityToSell <= quantity) {
         quantity -= quantityToSell;
         return true;
     } else {
         System.out.println("Insufficient stock for " + name);
         return false;
     }
 }
}

//Concrete class representing a Fruit
class Fruit extends ProduceItem {
 private static final String TYPE = "Fruit";

 // Constructor
 public Fruit(String name, double pricePerUnit, int quantity) {
     super(name, pricePerUnit, quantity);
 }

 // Method to display item details
 @Override
 public void displayItemDetails() {
     System.out.println("Item Type: " + TYPE);
     System.out.println("Name: " + name);
     System.out.println("Price per Unit: " + pricePerUnit);
     System.out.println("Quantity in Stock: " + quantity);
     System.out.println("Total Value: " + calculateTotalValue());
 }
}

//Concrete class representing a Vegetable
class Vegetable extends ProduceItem {
 private static final String TYPE = "Vegetable";

 // Constructor
 public Vegetable(String name, double pricePerUnit, int quantity) {
     super(name, pricePerUnit, quantity);
 }

 // Method to display item details
 @Override
 public void displayItemDetails() {
     System.out.println("Item Type: " + TYPE);
     System.out.println("Name: " + name);
     System.out.println("Price per Unit: " + pricePerUnit);
     System.out.println("Quantity in Stock: " + quantity);
     System.out.println("Total Value: " + calculateTotalValue());
 }
}

//Class representing the Produce Management System
class ProduceManagementSystem {
 private ProduceItem[] inventory;
 private int itemCount;

 // Constructor
 public ProduceManagementSystem(int capacity) {
     inventory = new ProduceItem[capacity];
     itemCount = 0;
 }

 // Method to add a produce item
 public void addItem(ProduceItem item) {
     if (itemCount < inventory.length) {
         inventory[itemCount] = item;
         itemCount++;
         System.out.println("Item added: " + item.name);
     } else {
         System.out.println("Inventory is full. Cannot add more items.");
     }
 }

 // Method to display all items in inventory
 public void displayInventory() {
     System.out.println("Farmers' Produce Inventory:");
     for (int i = 0; i < itemCount; i++) {
         inventory[i].displayItemDetails();
         System.out.println();
     }
 }

 // Method to sell an item
 public void sellItem(String itemName, int quantityToSell) {
     for (int i = 0; i < itemCount; i++) {
         if (inventory[i].name.equalsIgnoreCase(itemName)) {
             if (inventory[i].sellItem(quantityToSell)) {
                 System.out.println("Sold " + quantityToSell + " units of " + itemName);
             }
             return;
         }
     }
     System.out.println("Item not found: " + itemName);
 }
}

//Main class to manage the Farmers’ Produce Management System
public class demo29 {
 public static void main(String[] args) {
     // Create a Produce Management System with a capacity of 5 items
     ProduceManagementSystem produceSystem = new ProduceManagementSystem(5);

     // Create produce items
     ProduceItem apple = new Fruit("Apple", 2.5, 100);
     ProduceItem carrot = new Vegetable("Carrot", 1.5, 50);

     // Add items to the produce management system
     produceSystem.addItem(apple);
     produceSystem.addItem(carrot);

     // Display inventory
     produceSystem.displayInventory();

     // Sell some items
     produceSystem.sellItem("Apple", 20 );
     produceSystem.sellItem("Carrot", 10);

     // Display updated inventory
     System.out.println("After selling items:");
     produceSystem.displayInventory();
 }
}