package book.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("The volume of plainBox equals to " + vol);
    }
}
