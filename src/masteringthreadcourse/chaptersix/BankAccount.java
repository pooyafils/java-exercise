package masteringthreadcourse.chaptersix;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;
    private final Lock lock = new ReentrantLock(); // Using ReentrantLock for this example

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        lock.lock(); // Acquire the lock before modifying balance
        try {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        } finally {
            lock.unlock(); // Release the lock after modification
        }
    }

    public void withdraw(int amount) {
        lock.lock(); // Acquire the lock before modifying balance
        try {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient funds or invalid withdrawal amount.");
            }
        } finally {
            lock.unlock(); // Release the lock after modification
        }
    }
    public int getBalance() {
        return balance; // Return the current balance
    }
}