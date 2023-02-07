package JavaCookBook.chapter16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StopBoolean {
    // Must be volatile to ensure changes visible to other threads.
    protected volatile boolean done = false;
    Runnable r = () -> {
        while (!done) {
            System.out.println("StopBoolean running");
            try {

                Thread.sleep(720);
            } catch (InterruptedException ex) {
// nothing to do
            }
        }
        System.out.println("StopBoolean finished.");
    };
    public void shutDown() {
        System.out.println("Shutting down...");
        done = true;
    }
    public void doDemo() throws InterruptedException {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        pool.submit(r);
        Thread.sleep(1000*5);
        shutDown();
        pool.shutdown();
        pool.awaitTermination(2, TimeUnit.SECONDS);
    }
    public static void main(String[] args) throws InterruptedException {
        new StopBoolean().doDemo();
    }
}