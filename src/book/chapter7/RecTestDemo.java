package book.chapter7;

public class RecTestDemo {
    public static void main(String[] args) {

        RecTest recTest = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++) {
            recTest.values[i] = i;

        }
        recTest.printArray(5);
    }
}
