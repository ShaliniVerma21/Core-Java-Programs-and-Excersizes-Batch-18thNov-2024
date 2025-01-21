package Day24;
// 18. HashMap Example: Counting Word Frequencies
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class demo25 {
    public static void main(String[] args) {
        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        // Sample text
        String text = "hello world hello java programming java programming";
        String[] words = text.split(" ");
        
        // Count word frequencies
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Display word frequencies
        System.out.println("Word Frequencies: " + wordCount);
        
        // Conditional logic to simulate user actions
        String action = "check"; // Simulate user action (can be "add", "check", "clear")
        String wordToCheck = "java"; // Word to check
        
        if (action.equals("add")) {
            String newWord = "hello";
            wordCount.put(newWord, wordCount.getOrDefault(newWord, 0) + 1);
            System.out.println("Added/Updated word: " + newWord + " with frequency: " + wordCount.get(newWord));
        } else if (action.equals("check")) {
            if (wordCount.containsKey(wordToCheck)) {
                System.out.println("The word '" + wordToCheck + "' appears " + wordCount.get(wordToCheck) + " times.");
            } else {
                System.out.println("The word '" + wordToCheck + "' does not exist in the word count.");
            }
        } else if (action.equals("clear")) {
            wordCount.clear();
            System.out.println("Word frequencies have been cleared.");
        } else {
            System.out.println("No valid action specified.");
        }
        
        // Get the size of the HashMap
        System.out.println("Number of unique words: " + wordCount.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = wordCount.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Word: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
        
        // Clear the HashMap
        wordCount.clear();
        System.out.println("Word frequencies after clearing: " + wordCount);
    }
}