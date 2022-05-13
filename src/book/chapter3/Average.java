package book.chapter3;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average = average + array[i];

        }
        System.out.println("An average of array's numbers is equal to " + average / 5);
    }

}
