package book.chapter10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessError {
        System.out.println("In throwOne()'s body");
        throw new IllegalAccessError("Demonstration");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessError e) {
            System.out.println("Exception has been caught: " + e);
        }
    }
}
