package thread;

public class MultithreadingMain {

    public static void main(String[] args) throws InterruptedException {
        Multithreading multithreading=new Multithreading(1);
        Multithreading multithreadingtwo=new Multithreading(2);

        multithreading.start();
        multithreading.join();
        multithreadingtwo.start();
    }
}
