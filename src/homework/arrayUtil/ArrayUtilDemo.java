package homework.arrayUtil;

import java.util.Scanner;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        // Array's numbers
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Input 10 elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        // Test
        ArrayUtil arrayUtil = new ArrayUtil();
        System.out.print("Array's elements: ");
        arrayUtil.elements(array);
        System.out.println();
        System.out.print("Array's maximal value is: ");
        System.out.println(arrayUtil.max(array));
        System.out.print("Array's minimal value is: ");
        System.out.println(arrayUtil.min(array));
        System.out.print("Array's odd elements count: ");
        System.out.println(arrayUtil.odds(array));
        System.out.print("Array's even elements count: ");
        System.out.println(arrayUtil.evens(array));
        System.out.print("Array's elements average: ");
        System.out.println(arrayUtil.average(array));
        System.out.print("Array's elements sum: ");
        System.out.println(arrayUtil.sum(array));
    }
}
