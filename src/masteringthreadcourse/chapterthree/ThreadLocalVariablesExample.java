package masteringthreadcourse.chapterthree;

import java.util.ArrayList;
import java.util.List;

public class ThreadLocalVariablesExample {
    private static int golbalCounter=0;
    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread());
        List<Thread> threads=new ArrayList<>();
        ThreadGroup group = new ThreadGroup("Group1");

        for(int i=0;i<=1000;i++){
         //   Thread t= new Thread(new MyThread());
            Thread t= new Thread(group,new MyThread());
            t.start();
            threads.add(t);
        }
        group.interrupt();
        threads.forEach(t -> {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println("Total = " + golbalCounter);

    }

    static class MyThread implements Runnable{

        @Override
        public void run() {
            try {
                Thread.sleep(99999);
            } catch (InterruptedException e) {

            }
            golbalCounter++;
        }
    }
}
