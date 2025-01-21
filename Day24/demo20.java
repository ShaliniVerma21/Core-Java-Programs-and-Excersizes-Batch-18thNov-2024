package Day24;
// 13. Stack Example: Browser History with Conditional Logic
import java.util.Stack;
import java.util.Iterator;

public class demo20 {
    public static void main(String[] args) {
        // Create a Stack to store browser history
        Stack<String> history = new Stack<>();
        
        // Simulate visiting pages (real-world related)
        history.push("Homepage");
        history.push("About Us");
        history.push("Services");
        history.push("Contact");
        history.push("Blog");
        history.push("FAQ");
        history.push("Testimonials");
        history.push("Portfolio");
        history.push("Privacy Policy");
        history.push("Terms of Service");
        
        // Display current browser history
        System.out.println("Current Browser History: " + history);
        
        // Conditional logic to simulate user actions
        String action = "back"; // Simulate user action (can be "back", "peek", "check", "clear")
        
        if (action.equals("back") && !history.isEmpty()) {
            System.out.println("Going back to: " + history.pop());
        } else if (action.equals("peek") && !history.isEmpty()) {
            System.out.println("Current page after going back (peek): " + history.peek());
        } else if (action.equals("check")) {
            String pageToCheck = "Blog";
            if (history.contains(pageToCheck)) {
                System.out.println("The page '" + pageToCheck + "' exists in the history.");
            } else {
                System.out.println("The page '" + pageToCheck + "' does not exist in the history.");
            }
        } else if (action.equals("clear")) {
            history.clear();
            System.out.println("Browser history has been cleared.");
        } else {
            System.out.println("No action taken or history is empty.");
        }
        
        // Get the size of the Stack
        System.out.println("Number of pages in history: " + history.size());
        
        // Iterate using a for-each loop (Note: This does not guarantee order)
        System.out.println("Iterating using enhanced for loop:");
        for (String page : history) {
            System.out.println(page);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = history.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the Stack
        history.clear();
        System.out.println("Browser history after clearing: " + history);
    }
}