package classwork.lesson14;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "Poxos";
        String name1 = scanner.nextLine();
        boolean result = name.equals(name1);
        System.out.println(result);

    }
}
