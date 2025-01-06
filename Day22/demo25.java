package Day22;
// E-commerce System

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Class representing a product in the e-commerce system
class Product {
    private String name; // Product name
    private double price; // Product price

    public Product(String name, double price) {
        this.name = name; // Initialize product name
        this.price = price; // Initialize product price
    }

    public String getName() {
        return name; // Getter for product name
    }

    public double getPrice() {
        return price; // Getter for product price
    }
}

// Class representing a shopping cart
class ShoppingCart {
    private final String userName; // User name
    private final Product[] cart; // Array to hold products
    private int count; // Count of products in the cart

    public ShoppingCart(String userName, int capacity) {
        this.userName = userName; // Initialize user name
        this.cart = new Product[capacity]; // Initialize cart with given capacity
        this.count = 0; // Initialize product count
    }

    // Synchronized method to add a product to the cart
    public synchronized void addProduct(Product product) {
        if (count < cart.length) {
            cart[count++] = product; // Add product to cart
            System.out.println(userName + " added " + product.getName() + " to the cart.");
        } else {
            System.out.println(userName + "'s cart is full.");
        }
    }

    // Method to display the cart contents
    public void displayCart() {
        System.out.println(userName + "'s Cart:");
        for (int i = 0; i < count; i++) {
            System.out.println("- " + cart[i].getName() + ": $" + cart[i].getPrice());
        }
    }
}

// Class representing a user in the e-commerce system
class User implements Runnable {
    private final String userName; // User name
    private final ShoppingCart cart; // User's shopping cart

    public User(String userName, ShoppingCart cart) {
        this.userName = userName; // Initialize user name
        this.cart = cart; // Initialize user's shopping cart
    }

    @Override
    public void run() {
        // Simulate adding products to the cart
        for (int i = 1; i <= 5; i++) {
            Product product = new Product("Product " + i, i * 10.0); // Create a new product
            cart.addProduct(product); // Add product to cart
            try {
                Thread.sleep(1000); // Simulate time taken to add products
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
        cart.displayCart(); // Display the cart contents
    }
}

// Main class to execute the E-commerce System
public class demo25 {
    public static void main(String[] args) {
        // Create a shopping cart for each user
        ShoppingCart cart1 = new ShoppingCart("User  1", 5);
        ShoppingCart cart2 = new ShoppingCart("User  2", 5);

        // Create a thread pool for users
        ExecutorService userExecutor = Executors.newFixedThreadPool(2);

        // Create and start user threads
        userExecutor.submit(new User("User  1", cart1));
        userExecutor.submit(new User("User  2", cart2));

        // Shutdown the executor service
        userExecutor.shutdown();
        try {
            if (!userExecutor.awaitTermination(10, TimeUnit.SECONDS)) {
                userExecutor.shutdownNow(); // Force shutdown if not terminated
            }
        } catch (InterruptedException e) {
            userExecutor.shutdownNow(); // Force shutdown on interruption
        }

        System.out.println("E-commerce System has completed processing.");
    }
}