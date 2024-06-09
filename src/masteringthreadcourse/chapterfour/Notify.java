package masteringthreadcourse.chapterfour;

import java.util.LinkedList;
import java.util.Queue;

public class Notify {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();

        Thread producer =new Thread(new Producer(queue));
        Thread consumer =new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

    }

    static class Producer implements Runnable{
private  final Queue<String> queue;

        public Producer(Queue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
        while (true){
            try {
                produceData();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }

        private void produceData() throws InterruptedException {
            synchronized (queue){
                if(queue.size()==10){
                   System.out.println(" in produce, waiting . . .");
                   queue.wait();
                }
                Thread.sleep(1000);
                System.out.println("Producing data with id "+queue.size());
                queue.add("element+"+queue.size());
                if(queue.size()==1){
                    queue.notify();

                }
            }
        }
    }

    static class Consumer implements  Runnable{
        private  final Queue<String> queue;

        public Consumer(Queue<String> queue) {
            this.queue = queue;
        }

        @Override
        public void run() {
       while (true){
           try {
               consumerData();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }
        }

        private void consumerData() throws InterruptedException {
            synchronized (queue){
                if(queue.isEmpty()){
                    System.out.println("Consumer is watiing ...");
                    queue.wait();
                }
                Thread.sleep(700);
                String data=queue.remove();
                System.out.println("Consumed data: "+data);
                if(queue.size()==9){
                    queue.notify();

                }
            }
        }
    }
}
