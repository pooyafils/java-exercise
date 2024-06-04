package masteringthreadcourse.chapterthree.threadGroup;

public class ThreadGroups {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->System.out.println("thread1"));
        Thread thread2=new Thread(()->System.out.println("thread2"));
        Thread thread3=new Thread(()->System.out.println("thread3"));
         thread1.start();
         thread1.join();
    }
}
