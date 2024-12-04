package Day10;
//Restaurant Management
class MenuItem {
    private String name;
    private double price;

    // Constructor
    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display menu item details
    public void displayMenuItem() {
        System.out.println("Dish: " + name + ", Price: " + price);
    }
}

// Example usage
public class Main8 {
    public static void main(String[] args) {
        MenuItem item = new MenuItem("Biryani", 250.0);
        item.displayMenuItem();
    }
}