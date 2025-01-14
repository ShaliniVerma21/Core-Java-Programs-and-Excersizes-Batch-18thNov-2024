package Day23;
/*
 14. Local Inner Class: Shopping Cart
Problem: Create a ShoppingCart class that uses a local inner class to calculate the total price of items. 
 */
class ShoppingCart {
    void calculateTotal(double[] prices) {
        class TotalCalculator {
            double total() {
                double sum = 0;
                for (double price : prices) {
                    sum += price;
                }
                return sum;
            }
        }
        TotalCalculator calculator = new TotalCalculator();
        System.out.println("Total Price: " + calculator.total()); // Output: Total Price: <total price>
    }
}

public class p3{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.calculateTotal(new double[]{10.99, 5.49, 3.99});
    }
}