package homework.practiceHomework;

public class PracticeHomework {
    public long convert(int minutes){
        return minutes * 60;
    }
    int calcAge(int years){
        return years * 365;
    }
    int nextNumber(int number){
        return ++number;
    }
    boolean isSameNum(int a, int b){
        return (a == b);
    }
    boolean lessOrEqualToZero(int number){
        return (number <= 0);
    }
    boolean reverseBool(boolean bool){
        return !bool;
    }
    int maxLength(int[] array1, int[] array2){
        int length;
       length = array1.length > array2.length ? array1.length : array2.length;
       return length;
    }
}
