package Day24;
// 3. Vector Example: Thread-Safe List of Users
/*
 -- vectors
 
1. Dynamic Array: Automatically resizes to accommodate new elements.

2. Synchronized: 
Thread-safe; multiple threads can access it without data inconsistency.

3. Resizable: 
Grows in size when capacity is exceeded (default capacity is 10, typically 
doubles).

4. Index-Based Access: 
Elements can be accessed using zero-based indices.

5. Allows Duplicates: 
Can contain multiple occurrences of the same element.

6. Null Elements: 
Supports the inclusion of null values.
 */

import java.util.Vector;
import java.util.Iterator;

public class demo11 {
    public static void main(String[] args) {
        // Create a Vector to store user names
        Vector<String> users = new Vector<>();
        
        // Add users to the list
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        users.add("David");
        users.add("Eve");
        users.add("Frank");
        
        // Display the user list
        System.out.println("User  List: " + users);
        
        // Remove a user
        users.remove("Bob");
        System.out.println("Updated User List: " + users);
        
        // Check if a user exists
        if (users.contains("Charlie")) {
            System.out.println("Charlie is in the user list.");
        } else {
            System.out.println("Charlie is not in the user list.");
        }
        
        // Get the size of the Vector
        System.out.println("Number of users: " + users.size());
        
        // Iterate using a for loop
        System.out.println("Iterating using for loop:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
        
        // Iterate using an enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        for (String user : users) {
            System.out.println(user);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = users.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Iterate using ListIterator (for demonstration)
        System.out.println("Iterating using ListIterator:");
        java.util.ListIterator<String> listIterator = users.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        
        // Clear the Vector
        users.clear();
        System.out.println("User  List after clearing: " + users);
    }
}