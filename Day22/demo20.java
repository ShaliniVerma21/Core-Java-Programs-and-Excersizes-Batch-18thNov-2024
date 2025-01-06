package Day22;
//Synchronization
//Class that represents a shared resource
class Counter {
 private int count = 0; // Shared resource

 // Synchronized method to increment the count
 public synchronized void increment() {
     count++;
 }

 // Method to get the current count (not synchronized)
 public int getCount() {
     return count;
 }
}

//Class that implements Runnable to create worker threads
class CounterThread implements Runnable {
 private Counter counter; // Reference to the shared Counter object

 // Constructor to initialize the Counter object
 public CounterThread(Counter counter) {
     this.counter = counter;
 }

 // The run method that contains the code to be executed by the thread
 @Override
 public void run() {
     for (int i = 0; i < 1000; i++) {
         counter.increment(); // Increment the shared counter
     }
 }
}

//Main class to demonstrate synchronization
public class demo20 {
 public static void main(String[] args) {
     Counter counter = new Counter(); // Create a shared Counter object

     // Create multiple threads that will increment the counter
     Thread thread1 = new Thread(new CounterThread(counter));
     Thread thread2 = new Thread(new CounterThread(counter));

     // Start the threads
     thread1.start();
     thread2.start();

     // Wait for both threads to finish
     try {
         thread1.join();
         thread2.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread was interrupted.");
     }

     // Print the final count
     System.out.println("Final count: " + counter.getCount());
 }
}