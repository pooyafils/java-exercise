package masteringthreadcourse.chaptersix;

public class BankTransaction implements Runnable {
    private BankAccount account;
    private int amount;

    public BankTransaction(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (amount > 0) {
            account.deposit(amount);
        } else {
            account.withdraw(-amount); // Convert negative amount to positive for withdrawal
        }
    }
}
