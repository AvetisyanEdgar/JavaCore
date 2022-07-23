package book.chapter14;

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("The value is " + v);
        System.out.println();
        Gen<String> strOb = new Gen<String>("Generic Test");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
}
