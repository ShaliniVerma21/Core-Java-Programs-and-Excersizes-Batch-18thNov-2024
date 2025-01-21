package Day24;
// 7. HashSet Example: Unique Usernames
import java.util.HashSet;
import java.util.Iterator;

public class demo15 {
    public static void main(String[] args) {
        // Create a HashSet to store unique usernames
        HashSet<String> usernames = new HashSet<>();
        
        // Add usernames (real-world related)
        usernames.add("john_doe");
        usernames.add("jane_smith");
        usernames.add("alice_jones");
        usernames.add("bob_brown");
        usernames.add("charlie_black");
        
        // Attempt to add a duplicate username
        usernames.add("john_doe"); // Duplicate, will not be added
        
        // Display unique usernames
        System.out.println("Unique Usernames: " + usernames);
        
        // Check if a specific username exists
        if (usernames.contains("alice_jones")) {
            System.out.println("The username 'alice_jones' exists in the set.");
        } else {
            System.out.println("The username 'alice_jones' does not exist in the set.");
        }
        
        // Get the size of the HashSet
        System.out.println("Number of unique usernames: " + usernames.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String username : usernames) {
            System.out.println(username);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = usernames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the HashSet
        usernames.clear();
        System.out.println("User names after clearing: " + usernames);
    }
}