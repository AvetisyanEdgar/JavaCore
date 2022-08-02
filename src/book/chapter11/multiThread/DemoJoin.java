package book.chapter11.multiThread;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");
        NewThread ob3 = new NewThread("Three");
        System.out.println("Thread \"One\" is running: " + ob1.t.isAlive());
        System.out.println("Thread \"Two\" is running: " + ob2.t.isAlive());
        System.out.println("Thread \"Three\" is running: " + ob3.t.isAlive());

        try {
            System.out.println("Waiting for threads to end");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread has benn interrupted");
        }
        System.out.println("Thread \"One\" is running: " + ob1.t.isAlive());
        System.out.println("Thread \"Two\" is running: " + ob2.t.isAlive());
        System.out.println("Thread \"Three\" is running: " + ob3.t.isAlive());
    }
}
