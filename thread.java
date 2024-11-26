class MyThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Number: " + i);
                // Sleep for 5 seconds (5000 milliseconds)
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread myThread = new MyThread();
        
        // Create a Thread object and pass the MyThread instance
        Thread thread = new Thread(myThread);
        
        // Start the thread
        System.out.println("Starting the thread...");
        thread.start();
    }
}
