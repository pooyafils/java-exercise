package masteringthreadcourse.chapterfour;

import javax.swing.*;
import java.util.concurrent.Semaphore;

public class ThreadSemaphores {
       private static Semaphore semaphore=new Semaphore(2);

    public static void main(String[] args) throws InterruptedException {
Executor executor=new Executor();
executor.submit(new Job(4000));
executor.submit(new Job(5000));
executor.submit(new Job(3000));

    }


    static  class  Executor{

        public void  submit(Job job) throws InterruptedException {
            System.out.println("launching job "+job.getWork());
            semaphore.acquire();
            Thread t=new Thread(()->{
                try {
                    System.out.println("executing job "+job.getWork());
                    Thread.sleep(job.getWork());
                    semaphore.release();
                    System.out.println(" job finished with id "+job.getWork());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t.start();
        }
    }
    public static class Job {

        private final int work;

        public Job(int work) {
            this.work = work;
        }

        public int getWork() {
            return work;
        }
    }
}
