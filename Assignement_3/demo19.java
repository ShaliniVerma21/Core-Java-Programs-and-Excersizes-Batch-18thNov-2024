package Assignement_3;
//Chatbot System 💬: Automate customer queries.

//Abstract class representing a Chatbot
abstract class Chatbot {
 protected String name;

 // Constructor
 public Chatbot(String name) {
     this.name = name;
 }

 // Abstract method to respond to queries
 public abstract String respondToQuery(String query);

 // Method to display chatbot information
 public void displayInfo() {
     System.out.println("Chatbot Name: " + name);
 }

 // Getter for name
 public String getName() {
     return name;
 }
}

//Concrete class representing a Customer Support Chatbot
class CustomerSupportChatbot extends Chatbot {
 private static final String TYPE = "Customer Support";

 // Constructor
 public CustomerSupportChatbot(String name) {
     super(name);
 }

 // Method to respond to queries
 @Override
 public String respondToQuery(String query) {
     if (query.toLowerCase().contains("order")) {
         return "I can help you with your order. Please provide your order ID.";
     } else if (query.toLowerCase().contains("refund")) {
         return "To process a refund, please provide your order ID and reason for the refund.";
     } else {
         return "I'm sorry, I cannot assist with that query.";
     }
 }

 // Method to display chatbot information
 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Chatbot Type: " + TYPE);
 }
}

//Concrete class representing a FAQ Chatbot
class FAQChatbot extends Chatbot {
 private static final String TYPE = "FAQ";

 // Constructor
 public FAQChatbot(String name) {
     super(name);
 }

 // Method to respond to queries
 @Override
 public String respondToQuery(String query) {
     if (query.toLowerCase().contains("hours")) {
         return "Our business hours are 9 AM to 5 PM, Monday to Friday.";
     } else if (query.toLowerCase().contains("location")) {
         return "We are located at 123 Main St, Anytown, USA.";
     } else {
         return "I'm sorry, I cannot assist with that query.";
     }
 }

 // Method to display chatbot information
 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Chatbot Type: " + TYPE);
 }
}

//Class representing the Chatbot System
class ChatbotSystem {
 private Chatbot[] chatbots;
 private int chatbotCount;

 // Constructor
 public ChatbotSystem(int capacity) {
     chatbots = new Chatbot[capacity];
     chatbotCount = 0;
 }

 // Method to add a chatbot
 public void addChatbot(Chatbot chatbot) {
     if (chatbotCount < chatbots.length) {
         chatbots[chatbotCount] = chatbot;
         chatbotCount++;
         System.out.println("Chatbot added: " + chatbot.getName());
     } else {
         System.out.println("Chatbot system is full. Cannot add more chatbots.");
     }
 }

 // Method to display all chatbots
 public void displayAllChatbots() {
     System.out.println("Chatbot System:");
     for (int i = 0; i < chatbotCount; i++) {
         chatbots[i].displayInfo();
         System.out.println();
     }
 }

 // Method to handle a query
 public void handleQuery(String query) {
     boolean handled = false;
     for (int i = 0; i < chatbotCount; i++) {
         String response = chatbots[i].respondToQuery(query);
         if (!response.equals("I'm sorry, I cannot assist with that query.")) {
             System.out.println("Response from " + chatbots[i].getName() + ": " + response);
             handled = true;
             break; // Stop after the first valid response
         }
     }
     if (!handled) {
         System.out.println("No chatbot could assist with your query.");
     }
 }
}

//Main class to manage the Chatbot System
public class demo19 {
 public static void main(String[] args) {
     // Create a Chatbot System with a capacity of 5 chatbots
     ChatbotSystem chatbotSystem = new ChatbotSystem(5);

     // Create chatbots
     Chatbot supportChatbot = new CustomerSupportChatbot("SupportBot");
     Chatbot faqChatbot = new FAQChatbot("FAQBot");

     // Add chatbots to the system
     chatbotSystem.addChatbot(supportChatbot);
     chatbotSystem.addChatbot(faqChatbot);

     // Display all chatbots
     chatbotSystem.displayAllChatbots();

     // Handle some queries
     System.out.println("Handling queries:");
     chatbotSystem.handleQuery("What are your business hours?");
     chatbotSystem.handleQuery("I need help with my order.");
     chatbotSystem.handleQuery("Can you tell me about your location?");
     chatbotSystem.handleQuery("What is your return policy?");
 }
}