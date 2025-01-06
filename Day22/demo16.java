package Day22;
// Naming a thread

//Class that extends Thread to create a custom thread
class NamedThread extends Thread {
 // Constructor to set the thread name
 public NamedThread(String name) {
     super(name); // Call the parent constructor with the thread name
 }

 // The run method that contains the code to be executed by the thread
 @Override
 public void run() {
     // Print the name of the current thread
     System.out.println(getName() + " is running.");
     try {
         // Simulate some work with sleep (2 seconds)
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         System.out.println(getName() + " was interrupted.");
     }
     // Print a message indicating the thread has finished
     System.out.println(getName() + " has finished.");
 }
}

//Main class to demonstrate thread naming
public class demo16 {
 public static void main(String[] args) {
     // Create two threads with custom names
     NamedThread thread1 = new NamedThread("Thread A");
     NamedThread thread2 = new NamedThread("Thread B");

     // Start the threads
     thread1.start();
     thread2.start();

     try {
         // Wait for both threads to finish
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread was interrupted.");
     }

     // Print a message indicating that the main thread has finished
     System.out.println("Main thread has finished execution.");
 }
}