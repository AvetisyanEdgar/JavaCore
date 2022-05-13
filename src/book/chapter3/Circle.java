package book.chapter3;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double S, pi, r, P;
        pi = 3.1415;
        System.out.println("введите радиус круга");
        r = scanner.nextDouble();
        S = pi * r * r;
        System.out.println("Площадь круга равна " + S);
        P = 2 * pi * r;
        System.out.println("Периметр круга равен " + P);

    }

}
