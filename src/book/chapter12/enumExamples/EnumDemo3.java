package book.chapter12.enumExamples;

public class EnumDemo3 {
    public static void main(String[] args) {
        System.out.println("Winesap costs " + Apple.Winesap.getPrice());
        System.out.println("All apples prices:");
        for (Apple a : Apple.values()) {
            System.out.println(a + " costs " + a.getPrice() + " cents");

        }
    }
}
