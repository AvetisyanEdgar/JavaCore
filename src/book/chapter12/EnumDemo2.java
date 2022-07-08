package book.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {

        Apple ap;
        System.out.println("Constants of enum");
/*      can be written like this
        Apple[] allApples = Apple.values();
        for (Apple a : allApples) {
            System.out.println(a);
        }
*/
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }
        System.out.println();
        ap = Apple.valueOf("Winesap");
        System.out.println("enum has an element " + ap);
    }
}
