package book.chapter9.interfaceExample;

class TestIface{
    public static void main(String[] args) {
        Callback c = new Clients();
        c.callback(42);
    }
}
