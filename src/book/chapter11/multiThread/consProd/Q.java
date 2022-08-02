package book.chapter11.multiThread.consProd;

public class Q {
    int n;

    synchronized int get() {
        System.out.println("get: " + n);
        return n;
    }

    synchronized void put(int n) {
        this.n = n;
        System.out.println("sent: " + n);
    }
}
