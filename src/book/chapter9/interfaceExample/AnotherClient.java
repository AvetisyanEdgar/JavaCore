package book.chapter9.interfaceExample;

public class AnotherClient implements Callback{
    public void callback(int p){
        System.out.println("ещё один вариант реализации callback()");
        System.out.println("p в квадрате равно " + (p*p));
    }
}
