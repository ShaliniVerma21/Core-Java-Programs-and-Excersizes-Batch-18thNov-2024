package Day22;
//ShutdownHook

public class demo19 {
    public static void main(String[] args) {
        // Registering a shutdown hook
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // This code will be executed when the JVM is shutting down
            System.out.println("Shutdown hook is running. Cleaning up resources...");
            // Simulate cleanup work
            try {
                Thread.sleep(2000); // Simulate time taken to clean up
            } catch (InterruptedException e) {
                System.out.println("Shutdown hook interrupted.");
            }
            System.out.println("Cleanup completed.");
        }));

        // Simulating main application work
        System.out.println("Main application is running. Press Ctrl+C to exit.");
        try {
            // Keep the main thread alive for a while
            Thread.sleep(10000); // Simulate some work for 10 seconds
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Indicate that the main application is finishing
        System.out.println("Main application is finishing.");
    }
}