package Day22;
// Thread Scheduler

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Task1 class that implements Runnable interface
class Task1 implements Runnable {
    private final String Task1Name; // Name of the Task1

    // Constructor to initialize the Task1 name
    public Task1(String Task1Name) {
        this.Task1Name = Task1Name;
    }

    // The run method that contains the code to be executed by the thread
    @Override
    public void run() {
        System.out.println("Starting Task1: " + Task1Name);
        try {
            // Simulate some work with sleep (2 seconds)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Task1 interrupted: " + Task1Name);
        }
        System.out.println("Completed Task1: " + Task1Name);
    }
}

// Main class to demonstrate thread scheduling
public class demo14 {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads (3 in this case)
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Submit multiple Task1s to the executor
        for (int i = 1; i <= 10; i++) {
            Task1 Task1 = new Task1("Task1 " + i); // Create a new Task1
            executorService.submit(Task1); // Submit the Task1 for execution
        }

        // Shutdown the executor service
        executorService.shutdown(); // No new Task1s will be accepted
        System.out.println("All Tasks submitted.");
        
        // Wait for all Task1s to complete (optional)
        try {
            // Wait until all Task1s are finished
            if (!executorService.awaitTermination(60, java.util.concurrent.TimeUnit.SECONDS)) {
                executorService.shutdownNow(); // Force shutdown if Task1s are not finished
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow(); // Force shutdown on interruption
        }

        System.out.println("All Tasks completed.");
    }
}