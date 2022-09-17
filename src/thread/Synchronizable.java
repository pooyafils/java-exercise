package thread;

public class Synchronizable implements Runnable {
    synchronized void print(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }

    @Override
    public void run() {
        print();
    }
}
