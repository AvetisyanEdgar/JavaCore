package book.chapter11.syncronizedThreads;

public class Caller implements Runnable {
    String msg;
    CallMe target;
    Thread t;

    public Caller(String s, CallMe targ) {
        msg = s;
        target = targ;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }
}
