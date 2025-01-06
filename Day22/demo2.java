package Day22;

//Define a runnable class that implements Runnable
class MyRunnable implements Runnable {
 @Override
 public void run() {
     System.out.println("Runnable is running");
 }
}

public class demo2 {
 public static void main(String[] args) {
     // Create a new thread with a runnable
     Thread thread = new Thread(new MyRunnable());
     // Start the thread
     thread.start();
 }
}