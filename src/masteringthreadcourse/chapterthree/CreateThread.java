package masteringthreadcourse.chapterthree;

public class CreateThread {
  /*  public static void main(String[] args) throws InterruptedException {
       Thread thread= Thread.currentThread();
       System.out.println("current thread "+thread.getName());
       Thread.sleep(3000);
       System.out.println("current thread "+thread.getName());
    }*/

  /*  public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start(); // use start method not run method
    }

    static class MyThread extends Thread{
        public void run(){
            setName("my Thread");
            System.out.println("current thread "+Thread.currentThread().getName());
        }
    }*/

/*    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("current thread "+Thread.currentThread().getName());
            }
        };
        Thread thread=new Thread(runnable);
        thread.setName("run");
        thread.start();

    }*/

    public static void main(String[] args) throws InterruptedException {
        System.out.println("{1} current thread "+Thread.currentThread().getName());
        Thread thread=new Thread(
                ()->{
                    System.out.println("{2} current thread"+ Thread.currentThread().getName());
                }
        );
        thread.setName("my thread ");
        thread.start();
        thread.join();
        System.out.println("{3} current thread "+Thread.currentThread().getName());
    }
}
