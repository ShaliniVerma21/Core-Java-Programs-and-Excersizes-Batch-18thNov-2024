package Day22;
//Define a thread class that extends Thread
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class demo1 {
    public static void main(String[] args) {
        // Create a new thread
        MyThread thread = new MyThread();
        // Start the thread
        System.out.println("State of thread after creation: " + thread.getState()); // NEW
        thread.start();
        System.out.println("State of thread after calling start(): " + thread.getState()); // RUNNABLE
    
    }
}