// Thread by implementing Runnable interface
class RunnableThread implements Runnable {
    public void run() {
        System.out.println("Thread from Runnable interface is running.");
    }
}

// Thread by extending Thread class
class ExtendedThread extends Thread {
    public void run() {
        System.out.println("Thread from Thread class is running.");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        // Using Runnable interface
        RunnableThread runnableObj = new RunnableThread();
        Thread thread1 = new Thread(runnableObj);
        thread1.start();

        // Using Thread class extension
        ExtendedThread thread2 = new ExtendedThread();
        thread2.start();
    }
}
