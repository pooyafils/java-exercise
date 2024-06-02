package masteringthreadcourse.chapterthree;

public class CreateThread {
    public static void main(String[] args) throws InterruptedException {
       Thread thread= Thread.currentThread();
       System.out.println("current thread "+thread.getName());
       Thread.sleep(3000);
       System.out.println("current thread "+thread.getName());
    }
}
