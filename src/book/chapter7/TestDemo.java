package book.chapter7;

public class TestDemo {
    public static void main(String[] args) {

        Test ob1 = new Test(100, 20);
        Test ob2 = new Test(100, 20);
        Test ob3 = new Test(50, 40);
        System.out.println(ob1.equalTo(ob2));
        System.out.println(ob2.equalTo(ob3));
    }
}
