package book.chapter7;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(5);
        System.out.println(myBox.volume());
        Box myBox2 = new Box(3,5,4);
        System.out.println(myBox2.volume());
        Box myBox3 = new Box();
        System.out.println(myBox3.volume());
        Box myClone = new Box(myBox);
        System.out.println(myClone.volume());
    }
}
