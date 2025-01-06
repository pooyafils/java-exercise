package javacore;

public class SimpleVirtualThreadExample {

    public static void main(String[] args) {
        // Create and start 10 virtual threads
        for (int i = 1; i <= 10; i++) {
            int taskNumber = i;
            Thread.ofVirtual().start(() -> {
                System.out.println("Task " + taskNumber + " is running on " + Thread.currentThread());
            });
        }
    }
}
