package Assignement_3;
//Gym Membership Management 🏋️: Membership records, renewal, and session scheduling.

//Abstract class representing a Gym Member
abstract class GymMember {
 protected String name;
 protected int age;
 protected String membershipType;
 protected int membershipDuration; // in months

 // Constructor
 public GymMember(String name, int age, String membershipType, int membershipDuration) {
     this.name = name;
     this.age = age;
     this.membershipType = membershipType;
     this.membershipDuration = membershipDuration;
 }

 // Abstract method to display member details
 public abstract void displayDetails();

 // Method to renew membership
 public void renewMembership(int additionalMonths) {
     membershipDuration += additionalMonths;
     System.out.println(name + "'s membership renewed for " + additionalMonths + " months.");
 }
}

//Concrete class representing a Regular Member
class RegularMember extends GymMember {
 private static final double FEE = 50.0; // Monthly fee for regular members

 // Constructor
 public RegularMember(String name, int age, int membershipDuration) {
     super(name, age, "Regular", membershipDuration);
 }

 // Method to display member details
 @Override
 public void displayDetails() {
     System.out.println("Member Type: " + membershipType);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Membership Duration: " + membershipDuration + " months");
     System.out.println("Total Fee: $" + (membershipDuration * FEE));
 }
}

//Concrete class representing a Premium Member
class PremiumMember extends GymMember {
 private static final double FEE = 100.0; // Monthly fee for premium members

 // Constructor
 public PremiumMember(String name, int age, int membershipDuration) {
     super(name, age, "Premium", membershipDuration);
 }

 // Method to display member details
 @Override
 public void displayDetails() {
     System.out.println("Member Type: " + membershipType);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Membership Duration: " + membershipDuration + " months");
     System.out.println("Total Fee: $" + (membershipDuration * FEE));
 }
}

//Interface representing a Session Scheduler
interface SessionScheduler {
 void scheduleSession(String date, String time);
}

//Class implementing the Session Scheduler interface
class Session implements SessionScheduler {
 private String memberName;
 private String sessionDate;
 private String sessionTime;

 // Constructor
 public Session(String memberName) {
     this.memberName = memberName;
 }

 // Method to schedule a session
 @Override
 public void scheduleSession(String date, String time) {
     this.sessionDate = date;
     this.sessionTime = time;
     System.out.println("Session scheduled for " + memberName + " on " + sessionDate + " at " + sessionTime);
 }
}

//Main class to manage gym membership
public class demo8 {
 public static void main(String[] args) {
     // Create members
     RegularMember regularMember = new RegularMember("Alice", 25, 6);
     PremiumMember premiumMember = new PremiumMember("Bob", 30, 12);

     // Display member details
     regularMember.displayDetails();
     premiumMember.displayDetails();

     // Renew membership
     regularMember.renewMembership(3);
     premiumMember.renewMembership(6);

     // Schedule sessions
     Session session1 = new Session(regularMember.name);
     session1.scheduleSession("2023-10-15", "10:00 AM");

     Session session2 = new Session(premiumMember.name);
     session2.scheduleSession("2023-10-16", "11:00 AM");
 }
}