package JavaConcurrencyMultithreading.LocksAndSynchronization;
/*
implemented synchronization to ensure
thread safety by locking critical section of the counter method

 */
public class ExampleUsage {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create and start multiple threads to increment the counter concurrently
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new IncrementThread(counter);
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                throw new InterruptedException();

            }
        }
        // Print the final count
        System.out.println("Final Count: " + counter.getCount());
    }
}

class IncrementThread extends Thread {
    private final Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
