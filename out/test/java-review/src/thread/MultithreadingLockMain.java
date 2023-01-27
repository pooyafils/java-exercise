package thread;

public class MultithreadingLockMain {
    public static void main(String[] args) {
        MultithreadingLock multithreadingLock=new MultithreadingLock();
        MultithreadingLock m=new MultithreadingLock();

        m.start();
        multithreadingLock.start();
    }
}
