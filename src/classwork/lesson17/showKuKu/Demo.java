package classwork.lesson17.showKuKu;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.printKuKu();
        b.printKuKu();
        printKuKu5times(a);
        printKuKu5times(b);

        ShowKuKu o = new A();
    }
    static void printKuKu5times(ShowKuKu o){
        for (int i = 0; i < 5; i++) {
            o.printKuKu();
        }
    }
}
