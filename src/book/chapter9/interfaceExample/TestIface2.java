package book.chapter9.interfaceExample;

public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Clients();
        AnotherClient ob = new AnotherClient();

        c.callback(42);
        c = ob;
        c.callback(42);
    }
}
