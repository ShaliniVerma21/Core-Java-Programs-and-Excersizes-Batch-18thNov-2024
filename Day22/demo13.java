package Day22;

// Chat Application
public class demo13 {
    // Main class to demonstrate chat application using multithreading

    // Inner class to represent a message
    class Message {
        // Text of the message
        private String text;

        // Constructor to initialize the message text
        public Message(String text) {
            this.text = text;
        }

        // Method to get the message text
        public String getText() {
            return text;
        }
    }

    // Inner class to represent a conversation
    class Conversation implements Runnable {
        // Message being processed in the conversation
        private Message message;

        // Constructor to initialize the conversation with a message
        public Conversation(Message message) {
            this.message = message;
        }

        // Method to process the message in the conversation
        @Override
        public void run() {
            // Print a message indicating the message is received
            System.out.println("Received message: " + message.getText());

            try {
                // Simulate processing time for the message
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // If the thread is interrupted, interrupt the current thread
                Thread.currentThread().interrupt();
            }

            // Print a message indicating the message is processed
            System.out.println("Message processed: " + message.getText());
        }
    }

    // Main method to demonstrate the chat application
    public static void main(String[] args) {
        // Create instances of the demo13 class
        demo13 chatApp = new demo13();

        // Create messages for the conversation
        Message message1 = chatApp.new Message("Hello");
        Message message2 = chatApp.new Message("Hi");

        // Create conversations for the messages
        Conversation conversation1 = chatApp.new Conversation(message1);
        Conversation conversation2 = chatApp.new Conversation(message2);

        // Create threads for the conversations
        Thread thread1 = new Thread(conversation1);
        Thread thread2 = new Thread(conversation2);

        // Start the threads to process the conversations
        thread1.start();
        thread2.start();
    }
}