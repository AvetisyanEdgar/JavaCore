package book.chapter8.abstractionExample;

public class B extends A{
    // an abstract method became concrete in subclass
    // by adding a logic in it
    void callMe(){
        System.out.println("I was called from the subclass B!");
    }
}
