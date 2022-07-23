package book.chapter14;

public class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("the type of T is " + ob.getClass().getName());
    }

}
