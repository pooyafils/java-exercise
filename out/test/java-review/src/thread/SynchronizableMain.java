package thread;

public class SynchronizableMain {
    public static void main(String[] args) {
        Synchronizable synchronizable=new Synchronizable();
        Synchronizable synchronizable1=new Synchronizable();
        Thread thread=new Thread(synchronizable);
        Thread thread1=new Thread(synchronizable1);

        thread.start();
        thread1.start();

    }
}
