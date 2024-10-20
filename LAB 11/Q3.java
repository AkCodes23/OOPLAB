public class ThreadStatus {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread: " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
        System.out.println("Is thread alive? " + thread.isAlive());

        // Waiting for the thread to complete
        thread.join();
        System.out.println("Thread completed. Is thread alive? " + thread.isAlive());
    }
}
