package Day24;
// 20. ArrayDeque Example: Implementing a Stack
import java.util.ArrayDeque;
import java.util.Iterator;

public class demo4 {
    public static void main(String[] args) {
        // Create an ArrayDeque to implement a stack
        ArrayDeque<String> stack = new ArrayDeque<>();
        
        // Push elements onto the stack (real-world related items)
        stack.push("Task 1: Complete project report");
        stack.push("Task 2: Attend team meeting");
        stack.push("Task 3: Review code changes");
        stack.push("Task 4: Prepare presentation");
        stack.push("Task 5: Send out meeting notes");
        stack.push("Task 6: Conduct user testing");
        stack.push("Task 7: Finalize budget proposal");
        stack.push("Task 8: Update project documentation");
        stack.push("Task 9: Schedule performance reviews");
        stack.push("Task 10: Plan team-building activity");
        
        // Display current stack
        System.out.println("Current Stack: " + stack);
        
        // Conditional logic to simulate user actions
        String action = "pop"; // Simulate user action (can be "push", "pop", "peek", "clear")
        
        if (action.equals("push")) {
            String newTask = "Task 11: Draft new project proposal";
            stack.push(newTask);
            System.out.println("Added: " + newTask);
        } else if (action.equals("pop")) {
            if (!stack.isEmpty()) {
                System.out.println("Popped: " + stack.pop());
            } else {
                System.out.println("Stack is empty, cannot pop.");
            }
        } else if (action.equals("peek")) {
            if (!stack.isEmpty()) {
                System.out.println("Top of the stack: " + stack.peek());
            } else {
                System.out.println("Stack is empty, cannot peek.");
            }
        } else if (action.equals("clear")) {
            stack.clear();
            System.out.println("Stack has been cleared.");
        } else {
            System.out.println("No valid action specified.");
        }
        
        // Get the size of the ArrayDeque
        System.out.println("Number of tasks in stack: " + stack.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String task : stack) {
            System.out.println(task);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the ArrayDeque
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}