import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock lock;
    
    public double getBalance() {
        return balance;
    }
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.lock = new ReentrantLock();
    }

    public void deposit(double amount) throws InterruptedException {
        lock.tryLock(1000, TimeUnit.MILLISECONDS);
        try {
            balance += amount;
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) throws InterruptedException {
        lock.tryLock(1000, TimeUnit.MILLISECONDS);
        try {
            balance -= amount;
        } finally {
            lock.unlock();
        }
    }

}
