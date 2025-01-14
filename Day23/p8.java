package Day23;
/*
 19. Non-static Inner Class: E-commerce System
Problem: Create an e-commerce system where a ShoppingCart1 class contains an inner class Item to manage items in the cart. 
 */
import java.util.ArrayList;
import java.util.List;

class ShoppingCart1 {
    private List<Item> items = new ArrayList<>();

    class Item {
        private String name;
        private double price;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        double getPrice() {
            return price;
        }

        void display() {
            System.out.println("Item: " + name + ", Price: $" + price);
        }
    }

    void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    void displayCart() {
        System.out.println("Shopping Cart:");
        for (Item item : items) {
            item.display();
        }
        System.out.println("Total: $" + calculateTotal());
    }

    private double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

public class p8{
    public static void main(String[] args) {
        ShoppingCart1 cart = new ShoppingCart1();
        cart.addItem("Laptop", 999.99);
        cart.addItem("Mouse", 25.50);
        cart.displayCart();
    }
}