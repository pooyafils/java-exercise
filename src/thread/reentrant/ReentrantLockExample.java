package thread.reentrant;

public class ReentrantLockExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Create and start multiple threads to increment the shared resource.
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedResource.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                sharedResource.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the shared resource.
        System.out.println("Final value: " + sharedResource.getValue());
    }
}