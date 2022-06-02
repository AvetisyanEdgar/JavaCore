package homework.practiceHomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        int[] array1 = new int[120];
        int[] array2 = new int[12];
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(100));
        System.out.println(ph.calcAge(15));
        System.out.println(ph.isSameNum(10, 10));
        System.out.println(ph.maxLength(array1, array2));
        System.out.println(ph.reverseBool(true));
        System.out.println(ph.lessOrEqualToZero(20));
        System.out.println(ph.nextNumber(15));
    }
}
