package masteringthreadcourse.chapterthree;

public class ThreadPriorities    {

   /* public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);

        Thread thread1=new Thread(
                ()->{
                  Thread currentThread=Thread.currentThread();
                  System.out.println(currentThread.getName()+ " priority = "+currentThread.getPriority());
                }
        );

thread1.setName("Theread_1");
thread1.setPriority(Thread.MAX_PRIORITY);


        Thread thread2=new Thread(
                ()->{
                    Thread currentThread=Thread.currentThread();
                    System.out.println(currentThread.getName()+ " priority = "+currentThread.getPriority());
                }
        );

        thread1.setName("Theread_2");
        thread1.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }*/

    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()-> {
            Thread currentThread = Thread.currentThread();
            System.out.println("{1} state "+currentThread.getState());
        }

        );
        System.out.println("{2} state"+thread1.getState());
        thread1.start();
        System.out.println("{2} state"+thread1.getState());
    thread1.join();
        System.out.println("{2} state"+thread1.getState());

    }
}
