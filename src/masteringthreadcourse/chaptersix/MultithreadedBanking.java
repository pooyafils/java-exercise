package masteringthreadcourse.chaptersix;

public class MultithreadedBanking {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(100);

        // Create multiple threads with positive and negative amounts (deposits and withdrawals)
        Thread thread1 = new Thread(new BankTransaction(account, 50));
        Thread thread2 = new Thread(new BankTransaction(account, -20));
        Thread thread3 = new Thread(new BankTransaction(account, 75));
        Thread thread4 = new Thread(new BankTransaction(account, -120)); // Attempt to withdraw more than balance

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}