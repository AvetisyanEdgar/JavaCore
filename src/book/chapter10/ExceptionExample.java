package book.chapter10;

import java.util.Random;

public class ExceptionExample {
    public static void main(String[] args) {
        int a, b, c;
        Random random = new Random();

        for (int i = 0; i < 32000; i++) {

            try {
                c = random.nextInt();
                b = random.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("division by zero");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}
