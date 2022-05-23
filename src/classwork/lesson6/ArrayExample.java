package classwork.lesson6;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = new int[7];//Garbage Collector-ը տարավ
        array = new int[1000];
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}