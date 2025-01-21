package Day24;
// 5. PriorityQueue Example: Task Scheduling
/*
 Properties of PriorityQueue

1. Ordered Collection: Elements are ordered based on their natural ordering or 
by a specified comparator.

2. Heap Implementation: Internally implemented as a binary heap, allowing 
efficient retrieval of the highest (or lowest) priority element.

3. Dynamic Size:Automatically resizes as elements are added or removed.

4. Non-Synchronized: Not thread-safe; requires external synchronization for 
concurrent access.

5. Null Elements: Does not allow null elements; adding null throws a 
NullPointerException.

5. Duplicates Allowed:Can contain multiple occurrences of the same element.

6. Accessing Elements: The head of the queue (highest priority element) can be 
accessed using the peek() method.

7. Removal of Elements: The highest priority element can be removed using the 
poll() method.

8. Comparator Support: Can be constructed with a custom comparator to define 
the order of elements.

9. Iterators: Provides an iterator, but the order of iteration is not 
guaranteed to match the priority order.

10. Performance: Insertion and removal operations have a time complexity of 
O(log n); accessing the head element is O(1).

11. Not a Blocking Queue: Does not block on operations; it is a non-blocking 
queue. 
 */
import java.util.PriorityQueue;
import java.util.Iterator;

public class demo13 {
    public static void main(String[] args) {
        // Create a PriorityQueue to store tasks based on priority
        PriorityQueue<String> tasks = new PriorityQueue<>();
        
        // Add tasks with different priorities (real-world related)
        tasks.offer("Submit project report"); // High priority
        tasks.offer("Respond to client emails"); // Medium priority
        tasks.offer("Prepare for team meeting"); // Medium priority
        tasks.offer("Update project documentation"); // Low priority
        tasks.offer("Schedule performance reviews"); // High priority
        
        // Display the current tasks
        System.out.println("Current Tasks: " + tasks);
        
        // Process tasks in order of priority
        System.out.println("Processing tasks in order of priority:");
        while (!tasks.isEmpty()) {
            System.out.println("Processing: " + tasks.poll());
        }
        
        // Check if a specific task exists
        if (tasks.contains("Prepare for team meeting")) {
            System.out.println("The task 'Prepare for team meeting' exists in the queue.");
        } else {
            System.out.println("The task 'Prepare for team meeting' does not exist in the queue.");
        }
        
        // Get the size of the PriorityQueue
        System.out.println("Number of tasks: " + tasks.size());
        
        // Add more tasks
        tasks.offer("Conduct user testing");
        tasks.offer("Finalize budget proposal");
        
        // Iterate using a for-each loop (Note: This does not guarantee order)
        System.out.println("Iterating using enhanced for loop:");
        for (String task : tasks) {
            System.out.println(task);
        }
        
        // Iterate using an Iterator (Note: This does not guarantee order)
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the PriorityQueue
        tasks.clear();
        System.out.println("Tasks after clearing: " + tasks);
    }
}