package JavaConcurrencyMultithreading.Deadlock;

public class ResolvedDeadlock {
    public static void main(String[] args) {
        // Two resources
        ResourceA resourceA = new ResourceA();
        ResourceB resourceB = new ResourceB();

        Thread thread1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1 acquired resource A");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourceB) {
                    System.out.println("Thread 1 acquired resource B");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 2 acquired resource A");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourceB) {
                    System.out.println("Thread 2 acquired resource B");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    static class ResourceA {}
    static class ResourceB {}
}
