package book.chapter12;

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple ap, ap2, ap3;
        //порядковые значения с помощью метода ordinal()
        System.out.println("все константы сортов яблок с их порядковыми значениями");
        for (Apple value : Apple.values()) {
            System.out.println(value + " " + value.ordinal());
        }
        ap = Apple.RedDel;
        ap2 = Apple.GoldenDel;
        ap3 = Apple.RedDel;
        System.out.println();
        // демонстрация методов compareTo() и equals()
        if (ap.compareTo(ap2) < 0){
            System.out.println(ap + " предшествует " + ap2);
        }if (ap.compareTo(ap2) > 0){
            System.out.println(ap2 + " предшествует " + ap);
        }
        if (ap.compareTo(ap3) == 0) {
            System.out.println(ap + " равно " + ap3);
        }
        System.out.println();
        if (ap.equals(ap2)){
            System.out.println("ОШИБКА!");
        }
        if (ap.equals(ap3)){
            System.out.println(ap + " равно " + ap3);
        }
        if (ap == ap3){
            System.out.println(ap + " == " + ap3);
        }
    }
}
