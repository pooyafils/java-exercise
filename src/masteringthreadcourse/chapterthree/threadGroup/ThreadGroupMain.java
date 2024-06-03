package masteringthreadcourse.chapterthree.threadGroup;

public class ThreadGroupMain {
    public static void main(String[] args) throws InterruptedException {
        java.lang.ThreadGroup group1=new java.lang.ThreadGroup("Group1");
        group1.setMaxPriority(7);
         Thread thread1= new Thread(group1,new MyThread(),"thread1");
        Thread thread2= new Thread(group1,new MyThread(),"thread2");
        Thread thread3= new Thread(group1,new MyThread(),"thread3");
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.setPriority(Thread.MAX_PRIORITY);
        Thread.sleep(3000);
        System.out.println("sleeping for three seconds");

        group1.interrupt();


    }

    static class MyThread implements Runnable{

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    Thread currentThread=Thread.currentThread();
                    System.out.println("name "+currentThread.getName()+" priority "+currentThread.getPriority());
                }
            }
        }
    }
}
