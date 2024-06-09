package masteringthreadcourse.chapterfour;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {
    private static  int S=0;
    private static int[] array=new int[10];
    private static Lock lock=new ReentrantLock();
    private static int sum = 0;
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            array[i] = 10;

        }
        List<Thread> threadList=new ArrayList<>();
        int threadSlice=array.length/2;

        for(int i=0;i<2;i++){
            Thread t=new Thread(new WorkerThread(i*threadSlice,(i+1)*threadSlice));
                    t.start();
            threadList.add(t);


        }
        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println("Sum is: " + sum);

    }

    static class WorkerThread implements Runnable{

        private final int left;
        private final int right;

        public WorkerThread(int left, int right) {
            this.left = left;
            this.right = right;
        }

        @Override
        public void run() {
            for(int i=left;i<right;i++){
                lock.lock();
                sum=sum+array[i];
                lock.unlock();
            }
        }
    }
}
