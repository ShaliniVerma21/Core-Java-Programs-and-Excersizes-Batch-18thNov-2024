package Day24;
// 17. TreeSet Example: Storing Unique Product Prices
import java.util.TreeSet;
import java.util.Iterator;

public class demo24 {
    public static void main(String[] args) {
        // Create a TreeSet to store unique product prices
        TreeSet<Double> prices = new TreeSet<>();
        
        // Add product prices (real-world related)
        prices.add(19.99);
        prices.add(9.99);
        prices.add(29.99);
        prices.add(15.49);
        prices.add(5.99);
        prices.add(49.99);
        prices.add(19.99); // Duplicate, will not be added
        prices.add(39.99);
        prices.add(25.00);
        prices.add(99.99);
        
        // Display prices in sorted order
        System.out.println("Unique Product Prices: " + prices);
        
        // Conditional logic to simulate user actions
        String action = "check"; // Simulate user action (can be "add", "check", "clear")
        double priceToCheck = 15.49; // Price to check
        
        if (action.equals("add")) {
            double newPrice = 59.99;
            if (prices.add(newPrice)) {
                System.out.println("Added new price: " + newPrice);
            } else {
                System.out.println("Price already exists: " + newPrice);
            }
        } else if (action.equals("check")) {
            if (prices.contains(priceToCheck)) {
                System.out.println("The price '" + priceToCheck + "' exists in the set.");
            } else {
                System.out.println("The price '" + priceToCheck + "' does not exist in the set.");
            }
        } else if (action.equals("clear")) {
            prices.clear();
            System.out.println("Product prices have been cleared.");
        } else {
            System.out.println("No valid action specified.");
        }
        
        // Get the size of the TreeSet
        System.out.println("Number of unique prices: " + prices.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (Double price : prices) {
            System.out.println(price);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Double> iterator = prices.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the TreeSet
        prices.clear();
        System.out.println("Product prices after clearing: " + prices);
    }
}