package book.chapter7;

public class CallByValue {
    public static void main(String[] args) {
        AnotherTest ob = new AnotherTest(15,20);

        System.out.println("before method " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("after method " + ob.a + " " + ob.b);
    }
}
