public class ThreadPriority {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                System.out.println("Thread with priority: " + Thread.currentThread().getPriority());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        });

        t1.setPriority(Thread.MAX_PRIORITY); // Setting highest priority
        t1.start();

        // Interrupting the thread to demonstrate InterruptedException
        t1.interrupt();
    }
}
