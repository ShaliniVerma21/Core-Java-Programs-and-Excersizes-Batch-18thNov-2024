package Day22;
//Chat Application(Whatsapp)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// Class representing a message
class Message {
    private final String sender; // Sender of the message
    private final String content; // Content of the message

    public Message(String sender, String content) {
        this.sender = sender; // Initialize sender
        this.content = content; // Initialize content
    }

    public String getSender() {
        return sender; // Getter for sender
    }

    public String getContent() {
        return content; // Getter for content
    }
}

// Class representing a chat room
class ChatRoom {
    private final Queue<Message> messages = new LinkedList<>(); // Queue to hold messages

    // Synchronized method to send a message
    public synchronized void sendMessage(Message message) {
        messages.add(message); // Add message to the queue
        notify(); // Notify waiting threads that a new message has arrived
    }

    // Synchronized method to receive a message
    public synchronized Message receiveMessage() throws InterruptedException {
        while (messages.isEmpty()) {
            wait(); // Wait until a message is available
        }
        return messages.poll(); // Retrieve and remove the message from the queue
    }
}

// Class representing a User1 in the chat application
class User1 implements Runnable {
    private final String name; // User1's name
    private final ChatRoom chatRoom; // Chat room to communicate in

    public User1(String name, ChatRoom chatRoom) {
        this.name = name; // Initialize User1's name
        this.chatRoom = chatRoom; // Initialize chat room
    }

    @Override
    public void run() {
        // Thread for sending messages
        Thread senderThread = new Thread(() -> {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                String content = scanner.nextLine(); // Read User1 input
                Message message = new Message(name, content); // Create a new message
                chatRoom.sendMessage(message); // Send the message to the chat room
            }
        });

        // Thread for receiving messages
        Thread receiverThread = new Thread(() -> {
            while (true) {
                try {
                    Message message = chatRoom.receiveMessage(); // Receive a message
                    System.out.println(message.getSender() + ": " + message.getContent()); // Display the message
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                }
            }
        });

        // Start both threads
        senderThread.start();
        receiverThread.start();
    }
}

// Main class to execute the chat application
public class demo28 {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom(); // Create a chat room

        // Create and start User1 threads
        User1 User11 = new User1("User1 1", chatRoom);
        User1 User12 = new User1("User1 2", chatRoom);
        new Thread(User11).start();
        new Thread(User12).start();
    }
}