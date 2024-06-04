package masteringthreadcourse.chapterthree;

public class ThreadLocalVariables {
    private static int golbalCounter=0;
    private static ThreadLocal<String> threadLocal=ThreadLocal.withInitial(()->"initial value");
    public static void main(String[] args) {
       // Thread t1=new Thread();
      //  Thread t2=new Thread();
       // t1.start();
     //   t2.start();
        Thread thread=new Thread(new MyThread(),"thread1");
thread.start();

    }
    static  class MyThread implements Runnable{

        @Override
        public void run() {
        int counter=0;
        threadLocal.set("myValue");
        threadLocal.get();
        System.out.println(threadLocal.get());

        }

    }
}
