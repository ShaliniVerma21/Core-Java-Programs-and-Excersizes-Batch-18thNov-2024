package Day22;
//How to Perform Multiple Tasks by Multiple Threads

class demo9 implements Runnable {
    public void run() {
        System.out.println("Task executed by: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new demo9());
            thread.start();
        }
    }
}