package Day22;
// ASynchronization

//Class that implements Runnable to create asynchronous tasks
class AsyncTask implements Runnable {
 private final String taskName; // Name of the task

 // Constructor to initialize the task name
 public AsyncTask(String taskName) {
     this.taskName = taskName;
 }

 // The run method that contains the code to be executed by the thread
 @Override
 public void run() {
     System.out.println(taskName + " is starting.");
     try {
         // Simulate some work with sleep (random time between 1 to 3 seconds)
         int duration = (int) (Math.random() * 3000) + 1000; // Random duration between 1 and 3 seconds
         Thread.sleep(duration);
     } catch (InterruptedException e) {
         System.out.println(taskName + " was interrupted.");
     }
     System.out.println(taskName + " has finished.");
 }
}

//Main class to demonstrate asynchronous execution
public class demo21 {
 public static void main(String[] args) {
     // Create multiple asynchronous tasks
     Thread task1 = new Thread(new AsyncTask("Task 1"));
     Thread task2 = new Thread(new AsyncTask("Task 2"));
     Thread task3 = new Thread(new AsyncTask("Task 3"));

     // Start the tasks
     task1.start();
     task2.start();
     task3.start();

     // Main thread continues to run independently
     System.out.println("Main thread is running independently.");

     // Wait for all tasks to finish
     try {
         task1.join();
         task2.join();
         task3.join();
     } catch (InterruptedException e) {
         System.out.println("Main thread was interrupted.");
     }

     // Indicate that all tasks have completed
     System.out.println("All tasks have completed.");
 }
}