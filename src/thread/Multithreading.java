package thread;

public class Multithreading extends Thread {
    private int threadNumber;
public Multithreading(int threadNumber){
    this.threadNumber=threadNumber;
}
    @Override
    public void run() {
        for(int i=0;i<=6;i++){
            System.out.println(i+" from thread number"+threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
