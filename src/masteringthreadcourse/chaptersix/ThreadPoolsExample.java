package masteringthreadcourse.chaptersix;

import java.util.concurrent.*;

public class ThreadPoolsExample {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor=new ThreadPoolExecutor(3,5,1, TimeUnit.MINUTES,new ArrayBlockingQueue<>(3));
        poolExecutor.execute(()->System.out.println("task 1"));
       // Future<Integer> future=poolExecutor.submit(new CallAbleTask());
     //   future.get();
        poolExecutor.shutdown();
    }

    static class CallAbleTask implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return  4;
        }
    }
}
