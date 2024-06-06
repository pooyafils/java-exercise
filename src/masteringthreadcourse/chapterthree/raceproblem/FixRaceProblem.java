package masteringthreadcourse.chapterthree.raceproblem;

public class FixRaceProblem {
        private static int counter = 0;

        public static void main(String[] args) {
            Thread thread1 = new Thread(() -> {
                synchronized (Main.class) {
                    for (int i = 0; i < 1000; i++) {
                        counter++;
                    }
                }
            });

            Thread thread2 = new Thread(() -> {
                synchronized (Main.class) {
                    for (int i = 0; i < 1000; i++) {
                        counter++;
                    }
                }
            });

            thread1.start();
            thread2.start();

            // Wait for threads to finish
            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Counter: " + counter);
        }
    }

