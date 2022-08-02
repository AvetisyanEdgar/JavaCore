package classwork.lesson27;

public class NewThread implements Runnable {

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Child thread is finished");
        
    }
}
