package Day22;
//Joining a thread

//Class that extends Thread to create a custom thread
class MyThread1 extends Thread {
 private final String threadName;

 // Constructor to initialize the thread name
 public MyThread1(String name) {
     this.threadName = name;
 }

 // The run method that contains the code to be executed by the thread
 @Override
 public void run() {
     System.out.println(threadName + " is starting.");
     try {
         // Simulate some work with sleep (3 seconds)
         Thread.sleep(3000);
     } catch (InterruptedException e) {
         System.out.println(threadName + " was interrupted.");
     }
     System.out.println(threadName + " has finished.");
 }
}

//Main class to demonstrate thread joining
public class demo15 {
 public static void main(String[] args) {
     // Create two threads
     MyThread1 thread1 = new MyThread1("Thread 1");
     MyThread1 thread2 = new MyThread1("Thread 2");

     // Start the threads
     thread1.start();
     thread2.start();

     try {
         // Main thread waits for thread1 to finish
         thread1.join();
         System.out.println("Main thread: " + thread1.getName() + " has completed.");
         
         // Main thread waits for thread2 to finish
         thread2.join();
         System.out.println("Main thread: " + thread2.getName() + " has completed.");
     } catch (InterruptedException e) {
         System.out.println("Main thread was interrupted.");
     }

     System.out.println("Main thread has finished execution.");
 }
}