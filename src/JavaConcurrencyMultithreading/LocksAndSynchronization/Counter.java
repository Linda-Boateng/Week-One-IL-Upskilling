package JavaConcurrencyMultithreading.LocksAndSynchronization;

public class Counter {
    private int count;

    public Counter() {
        count = 0;
    }

    public synchronized void increment() {
        // Synchronized block ensures thread safety
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
