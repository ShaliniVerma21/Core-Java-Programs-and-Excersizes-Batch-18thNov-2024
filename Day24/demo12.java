package Day24;
// 4. Stack Example: Undo Functionality in Text Editor

/*
Stack--

1. LIFO (Last In, First Out): 
Elements are accessed in reverse order of insertion.
2. Push and Pop: 
Supports standard stack operations like push(), pop(), and peek().
3. Extends Vector: Inherits properties of the Vector class.
4. Duplicates Allowed: Can contain duplicate elements.
5. Synchronized: 
Thread-safe but may have slower performance due to synchronization.
6. Best for Backtracking: 
Suitable for problems involving recursion or backtracking 
(e.g., undo operations, parsing). 
 */

import java.util.Stack;
import java.util.Iterator;

public class demo12 {
    public static void main(String[] args) {
        // Create a Stack to store text edits
        Stack<String> edits = new Stack<>();
        
        // Simulate text edits (real-world related)
        edits.push("Typed 'Hello World'");
        edits.push("Formatted text to bold");
        edits.push("Inserted image");
        edits.push("Changed font size");
        edits.push("Added bullet points");
        
        // Display current edits
        System.out.println("Current Edits: " + edits);
        
        // Undo the last edit
        System.out.println("Undo: " + edits.pop());
        System.out.println("Edits after undo: " + edits);
        
        // Peek at the last edit without removing it
        System.out.println("Last edit (peek): " + edits.peek());
        
        // Check if a specific edit exists
        if (edits.contains("Inserted image")) {
            System.out.println("The edit 'Inserted image' exists in the stack.");
        } else {
            System.out.println("The edit 'Inserted image' does not exist in the "
            		+ "stack.");
        }
        
        // Get the size of the Stack
        System.out.println("Number of edits: " + edits.size());
        
        // Iterate using a for loop
        System.out.println("Iterating using for loop:");
        for (int i = 0; i < edits.size(); i++) {
            System.out.println(edits.get(i));
        }
        
        // Iterate using an enhanced for loop
        System.out.println("Iterating using enhanced for loop:");
        for (String edit : edits) {
            System.out.println(edit);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = edits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the Stack
        edits.clear();
        System.out.println("Edits after clearing: " + edits);
    }
}