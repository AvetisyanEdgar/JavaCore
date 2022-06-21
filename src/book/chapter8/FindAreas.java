package book.chapter8;

public class FindAreas {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figRef; // An object will not be created, so it doesn't make sense
        figRef = r;
        System.out.println(figRef.area());
        figRef = t;
        System.out.println(figRef.area());

    }
}
