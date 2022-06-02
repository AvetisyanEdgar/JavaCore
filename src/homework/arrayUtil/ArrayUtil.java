package homework.arrayUtil;

public class ArrayUtil {

    public void elements(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int odds(int[] array) {
        int oddsCount = 0;
        for (int i : array) {
            if (i % 2 == 1) {
                oddsCount++;
            }
        }
        return oddsCount;
    }

    public int evens(int[] array) {
        int evensCount = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                evensCount++;
            }
        }
        return evensCount;
    }

    public double average(int[] array) {
        double average = 0;
        for (int j : array) {
            average += j;
        }
        return average = average / array.length;
    }
    public int sum(int[] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}
