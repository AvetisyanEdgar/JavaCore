package book.chapter11.multiThread;

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("One");
        new NewThread("Two");
        new NewThread("Three");

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            System.out.println("Main thread has been interrupted");
        }
        System.out.println("Main thread is finished");
    }
}
