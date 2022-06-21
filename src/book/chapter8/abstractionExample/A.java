package book.chapter8.abstractionExample;

public abstract class A {
    //We use an abstract class to write a different
    // logics in every subclass (sample of methods)
    abstract void callMe();

    void callMeToo() {
        System.out.println("Was called from class A. " +
                "It's a concrete method!");
    }
}
