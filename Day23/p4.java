package Day23;
/*
 15. Anonymous Inner Class: Runnable Implementation
Problem: Create a runnable task using an anonymous inner class to print a message. 
 */
public class p4 {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Running task in a separate thread.");
            }
        };
        new Thread(task).start(); // Output: Running task in a separate thread.
    }
}