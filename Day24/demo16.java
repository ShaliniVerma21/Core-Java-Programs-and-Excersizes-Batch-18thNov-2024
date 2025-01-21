package Day24;
// 8. LinkedHashSet Example: Maintaining Insertion Order
import java.util.LinkedHashSet;
import java.util.Iterator;

public class demo16 {
    public static void main(String[] args) {
        // Create a LinkedHashSet to maintain insertion order
        LinkedHashSet<String> orderedSet = new LinkedHashSet<>();
        
        // Add elements (real-world related)
        orderedSet.add("Laptop");
        orderedSet.add("Smartphone");
        orderedSet.add("Tablet");
        orderedSet.add("Smartwatch");
        orderedSet.add("Headphones");
        
        // Attempt to add a duplicate element
        orderedSet.add("Laptop"); // Duplicate, will not be added
        
        // Display elements in insertion order
        System.out.println("Ordered Set: " + orderedSet);
        
        // Check if a specific item exists
        if (orderedSet.contains("Tablet")) {
            System.out.println("The item 'Tablet' exists in the set.");
        } else {
            System.out.println("The item 'Tablet' does not exist in the set.");
        }
        
        // Get the size of the LinkedHashSet
        System.out.println("Number of items in the ordered set: " + orderedSet.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String item : orderedSet) {
            System.out.println(item);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = orderedSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the LinkedHashSet
        orderedSet.clear();
        System.out.println("Items after clearing: " + orderedSet);
    }
}