package Day22;
//Web Server Request Handling

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Class representing a web request
class WebRequest {
    private final String requestId; // Unique identifier for the request

    public WebRequest(String requestId) {
        this.requestId = requestId; // Initialize request ID
    }

    public String getRequestId() {
        return requestId; // Getter for request ID
    }
}

// Class representing a request handler
class RequestHandler implements Runnable {
    private final WebRequest request; // Web request to handle

    public RequestHandler(WebRequest request) {
        this.request = request; // Initialize web request
    }

    @Override
    public void run() {
        // Simulate processing the web request
        System.out.println("Processing request: " + request.getRequestId());
        try {
            // Simulate time taken to process the request
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        System.out.println("Completed request: " + request.getRequestId());
    }
}

// Main class to execute the web server
public class demo29 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // Thread pool for handling requests

        // Simulate incoming web requests
        for (int i = 1; i <= 10; i++) {
            WebRequest request = new WebRequest("Request " + i); // Create a new web request
            RequestHandler handler = new RequestHandler(request); // Create a request handler
            executor.submit(handler); // Submit the handler to the executor
        }

        // Shutdown the executor service
        executor.shutdown();
        try {
            if (!executor.awaitTermination(30, TimeUnit.SECONDS)) {
                executor.shutdownNow(); // Force shutdown if not terminated
            }
        } catch (InterruptedException e) {
            executor.shutdownNow(); // Force shutdown on interruption
        }

        System.out.println("Web Server has completed processing all requests.");
    }
}