package Day22;
// Data Processing Pipeline

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Class representing a data item
class DataItem {
    private final int id; // Unique identifier for the data item

    public DataItem(int id) {
        this.id = id; // Initialize data item ID
    }

    public int getId() {
        return id; // Getter for data item ID
    }
}

// Class representing a Producer1 that generates data items
class Producer1 implements Runnable {
    private final LinkedBlockingQueue<DataItem> queue; // Queue to hold data items
    private final int itemCount; // Number of items to produce

    public Producer1(LinkedBlockingQueue<DataItem> queue, int itemCount) {
        this.queue = queue; // Initialize the queue
        this.itemCount = itemCount; // Initialize item count
    }

    @Override
    public void run() {
        for (int i = 1; i <= itemCount; i++) {
            try {
                DataItem item = new DataItem(i); // Create a new data item
                queue.put(item); // Add the item to the queue
                System.out.println("Produced: " + item.getId());
                Thread.sleep(500); // Simulate time taken to produce an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        }
    }
}

// Class representing a Consumer1 that processes data items
class Consumer1 implements Runnable {
    private final LinkedBlockingQueue<DataItem> queue; // Queue to hold data items

    public Consumer1(LinkedBlockingQueue<DataItem> queue) {
        this.queue = queue; // Initialize the queue
    }

    @Override
    public void run() {
        while (true) {
            try {
                DataItem item = queue.take(); // Take an item from the queue
                System.out.println("Consumed: " + item.getId());
                Thread.sleep(1000); // Simulate time taken to process an item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
                break; // Exit loop if interrupted
            }
        }
    }
}

// Main class to execute the Data Processing Pipeline
public class demo27 {
    public static void main(String[] args) {
        LinkedBlockingQueue<DataItem> queue = new LinkedBlockingQueue<>(); // Create a blocking queue

        // Create a thread pool for Producer1s and Consumer1s
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create and start Producer1 thread
        Producer1 Producer1 = new Producer1(queue, 10); // Produce 10 items
        executor.submit(Producer1);

        // Create and start Consumer1 threads
        for (int i = 1; i <= 2; i++) {
            Consumer1 Consumer1 = new Consumer1(queue);
            executor.submit(Consumer1);
        }

        // Shutdown the executor service after a delay
        executor.shutdown();
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Force shutdown if not terminated
            }
        } catch (InterruptedException e) {
            executor.shutdownNow(); // Force shutdown on interruption
        }

        System.out.println("Data Processing Pipeline has completed.");
    }
}