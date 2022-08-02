package classwork.lesson27;

public class ThreadDemo {

    public static void main(String[] args) {
        Thread thread = new Thread(new NewThread(), "Demonstration thread");
        thread.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The main thread is finished");

    }
}
