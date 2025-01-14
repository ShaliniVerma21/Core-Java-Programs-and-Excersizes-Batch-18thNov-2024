package Day23;
/*
 8. Anonymous Inner Class: Thread Implementation
Problem: Create a thread using an anonymous inner class to print numbers. 
 */
public class p16 {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Number: " + i);
                }
            }
        };
        thread.start(); // Output: Number: 1, Number: 2, ...
    }
}