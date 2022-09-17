package thread;

public class SynchronizableBlock extends Thread {
    public void myBlock(){
        synchronized (this){
            for(int i=0;i<5;i++){
                System.out.println(i);
            }
        }
    }

    @Override
    public void run() {
        myBlock();
    }
}
