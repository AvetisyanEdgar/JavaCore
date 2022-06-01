package homework.arrayUtil;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {76, 55, 5, -9, -140, 12, 4, 65};
        int temp;
        // աճման կարգով
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
        for (int number : numbers) {
            System.out.print(number + " ");

        }
        System.out.println();
        //նվազման կարգով
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }

        }
        for (int number : numbers) {
            System.out.print(number + " ");

        }


    }
}
