package Day24;
// 9. TreeSet Example: Storing Sorted Unique Values
import java.util.TreeSet;
import java.util.Iterator;

public class demo17 {
    public static void main(String[] args) {
        // Create a TreeSet to store sorted unique strings (real-world related)
        TreeSet<String> sortedSet = new TreeSet<>();
        
        // Add elements
        sortedSet.add("Banana");
        sortedSet.add("Apple");
        sortedSet.add("Cherry");
        sortedSet.add("Mango");
        sortedSet.add("Grapes");
        
        // Attempt to add a duplicate element
        sortedSet.add("Apple"); // Duplicate, will not be added
        
        // Display elements in sorted order
        System.out.println("Sorted Set: " + sortedSet);
        
        // Check if a specific item exists
        if (sortedSet.contains("Mango")) {
            System.out.println("The item 'Mango' exists in the set.");
        } else {
            System.out.println("The item 'Mango' does not exist in the set.");
        }
        
        // Get the size of the TreeSet
        System.out.println("Number of items in the sorted set: " + sortedSet.size());
        
        // Get the first and last elements
        System.out.println("First item: " + sortedSet.first());
        System.out.println("Last item: " + sortedSet.last());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String item : sortedSet) {
            System.out.println(item);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = sortedSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the TreeSet
        sortedSet.clear();
        System.out.println("Items after clearing: " + sortedSet);
    }
}