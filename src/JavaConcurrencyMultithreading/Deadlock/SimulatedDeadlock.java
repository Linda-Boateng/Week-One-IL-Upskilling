package JavaConcurrencyMultithreading.Deadlock;
/*
Deadlock resolved by making sure that each thread request for resourcesA
before requesting for resourceB. this ensures that one thread acquires it
and the other thread acquires it after the resource is released by the first thread.
 */
public class SimulatedDeadlock {
    public static void main(String[] args) {

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
            synchronized (resourceB) {
                System.out.println("Thread 2 acquired resource B");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resourceA) {
                    System.out.println("Thread 2 acquired resource A");
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    static class ResourceA {}

    static class ResourceB {}
}
