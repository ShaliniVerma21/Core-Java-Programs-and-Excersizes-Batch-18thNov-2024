package Day24;
// 16. LinkedHashSet Example: Maintaining Order of User Actions
import java.util.LinkedHashSet;
import java.util.Iterator;

public class demo23 {
    public static void main(String[] args) {
        // Create a LinkedHashSet to maintain the order of user actions
        LinkedHashSet<String> actions = new LinkedHashSet<>();
        
        // Simulate user actions (real-world related)
        actions.add("Login");
        actions.add("View Profile");
        actions.add("Edit Profile");
        actions.add("Change Password");
        actions.add("Logout");
        actions.add("Login"); // Duplicate, will not be added
        actions.add("View Dashboard");
        actions.add("Send Message");
        actions.add("Receive Notification");
        actions.add("Logout"); // Duplicate, will not be added
        
        // Display user actions in the order they were performed
        System.out.println("User  Actions: " + actions);
        
        // Conditional logic to simulate user actions
        String action = "check"; // Simulate user action (can be "add", "check", "clear")
        String actionToCheck = "Edit Profile"; // Action to check
        
        if (action.equals("add")) {
            String newAction = "Upload File";
            if (actions.add(newAction)) {
                System.out.println("Added new action: " + newAction);
            } else {
                System.out.println("Action already exists: " + newAction);
            }
        } else if (action.equals("check")) {
            if (actions.contains(actionToCheck)) {
                System.out.println("The action '" + actionToCheck + "' exists in the set.");
            } else {
                System.out.println("The action '" + actionToCheck + "' does not exist in the set.");
            }
        } else if (action.equals("clear")) {
            actions.clear();
            System.out.println("User  actions have been cleared.");
        } else {
            System.out.println("No valid action specified.");
        }
        
        // Get the size of the LinkedHashSet
        System.out.println("Number of unique actions: " + actions.size());
        
        // Iterate using a for-each loop
        System.out.println("Iterating using enhanced for loop:");
        for (String userAction : actions) {
            System.out.println(userAction);
        }
        
        // Iterate using an Iterator
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = actions.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // Clear the LinkedHashSet
        actions.clear();
        System.out.println("User  actions after clearing: " + actions);
    }
}