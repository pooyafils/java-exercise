package masteringthreadcourse.chapterthree.examples;

public class ThreadSample {
    public static void main(String[] args) throws InterruptedException {
        Thread th=new Thread(()->System.out.println("thread1"));
        Thread thread2=new Thread(()->System.out.println("thread2"));
        System.out.println("start.....");
        th.start();
        th.sleep(3000);
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
        th.join();
        thread2.start();

    }
}
