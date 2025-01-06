package Day22;

// Web Server
public class demo12 {
    // Main class to demonstrate web server using multithreading

    // Inner class to represent a request
    class Request {
        // URL of the request
        private String url;

        // Constructor to initialize the request URL
        public Request(String url) {
            this.url = url;
        }

        // Method to get the request URL
        public String getUrl() {
            return url;
        }
    }

    // Inner class to represent a handler
    class Handler implements Runnable {
        // Request being handled
        private Request request;

        // Constructor to initialize the handler with a request
        public Handler(Request request) {
            this.request = request;
        }

        // Method to handle the request
        @Override
        public void run() {
            // Print a message indicating the request is being handled
            System.out.println("Handling request: " + request.getUrl());

            try {
                // Simulate handling time for the request
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // If the thread is interrupted, interrupt the current thread
                Thread.currentThread().interrupt();
            }

            // Print a message indicating the request is handled
            System.out.println("Request handled: " + request.getUrl());
        }
    }

    // Main method to demonstrate the web server
    public static void main(String[] args) {
        // Create instances of the demo12 class
        demo12 webServer = new demo12();

        // Create requests for the web server
        Request request1 = webServer.new Request("/home");
        Request request2 = webServer.new Request("/about");

        // Create handlers for the requests
        Handler handler1 = webServer.new Handler(request1);
        Handler handler2 = webServer.new Handler(request2);

        // Create threads for the handlers
        Thread thread1 = new Thread(handler1);
        Thread thread2 = new Thread(handler2);

        // Start the threads to handle the requests
        thread1.start();
        thread2.start();
    }
}