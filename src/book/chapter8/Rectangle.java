package book.chapter8;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("В области четырёхугольника.");
        return dim1 * dim2;
    }
}
