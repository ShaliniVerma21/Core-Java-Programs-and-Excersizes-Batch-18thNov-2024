package Day24;
// 15. HashSet Example: Filtering Duplicate Emails
import java.util.HashSet;
import java.util.Iterator;

public class demo22 {
    public static void main(String[] args) {
        // Create a HashSet to store unique email addresses
        HashSet<String> emailSet = new HashSet<>();
        
        // Simulate adding email addresses (real-world related)
        emailSet.add("alice@example.com");
        emailSet.add("bob@example.com");
        emailSet.add("charlie@example.com");
        emailSet.add("diana@example.com");
        emailSet.add("ethan@example.com");
        emailSet.add("fiona@example.com");
        emailSet.add("george@example.com");
        emailSet.add("hannah@example.com");
        emailSet.add("ian@example.com");
        emailSet.add("jack@example.com");
        
        // Attempt to add duplicate email addresses
        emailSet.add("alice@example.com"); // Duplicate, will not be added
        emailSet.add("bob@example.com"); // Duplicate, will not be added
        
        // Display unique email addresses
        System.out.println("Unique Emails: " + emailSet);
        
        // Conditional logic to simulate user actions
        String action = "check"; // Simulate user action (can be "add", "check", "clear")
        String emailToCheck = "charlie@example.com"; // Email to check
        
        if (action.equals("add")) {
            String newEmail = "newuser@example.com";
            if (emailSet.add(newEmail)) {
                System.out.println("Added new email: " + newEmail);
            } else {
                System.out.println("Email already exists: " + newEmail);
            }
        } else if (action.equals("check")) {
            if (emailSet.contains(emailToCheck)) {
                System.out.println("The email '" + emailToCheck + "' exists in the set.");
            } else {
                System.out.println("The email '" + emailToCheck + "' does not exist in the set.");
            }
        } else if (action.equals("clear")) {
            emailSet.clear();
            System.out.println("Email set has been cleared.");
        } else {
            System.out.println("No valid action specified.");
        }
        
        // Get the size of the HashSet
        System.out.println("Number of unique emails: " + emailSet.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String email : emailSet) {
            System.out.println(email);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = emailSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the HashSet
        emailSet.clear();
        System.out.println("Email set after clearing: " + emailSet);
    }
}