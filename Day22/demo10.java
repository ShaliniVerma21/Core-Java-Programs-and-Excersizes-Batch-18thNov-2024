package Day22;

// Restaurant Simulation
public class demo10 {
    // Main class to simulate a restaurant using multithreading

    // Inner class to represent a table in the restaurant
    class Table {
        // Unique identifier for each table
        private int tableNumber;

        // Constructor to initialize the table number
        public Table(int tableNumber) {
            this.tableNumber = tableNumber;
        }

        // Method to get the table number
        public int getTableNumber() {
            return tableNumber;
        }
    }

    // Inner class to represent a waiter in the restaurant
    class Waiter implements Runnable {
        // Table assigned to the waiter
        private Table table;
        // Name of the waiter
        private String name;

        // Constructor to initialize the table and name
        public Waiter(Table table, String name) {
            this.table = table;
            this.name = name;
        }

        // Method to simulate the waiter taking an order
        @Override
        public void run() {
            // Print a message indicating the waiter is taking an order
            System.out.println(name + " is taking order from table " + table.getTableNumber());

            try {
                // Simulate the time it takes to take an order
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // If the thread is interrupted, interrupt the current thread
                Thread.currentThread().interrupt();
            }

            // Print a message indicating the waiter has taken an order
            System.out.println(name + " has taken order from table " + table.getTableNumber());
        }
    }

    // Main method to simulate the restaurant
    public static void main(String[] args) {
        // Create an instance of the demo10 class
        demo10 restaurant = new demo10();

        // Create tables
        Table table1 = restaurant.new Table(1);
        Table table2 = restaurant.new Table(2);
        Table table3 = restaurant.new Table(3);

        // Create waiters
        Waiter waiter1 = restaurant.new Waiter(table1, "Waiter 1");
        Waiter waiter2 = restaurant.new Waiter(table2, "Waiter 2");
        Waiter waiter3 = restaurant.new Waiter(table3, "Waiter 3");

        // Create threads for each waiter
        Thread thread1 = new Thread(waiter1);
        Thread thread2 = new Thread(waiter2);
        Thread thread3 = new Thread(waiter3);

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}