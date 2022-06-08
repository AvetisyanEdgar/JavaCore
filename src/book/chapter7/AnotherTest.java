package book.chapter7;

public class AnotherTest {
    int a, b;
    AnotherTest(int i, int j){
        a = i;
        b = j;
    }
    void meth(AnotherTest o) {
        o.a *= 2;
        o.b /= 2;
    }
}
