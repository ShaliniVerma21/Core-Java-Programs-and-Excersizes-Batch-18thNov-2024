package Day25;
//TreeMap

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class C6 {

    public static void main(String[] args) {
        // Create a TreeMap to manage products in the inventory
        TreeMap<String, Product> inventory = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Update Product");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new product
                    addProduct(inventory, scanner);
                    break;

                case 2:
                    // View all products
                    viewProducts(inventory);
                    break;

                case 3:
                    // Search for a specific product
                    searchProduct(inventory, scanner);
                    break;

                case 4:
                    // Remove a product
                    removeProduct(inventory, scanner);
                    break;

                case 5:
                    // Update product information
                    updateProduct(inventory, scanner);
                    break;

                case 0:
                    System.out.println("Exiting the Inventory Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Method to add a product to the inventory
    private static void addProduct(TreeMap<String, Product> inventory, Scanner scanner) {
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        Product newProduct = new Product(name, price);
        inventory.put(name, newProduct);
        System.out.println("Product added: " + newProduct);
    }

    // Method to view all products in the inventory
    private static void viewProducts(TreeMap<String, Product> inventory) {
        if (inventory.isEmpty()) {
            System.out.println("No products available in the inventory.");
        } else {
            System.out.println("Current Products in the Inventory:");
            for (Map.Entry<String, Product> entry : inventory.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    // Method to search for a specific product
    private static void searchProduct(TreeMap<String, Product> inventory, Scanner scanner) {
        System.out.print("Enter product name to search for: ");
        String searchName = scanner.nextLine();
        if (inventory.containsKey(searchName)) {
            System.out.println("Product found: " + inventory.get(searchName));
        } else {
            System.out.println("Product not found: " + searchName);
        }
    }

    // Method to remove a product from the inventory
    private static void removeProduct(TreeMap<String, Product> inventory, Scanner scanner) {
        System.out.print("Enter product name to remove: ");
        String removeName = scanner.nextLine();
        if (inventory.remove(removeName) != null) {
            System.out.println("Product removed: " + removeName);
        } else {
            System.out.println("Product not found: " + removeName);
        }
    }

    // Method to update product information
    private static void updateProduct(TreeMap<String, Product> inventory, Scanner scanner) {
        System.out.print("Enter product name to update: ");
        String updateName = scanner.nextLine();
        if (inventory.containsKey(updateName)) {
            System.out.print("Enter new product price: ");
            double newPrice = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            Product updatedProduct = new Product(updateName, newPrice);
            inventory.put(updateName, updatedProduct);
            System.out.println("Product updated: " + updatedProduct);
        } else {
            System.out.println("Product not found: " + updateName);
        }
    }
}