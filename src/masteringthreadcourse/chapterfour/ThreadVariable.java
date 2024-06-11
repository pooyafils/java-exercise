package masteringthreadcourse.chapterfour;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadVariable {
    public static void main(String[] args) throws InterruptedException {
        Lock lock=new ReentrantLock();

        Condition condition=lock.newCondition();

        // thread 1
        lock.lock();

        condition.await();

        lock.unlock();

        condition.signal();

        // thread 2
        lock.lock();

        condition.signal();

        lock.unlock();
    }
}
