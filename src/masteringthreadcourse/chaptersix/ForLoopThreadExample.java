package masteringthreadcourse.chaptersix;

public class ForLoopThreadExample {
    public static void main(String[] args) {
        // Define the number of threads to create
        int numberOfThreads = 5;

        // Create and start threads using a for loop
        for (int i = 0; i < numberOfThreads; i++) {
            // Create a new thread, passing a Runnable that prints the thread number
            Thread thread = new Thread(new MyRunnable(i));
            thread.start();
        }
    }
}

class MyRunnable implements Runnable {
    private int threadNumber;

    public MyRunnable(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        // Print the thread number
        System.out.println("Thread number: " + threadNumber);
    }
}
