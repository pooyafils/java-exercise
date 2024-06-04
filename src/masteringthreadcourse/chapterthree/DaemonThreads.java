package masteringthreadcourse.chapterthree;

import masteringthreadcourse.chapterthree.threadGroup.ThreadGroups;

public class DaemonThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new MyThread(5),"thread1");
        thread1.setDaemon(true);
        Thread thread2=new Thread(new MyThread(3),"thread2");
        thread1.start();
        thread2.start();
    }
    static class CustomThreadGroup extends ThreadGroup {


        public CustomThreadGroup(String name) {
            super(name);
        }

        @Override
        public void uncaughtException(Thread t, Throwable e) {
          System.out.println(e.getMessage());
        }
    }

    static class  MyThread implements Runnable{
private final int numberOfSeconds;

        public MyThread(int numberOfSeconds) {
            this.numberOfSeconds = numberOfSeconds;
        }

        @Override
        public void run() {
            for(int i=0;i<numberOfSeconds;i++){
                try {
                    Thread.sleep(1000);
                    System.out.println("Sleeping for 1s, Thread is "+Thread.currentThread().getName());

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
