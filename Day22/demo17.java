package Day22;
// Priority of a thread

//Class that implements Runnable to create worker threads
class WorkerThread implements Runnable {
 private String threadName; // Name of the thread

 // Constructor to set the thread name
 public WorkerThread(String name) {
     this.threadName = name;
 }

 // The run method that contains the code to be executed by the thread
 @Override
 public void run() {
     for (int i = 1; i <= 5; i++) {
         // Print the name of the current thread and its count
         System.out.println(threadName + ": Count " + i);
         try {
             // Sleep for 100 milliseconds to simulate work
             Thread.sleep(100);
         } catch (InterruptedException e) {
             // Handle interruption
             System.out.println(threadName + " was interrupted.");
         }
     }
 }
}

//Main class to demonstrate thread priority
public class demo17 {
 public static void main(String[] args) {
     // Create threads with different priorities
     Thread highPriorityThread = new Thread(new WorkerThread("HighPriorityThread"));
     Thread normalPriorityThread = new Thread(new WorkerThread("NormalPriorityThread"));
     Thread lowPriorityThread = new Thread(new WorkerThread("LowPriorityThread"));

     // Set thread priorities
     highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Priority 10
     normalPriorityThread.setPriority(Thread.NORM_PRIORITY); // Priority 5 (default)
     lowPriorityThread.setPriority(Thread.MIN_PRIORITY); // Priority 1

     // Start the threads
     highPriorityThread.start();
     normalPriorityThread.start();
     lowPriorityThread.start();

     try {
         // Wait for all threads to finish
         highPriorityThread.join();
         normalPriorityThread.join();
         lowPriorityThread.join();
     } catch (InterruptedException e) {
         // Handle interruption of the main thread
         System.out.println("Main thread was interrupted.");
     }

     // Print a message indicating that the main thread has finished
     System.out.println("Main thread has finished execution.");
 }
}