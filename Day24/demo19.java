package Day24;
// 11. TreeMap Example: Storing Sorted Key-Value Pairs
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class demo19 {
    public static void main(String[] args) {
        // Create a TreeMap to store sorted key-value pairs (real-world related)
        TreeMap<String, Integer> scoreMap = new TreeMap<>();
        
        // Add scores
        scoreMap.put("Alice", 90);
        scoreMap.put("Bob", 85);
        scoreMap.put("Charlie", 92);
        scoreMap.put("Diana", 88);
        scoreMap.put("Ethan", 95);
        
        // Attempt to add a duplicate key
        scoreMap.put("Alice", 93); // This will update Alice's score
        
        // Display scores in sorted order
        System.out.println("Scores: " + scoreMap);
        
        // Check if a specific key exists
        if (scoreMap.containsKey("Charlie")) {
            System.out.println("Charlie's score: " + scoreMap.get("Charlie"));
        } else {
            System.out.println("Charlie does not exist in the score map.");
        }
        
        // Get the size of the TreeMap
        System.out.println("Number of entries in the score map: " + scoreMap.size());
        
        // Get the first and last entries
        System.out.println("First entry: " + scoreMap.firstEntry());
        System.out.println("Last entry: " + scoreMap.lastEntry());
        
        // Iterate using a for-each loop over the entry set
        System.out.println("Iterating using enhanced for loop:");
        for (Map.Entry<String, Integer> entry : scoreMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Score: " + entry.getValue());
        }
        
        // Iterate using an Iterator over the entry set
        System.out.println("Iterating using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = scoreMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Score: " + entry.getValue());
        }
        
        // Clear the TreeMap
        scoreMap.clear();
        System.out.println("Score map after clearing: " + scoreMap);
    }
}