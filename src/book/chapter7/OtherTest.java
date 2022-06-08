package book.chapter7;

public class OtherTest {
    int a;

    OtherTest(int i){
        a = i;

    }
    OtherTest incrByTen() {
        OtherTest temp = new OtherTest(a + 10);
        return temp;
    }
}
class RetOb {
    public static void main(String[] args) {
        OtherTest ob1 = new OtherTest(2);
        OtherTest ob2;
        ob2 = ob1.incrByTen();
        System.out.println(ob1.a);
        System.out.println(ob2.a);
    }
}
