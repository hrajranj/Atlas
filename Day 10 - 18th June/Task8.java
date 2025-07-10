import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter8 {
    private int count = 0;
    private final Lock lock = new ReentrantLock(); // Create the lock

    public void increment() {
        lock.lock(); // Acquire the lock
        try {
            count++; // Critical section
        } finally {
            lock.unlock(); // Ensure the lock is released
        }
    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo8 extends Thread {
    Counter8 counter;

    ThreadDemo8(Counter8 counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        Counter8 counter = new Counter8();
        ThreadDemo8 t1 = new ThreadDemo8(counter);
        ThreadDemo8 t2 = new ThreadDemo8(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
