package Day21;
import java.util.Scanner;

//Abstract class for common properties
abstract class User {
 private String name;
 private String email;

 public User(String name, String email) {
     this.name = name;
     this.email = email;
 }

 public String getName() {
     return name;
 }

 public String getEmail() {
     return email;
 }

 public abstract void displayInfo();
}

//Customer class inheriting from User
class Customer extends User {
 public Customer(String name, String email) {
     super(name, email);
 }

 @Override
 public void displayInfo() {
     System.out.println("Customer Name: " + getName());
     System.out.println("Customer Email: " + getEmail());
 }
}

//MenuItem class with category
class MenuItem {
 private String name;
 private double price;
 private String category; // Food category

 public MenuItem(String name, double price, String category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 public String getName() {
     return name;
 }

 public double getPrice() {
     return price;
 }

 public String getCategory() {
     return category;
 }

 @Override
 public String toString() {
     return name + " (" + category + ") - $" + price;
 }
}

//Restaurant class
class Restaurant {
 private String name;
 private MenuItem[] menu; // Array to hold menu items
 private int menuCount; // Counter for the number of menu items

 public Restaurant(String name) {
     this.name = name;
     this.menu = new MenuItem[10]; // Assuming a maximum of 10 menu items
     this.menuCount = 0;
 }

 public String getName() {
     return name;
 }

 public void addMenuItem(MenuItem item) {
     if (menuCount < menu.length) {
         menu[menuCount++] = item; // Add item and increment count
     } else {
         System.out.println("Menu is full, cannot add more items.");
     }
 }

 public MenuItem[] getMenu() {
     return menu;
 }

 public void displayMenu() {
     System.out.println("Menu for " + name + ":");
     for (int i = 0; i < menuCount; i++) {
         System.out.println(menu[i]);
     }
 }
}

//Order class
class Order {
 private Customer customer;
 private MenuItem[] items; // Array to hold ordered items
 private int itemCount; // Counter for the number of ordered items

 public Order(Customer customer) {
     this.customer = customer;
     this.items = new MenuItem[10]; // Assuming a maximum of 10 items in an order
     this.itemCount = 0;
 }

 public void addItem(MenuItem item) {
     if (itemCount < items.length) {
         items[itemCount++] = item; // Add item and increment count
     } else {
         System.out.println("Order is full, cannot add more items.");
     }
 }

 public void displayOrder() {
     System.out.println("Order for: " + customer.getName());
     for (int i = 0; i < itemCount; i++) {
         System.out.println(items[i]);
     }
 }

 public double calculateTotal() {
     double total = 0;
     for (int i = 0; i < itemCount; i++) {
         total += items[i].getPrice();
     }
     return total;
 }
}

//Abstract Payment class
abstract class Payment {
 public abstract boolean processPayment(double amount);
}

//CreditCardPayment class
class CreditCardPayment extends Payment {
 @Override
 public boolean processPayment(double amount) {
     // Simulate credit card payment processing
     System.out.println("Processing credit card payment of $" + amount);
     return true; // Assume payment is successful
 }
}

//WalletPayment class
class WalletPayment extends Payment {
 @Override
 public boolean processPayment(double amount) {
     // Simulate wallet payment processing
     System.out.println("Processing wallet payment of $" + amount);
     return true; // Assume payment is successful
 }
}

//ZomatoService class to manage operations
class ZomatoService {
 private Restaurant[] restaurants; // Array to hold restaurants
 private int restaurantCount; // Counter for the number of restaurants

 public ZomatoService() {
     this.restaurants = new Restaurant[10]; // Assuming a maximum of 10 restaurants
     this.restaurantCount = 0;
 }

 public void addRestaurant(Restaurant restaurant) {
     if (restaurantCount < restaurants.length) {
         restaurants[restaurantCount++] = restaurant; // Add restaurant and increment count
     } else {
         System.out.println("Cannot add more restaurants.");
     }
 }

 public void displayRestaurants() {
     System.out.println("Available Restaurants:");
     for (int i = 0; i < restaurantCount; i++) {
         System.out.println(restaurants[i].getName());
     }
 }

