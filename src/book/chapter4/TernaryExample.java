package book.chapter4;

public class TernaryExample {
    public static void main(String[] args) {
        int i, k;
        i = 10;
        k = i < 0 ? -i : i;
        System.out.print("absolute of ");
        System.out.println(i + " equals " + k);
        i = - 10;
        k = i < 0 ? -i : i;
        System.out.print("absolute of ");
        System.out.print(i + " equals " + k);
    }
}
