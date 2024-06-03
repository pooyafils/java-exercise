package masteringthreadcourse.chapterthree.examples;

public class JoinMethodExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulate some work with a 2-second sleep
                System.out.println("Thread t1 has finished executing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Thread t2 is waiting for t1 to finish");
            try {
                t1.join(); // t2 will wait for t1 to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread t2 has finished executing");
        });

        t1.start();
        t2.start();
    }
}
