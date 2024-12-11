package Assignement_3;
//Subscription-Based Streaming Platform 🎥: Manage user subscriptions and streaming.

//Abstract class representing a Subscription
abstract class Subscription {
 protected String userName;
 protected String subscriptionType; // e.g., Basic, Premium
 protected double monthlyFee;

 // Constructor
 public Subscription(String userName, String subscriptionType, double monthlyFee) {
     this.userName = userName;
     this.subscriptionType = subscriptionType;
     this.monthlyFee = monthlyFee;
 }

 // Abstract method to display subscription details
 public abstract void displaySubscriptionDetails();

 // Method to calculate total fee for a given number of months
 public double calculateTotalFee(int months) {
     return months * monthlyFee;
 }
}

//Concrete class representing a Basic Subscription
class BasicSubscription extends Subscription {
 private static final double BASIC_FEE = 9.99; // Monthly fee for Basic subscription

 // Constructor
 public BasicSubscription(String userName) {
     super(userName, "Basic", BASIC_FEE);
 }

 // Method to display subscription details
 @Override
 public void displaySubscriptionDetails() {
     System.out.println(":User  " + userName);
     System.out.println("Subscription Type: " + subscriptionType);
     System.out.println("Monthly Fee: $" + monthlyFee);
 }
}

//Concrete class representing a Premium Subscription
class PremiumSubscription extends Subscription {
 private static final double PREMIUM_FEE = 14.99; // Monthly fee for Premium subscription

 // Constructor
 public PremiumSubscription(String userName) {
     super(userName, "Premium", PREMIUM_FEE);
 }

 // Method to display subscription details
 @Override
 public void displaySubscriptionDetails() {
     System.out.println(":User  " + userName);
     System.out.println("Subscription Type: " + subscriptionType);
     System.out.println("Monthly Fee: $" + monthlyFee);
 }
}

//Class representing the Streaming Platform
class StreamingPlatform {
 private Subscription[] subscriptions;
 private int subscriptionCount;

 // Constructor
 public StreamingPlatform(int capacity) {
     subscriptions = new Subscription[capacity];
     subscriptionCount = 0;
 }

 // Method to add a subscription
 public void addSubscription(Subscription subscription) {
     if (subscriptionCount < subscriptions.length) {
         subscriptions[subscriptionCount] = subscription;
         subscriptionCount++;
         System.out.println("Subscription added for: " + subscription.userName);
     } else {
         System.out.println("Streaming Platform is full. Cannot add more subscriptions.");
     }
 }

 // Method to display all subscriptions
 public void displayAllSubscriptions() {
     System.out.println("Subscription List:");
     for (int i = 0; i < subscriptionCount; i++) {
         subscriptions[i].displaySubscriptionDetails();
         System.out.println();
     }
 }

 // Method to calculate total fees for all subscriptions for a given number of months
 public double calculateTotalFees(int months) {
     double total = 0;
     for (int i = 0; i < subscriptionCount; i++) {
         total += subscriptions[i].calculateTotalFee(months);
     }
     return total;
 }
}

//Main class to manage the Subscription-Based Streaming Platform
public class demo35 {
 public static void main(String[] args) {
     // Create a Streaming Platform with a capacity of 5 subscriptions
     StreamingPlatform streamingPlatform = new StreamingPlatform(5);

     // Create subscriptions
     Subscription user1 = new BasicSubscription("Alice");
     Subscription user2 = new PremiumSubscription("Bob");
     Subscription user3 = new BasicSubscription("Charlie");
     Subscription user4 = new PremiumSubscription("Diana");

     // Add subscriptions to the Streaming Platform
     streamingPlatform.addSubscription(user1);
     streamingPlatform.addSubscription(user2);
     streamingPlatform.addSubscription(user3);
     streamingPlatform.addSubscription(user4);

     // Display all subscriptions
     streamingPlatform.displayAllSubscriptions();

     // Calculate total fees for 3 months
     int months = 3;
     double totalFees = streamingPlatform.calculateTotalFees(months);
     System.out.println("Total fees for " + months + " months: $" + totalFees);
 }
}