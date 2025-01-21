package Day24;
// 10. HashMap Example: Storing User Information
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class demo18 {
    public static void main(String[] args) {
        // Create a HashMap to store user ID and names
        HashMap<Integer, String> userMap = new HashMap<>();
        
        // Add user information (real-world related)
        userMap.put(1, "Alice");
        userMap.put(2, "Bob");
        userMap.put(3, "Charlie");
        userMap.put(4, "Diana");
        userMap.put(5, "Ethan");
        
        // Attempt to add a duplicate user ID
        userMap.put(1, "Alice Cooper"); // This will update the name for ID 1
        
        // Retrieve user by ID
        System.out.println("User  with ID 1: " + userMap.get(1));
        
        // Check if a specific user ID exists
        if (userMap.containsKey(3)) {
            System.out.println("User  with ID 3 exists: " + userMap.get(3));
        } else {
            System.out.println("User  with ID 3 does not exist.");
        }
        
        // Get the size of the HashMap
        System.out.println("Number of users: " + userMap.size());
        
        // Iterate using a for-each loop over the entry set
        System.out.println("Iterating using enhanced for loop:");
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        // Iterate using an Iterator over the entry set
        System.out.println("Iterating using Iterator:");
        Iterator<Map.Entry<Integer, String>> iterator = userMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        
        // Clear the HashMap
        userMap.clear();
        System.out.println("User  map after clearing: " + userMap);
    }
}