 public Restaurant findRestaurant(String name) {
     for (int i = 0; i < restaurantCount; i++) {
         if (restaurants[i].getName().equalsIgnoreCase(name)) {
             return restaurants[i]; // Return the found restaurant
         }
     }
     return null; // Return null if not found
 }
}

//Main class to run the application
public class ZomatoApp {
 public static void main(String[] args) {
     ZomatoService zomatoService = new ZomatoService();

     // Adding restaurants
     Restaurant restaurant1 = new Restaurant("Pizza Place");
     restaurant1.addMenuItem(new MenuItem("Margherita Pizza", 8.99, "Pizza"));
     restaurant1.addMenuItem(new MenuItem("Pepperoni Pizza", 9.99, "Pizza"));
     zomatoService.addRestaurant(restaurant1);

     Restaurant restaurant2 = new Restaurant("Burger Point");
     restaurant2.addMenuItem(new MenuItem("Cheeseburger", 5.99, "Burger"));
     restaurant2.addMenuItem(new MenuItem("Veggie Burger", 4.99, "Burger"));
     zomatoService.addRestaurant(restaurant2);

     // Adding Indian restaurants
     Restaurant restaurant3 = new Restaurant("Tandoori Nights");
     restaurant3.addMenuItem(new MenuItem("Butter Chicken", 12.99, "Indian"));
     restaurant3.addMenuItem(new MenuItem("Paneer Tikka", 10.99, "Indian"));
     zomatoService.addRestaurant(restaurant3);

     Restaurant restaurant4 = new Restaurant("Curry House");
     restaurant4.addMenuItem(new MenuItem("Biryani", 11.99, "Indian"));
     restaurant4.addMenuItem(new MenuItem("Dal Makhani", 9.99, "Indian"));
     zomatoService.addRestaurant(restaurant4);

     Restaurant restaurant5 = new Restaurant("Spice Route");
     restaurant5.addMenuItem(new MenuItem("Samosa", 3.99, "Indian"));
     restaurant5.addMenuItem(new MenuItem("Chole Bhature", 8.99, "Indian"));
     zomatoService.addRestaurant(restaurant5);

     Restaurant restaurant6 = new Restaurant("Masala Kitchen");
     restaurant6.addMenuItem(new MenuItem("Palak Paneer", 10.99, "Indian"));
     restaurant6.addMenuItem(new MenuItem("Aloo Gobi", 7.99, "Indian"));
     zomatoService.addRestaurant(restaurant6);

     Restaurant restaurant7 = new Restaurant("Biryani Palace");
     restaurant7.addMenuItem(new MenuItem("Hyderabadi Biryani", 13.99, "Indian"));
     restaurant7.addMenuItem(new MenuItem("Kebab Platter", 14.99, "Indian"));
     zomatoService.addRestaurant(restaurant7);

     // Creating customers
     Customer[] customers = {
         new Customer("Kavya Arora", "Kavya12345@gmail.com"),
         new Customer("Rahul Sharma", "Rahul67890@gmail.com"),
         new Customer("Anjali Mehta", "Anjali11223@gmail.com"),
         new Customer("Vikram Singh", "Vikram44556@gmail.com"),
         new Customer("Priya Gupta", "Priya78901@gmail.com")
     };

     for (Customer customer : customers) {
         customer.displayInfo();
     }

     // Displaying restaurants
     zomatoService.displayRestaurants();

     // Simulating an order
     Scanner scanner = new Scanner(System.in);
     try {
         System.out.print("Enter the restaurant name to order from: ");
         String restaurantName = scanner.nextLine();
         Restaurant selectedRestaurant = zomatoService.findRestaurant(restaurantName);

         if (selectedRestaurant != null) {
             selectedRestaurant.displayMenu();
             Order order = new Order(customers[0]); // Using the first customer for simplicity
             String choice;
             do {
                 System.out.print("Enter the menu item name to add to your order (or 'done' to finish): ");
                 choice = scanner.nextLine();
                 MenuItem item = null;
                 for (int i = 0; i < selectedRestaurant.getMenu().length; i++) {
                     if (selectedRestaurant.getMenu()[i] != null && selectedRestaurant.getMenu()[i]
                    		 .getName().equalsIgnoreCase(choice)) 
                     {
                         item = selectedRestaurant.getMenu()[i];
                         break;
                     }
                 }
                 if (item != null) {
                     order.addItem(item);
                     System.out.println(item.getName() + " added to your order.");
                 } else if (!choice.equalsIgnoreCase("done")) {
                     System.out.println("Item not found in the menu.");
                 }
             } while (!choice.equalsIgnoreCase("done"));

             // Displaying the order
             order.displayOrder();
             double totalAmount = order.calculateTotal();
             System.out.println("Total Amount: $" + totalAmount);

             // Payment section
             System.out.print("Choose payment method (1 for Credit Card, 2 for Wallet): ");
             int paymentChoice = scanner.nextInt();
             Payment paymentMethod = (paymentChoice == 1) ? new CreditCardPayment() : new WalletPayment();

             System.out.print("Enter payment amount: $");
             double paymentAmount = scanner.nextDouble();
             if (paymentMethod.processPayment(totalAmount)) {
                 System.out.println("Your food will be delivered shortly.");
                 System.out.println("Food delivered successfully!");
             }
         } else {
             System.out.println("Restaurant not found.");
         }
     } catch (Exception e) {
         System.out.println("An error occurred: " + e.getMessage());
     } finally {
         scanner.close();
     }
 }
}