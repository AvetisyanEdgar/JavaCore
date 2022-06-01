package book.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.depth = 20;
        myBox.height = 15;
        myBox.width = 25;
        System.out.println(myBox.volume());
    }
}
