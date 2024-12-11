package Assignement_3;
//Online Voting System 🗳️: Secure voter registration and vote tracking.

//Abstract class representing a Voter
abstract class Voter {
 protected String name;
 protected int age;
 protected String voterId;

 // Constructor
 public Voter(String name, int age, String voterId) {
     this.name = name;
     this.age = age;
     this.voterId = voterId;
 }

 // Abstract method to display voter details
 public abstract void displayDetails();

 // Method to check if the voter is eligible
 public boolean isEligible() {
     return age >= 18;
 }
}

//Concrete class representing a Registered Voter
class RegisteredVoter extends Voter {
 private static int totalVotes = 0; // Static variable to track total votes

 // Constructor
 public RegisteredVoter(String name, int age, String voterId) {
     super(name, age, voterId);
 }

 // Method to display voter details
 @Override
 public void displayDetails() {
     System.out.println("Voter ID: " + voterId);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Eligible to vote: " + (isEligible() ? "Yes" : "No"));
 }

 // Method to cast a vote
 public void castVote() {
     if (isEligible()) {
         totalVotes++;
         System.out.println(name + " has cast a vote. Total votes: " + totalVotes);
     } else {
         System.out.println(name + " is not eligible to vote.");
     }
 }

 // Static method to get total votes
 public static int getTotalVotes() {
     return totalVotes;
 }
}

//Class representing the Online Voting System
class OnlineVoting {
 private RegisteredVoter[] voters;
 private int voterCount;

 // Constructor
 public OnlineVoting(int capacity) {
     voters = new RegisteredVoter[capacity];
     voterCount = 0;
 }

 // Method to register a voter
 public void registerVoter(String name, int age, String voterId) {
     if (voterCount < voters.length) {
         voters[voterCount] = new RegisteredVoter(name, age, voterId);
         System.out.println("Voter registered: " + name);
         voterCount++;
     } else {
         System.out.println("Registration failed: Voter list is full.");
     }
 }

 // Method to display all registered voters
 public void displayVoters() {
     System.out.println("Registered Voters:");
     for (int i = 0; i < voterCount; i++) {
         voters[i].displayDetails();
         System.out.println();
     }
 }
}

//Main class to manage the online voting system
public class demo7 {
 public static void main(String[] args) {
     // Create an instance of the online voting system with a capacity of 3 voters
     OnlineVoting votingSystem = new OnlineVoting(3);

     // Register voters
     votingSystem.registerVoter("Alice", 25, "V001");
     votingSystem.registerVoter("Bob", 17, "V002"); // Not eligible
     votingSystem.registerVoter("Charlie", 30, "V003");

     // Attempt to register one more voter (should fail)
     votingSystem.registerVoter("David", 22, "V004");

     // Display registered voters
     votingSystem.displayVoters();

     // Cast votes
     RegisteredVoter voter1 = new RegisteredVoter("Alice", 25, "V001");
     voter1.castVote();

     RegisteredVoter voter2 = new RegisteredVoter("Bob", 17, "V002");
     voter2.castVote(); // Not eligible

     RegisteredVoter voter3 = new RegisteredVoter("Charlie", 30, "V003");
     voter3.castVote();

     // Display total votes
     System.out.println("Total votes cast: " + RegisteredVoter.getTotalVotes());
 }
}