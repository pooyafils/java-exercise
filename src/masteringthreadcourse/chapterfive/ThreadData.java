package masteringthreadcourse.chapterfive;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;

public class ThreadData {

    public static void main(String[] args) throws InterruptedException {
        Exchanger<String> exchanger=new Exchanger<>();
        Thread t=new Thread(()->{
            try {
                String receivedValue=exchanger.exchange("value1");
                System.out.println("Received: "+receivedValue + " in thread "+Thread.currentThread());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        t.start();
        String receivedValue=exchanger.exchange("value2");
        System.out.println("Received: "+receivedValue + " in thread "+Thread.currentThread());

    }

}
