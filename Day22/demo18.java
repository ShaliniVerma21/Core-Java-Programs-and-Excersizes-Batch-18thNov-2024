package Day22;
//Daemon Thread

//Class that implements Runnable to create a daemon thread
class DaemonThread implements Runnable {
 // The run method that contains the code to be executed by the daemon thread
 @Override
 public void run() {
     // Repeat forever
     while (true) {
         // Print a message indicating the daemon thread is running
         System.out.println("I'm a Daemon.");
         try {
             // Sleep for half a second to simulate work
             Thread.sleep(500);
         } catch (InterruptedException ignored) {
             // Handle interruption
             System.out.println("Daemon thread was interrupted.");
         }
     }
 }
}

//Main class to demonstrate daemon thread behavior
public class demo18 {
 public static void main(String[] args) {
     // Create a new thread for the daemon
     Thread daemonThread = new Thread(new DaemonThread());
     
     // Set the thread as a daemon
     daemonThread.setDaemon(true);
     
     // Start the daemon thread
     daemonThread.start();
     
     // Main thread sleeps for five seconds
     try {
         Thread.sleep(5000);
     } catch (InterruptedException ignored) {
         // Handle interruption
         System.out.println("Main thread was interrupted.");
     }
     
     // Print a message indicating the main thread has finished
     System.out.println("Done.");
 }
}