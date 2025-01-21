package Day24;
// 12. ArrayDeque Example: Implementing a Queue
import java.util.ArrayDeque;
import java.util.Iterator;

public class demo2 {
    public static void main(String[] args) {
        // Create an ArrayDeque to implement a queue
        ArrayDeque<String> queue = new ArrayDeque<>();
        
        // Add elements to the queue (real-world related tasks)
        queue.offer("Complete project report");
        queue.offer("Attend team meeting");
        queue.offer("Review code changes");
        queue.offer("Prepare presentation");
        queue.offer("Send out meeting notes");
        queue.offer("Conduct user testing");
        queue.offer("Finalize budget proposal");
        queue.offer("Update project documentation");
        queue.offer("Schedule performance reviews");
        queue.offer("Plan team-building activity");
        
        // Display the current queue
        System.out.println("Current Queue: " + queue);
        
        // Process elements in FIFO order
        System.out.println("Processing tasks in FIFO order:");
        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
        
        // Check if a specific task exists
        queue.offer("Complete project report"); // Re-adding for demonstration
        if (queue.contains("Complete project report")) {
            System.out.println("The task 'Complete project report' exists in the queue.");
        } else {
            System.out.println("The task 'Complete project report' does not exist in the queue.");
        }
        
        // Get the size of the ArrayDeque
        System.out.println("Number of tasks in the queue: " + queue.size());
        
        // Add more tasks
        queue.offer("Prepare for client meeting");
        queue.offer("Draft new project proposal");
        
        // Peek at the first task without removing it
        System.out.println("First task (peek): " + queue.peek());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String task : queue) {
            System.out.println(task);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the ArrayDeque
        queue.clear();
        System.out.println("Queue after clearing: " + queue);
    }
}