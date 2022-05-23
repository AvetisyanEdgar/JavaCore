package classwork.lesson9;

import java.util.Scanner;

public class IfElseExample {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;

        if (month == 12 || month == 1 || month == 2) {
            season = "winter";
        } else if (month == 3 || month == 4 || month == 5) {
            season = "spring";
        } else if (month == 6 || month == 7 || month == 8) {
            season = "summer";
        } else if (month == 9 || month == 10 || month == 11) {
            season = " autumn";
        } else season = "There are 12 months. Input error";
        System.out.println(season);
    }
}
