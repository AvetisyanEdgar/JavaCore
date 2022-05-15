package homework.arrayUtil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {4, 9, 3, 75, 1, 65, 7, 2, 10, 6};
        System.out.println("array's elements: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("array's biggest element is: ");
        int biggest = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (biggest < array[i + 1]) {
                biggest = array[i + 1];
            }
        }
        System.out.println(biggest);

        int smallest = array[0];
        System.out.println("array's smallest element is: ");
        for (int i = 0; i < array.length - 1; i++) {
            if (smallest > array[i + 1]) {
                smallest = array[i + 1];

            }
        }
        System.out.println(smallest);
        int evensCount = 0;
        int oddsCount = 0;
        System.out.println("array's even elements: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                evensCount++;
            } else oddsCount++;

        }
        System.out.println();
        System.out.println("count of even elements in array: ");
        System.out.println(evensCount);
        System.out.println("count of array's odd elements: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("count of arrays odd elements: ");
        System.out.println(oddsCount);
        System.out.println("average of elements in array:");
        float average = 0;
        float sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println(average);
        System.out.println("sum of array's elements: ");
        System.out.println(sum);
    }


}

