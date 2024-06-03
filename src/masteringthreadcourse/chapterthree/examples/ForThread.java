package masteringthreadcourse.chapterthree.examples;

public class ForThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(()->{
            for(int i=0;i<10;i++){
                if(i%2==0){
                    System.out.println("-----> "+i);
                    try {
                        Thread.sleep(2000); // Simulate some work with a 2-second sleep
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        Thread thread2=new Thread(()->{
            for(int i=0;i<10;i++){
                if(i%2>0){
                    System.out.println("++++++++> "+i);
                    try {
                        Thread.sleep(2000); // Simulate some work with a 2-second sleep
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });
        thread1.start();
        thread1.join();

        thread2.start();
    }
}
