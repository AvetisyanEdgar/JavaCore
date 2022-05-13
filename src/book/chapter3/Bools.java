package book.chapter3;

public class Bools {
    public static void main(String[] args) {
        boolean b;
        int x, y;
        x = 20;
        y = 10;
        b = (x > y);
        if (b) {
            System.out.println("x is bigger than y");
            y += 20;
        } b = (x>y);
        if (!b) {
            System.out.println("X is not bigger than Y");
        }
    }
}
