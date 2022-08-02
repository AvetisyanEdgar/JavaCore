package book.chapter11.threadByThreadClass;

public class NewThread extends Thread {

    NewThread() {
        super("Demonstration thread");
        System.out.println("Child thread: " + this);
        start();
    }

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
