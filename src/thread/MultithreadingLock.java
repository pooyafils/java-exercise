package thread;

import java.util.concurrent.locks.ReentrantLock;

public class MultithreadingLock extends Thread{
    ReentrantLock lock = new ReentrantLock();

    public void print(){
        lock.lock();
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        print();
    }
}
