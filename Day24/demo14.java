package Day24;
// 6. Deque Example: Task Management
import java.util.ArrayDeque;
import java.util.Iterator;

public class demo14 {
    public static void main(String[] args) {
        // Create a Deque to store tasks
        ArrayDeque<String> deque = new ArrayDeque<>();
        
        // Add tasks (real-world related)
        deque.add("Complete project report");
        deque.add("Attend team meeting");
        deque.add("Review code changes");
        deque.add("Prepare presentation");
        deque.add("Send out meeting notes");
        
        // Display current tasks
        System.out.println("Current Tasks: " + deque);
        
        // Process tasks from both ends
        System.out.println("Processing tasks:");
        while (!deque.isEmpty()) {
            System.out.println("Processing: " + deque.pollFirst()); // Process from the front
        }
        
        // Add tasks back to the deque for demonstration
        deque.add("Complete project report");
        deque.add("Attend team meeting");
        deque.add("Review code changes");
        deque.add("Prepare presentation");
        deque.add("Send out meeting notes");
        
        // Peek at the first and last tasks
        System.out.println("First task (peek): " + deque.peekFirst());
        System.out.println("Last task (peek): " + deque.peekLast());
        
        // Check if a specific task exists
        if (deque.contains("Review code changes")) {
            System.out.println("The task 'Review code changes' exists in the deque.");
        } else {
            System.out.println("The task 'Review code changes' does not exist in the deque.");
        }
        
        // Get the size of the Deque
        System.out.println("Number of tasks: " + deque.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String task : deque) {
            System.out.println(task);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the Deque
        deque.clear();
        System.out.println("Tasks after clearing: " + deque);
    }
}