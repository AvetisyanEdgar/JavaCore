package book.chapter11.threadByRunnable;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demonstration Thread");
        System.out.println("Child thread is created");
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread has been interrupted");
        }
        System.out.println("Child thread is finished");
    }
}
