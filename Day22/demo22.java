package Day22;
//Deadlock

//Class to demonstrate deadlock
public class demo22 {
 private static final String resource1 = "Resource1";
 private static final String resource2 = "Resource2";

 public static void main(String[] args) {
     // Thread 1
     Thread t1 = new Thread(() -> {
         synchronized (resource1) {
             System.out.println("Thread 1: Locked " + resource1);
             try {
                 // Simulate some work with sleep
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             synchronized (resource2) {
                 System.out.println("Thread 1: Locked " + resource2);
             }
         }
     });

     // Thread 2
     Thread t2 = new Thread(() -> {
         synchronized (resource2) {
             System.out.println("Thread 2: Locked " + resource2);
             try {
                 // Simulate some work with sleep
                 Thread.sleep(100);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             synchronized (resource1) {
                 System.out.println("Thread 2: Locked " + resource1);
             }
         }
     });

     // Start both threads
     t1.start();
     t2.start();
 }
}