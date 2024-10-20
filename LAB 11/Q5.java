class SharedCounter {
    private int count = 0;

    // Synchronized method to increment the count
    public synchronized void incrementWithMethod() {
        count++;
    }

    // Method using synchronized block to increment the count
    public void incrementWithBlock() {
        synchronized (this) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}

public class SynchronizedThreadsDemo {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter counter = new SharedCounter();

        // Thread using the synchronized method
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementWithMethod();
            }
        });

        // Thread using the synchronized block
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementWithBlock();
            }
        });

        t1.start();
        t2.start();

        // Wait for both threads to finish
        t1.join();
        t2.join();

        // Display final count
        System.out.println("Final Count: " + counter.getCount());
    }
}
