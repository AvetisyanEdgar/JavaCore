package book.chapter3;

import java.util.Scanner;

public class Light {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lightspeed = 186000;
        System.out.println("введите количество дней");
        long days = scanner.nextLong();
        long seconds = days * 24 * 60 * 60;
        long distance = seconds * lightspeed;
        System.out.println("За " + days + " дней луч света пройдет " + distance + " миль");
        System.out.println("на это потребуется " + seconds + " секунд");


    }
}
