package book.chapter8;

public class BoxWeightDemo {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.4);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("The volume of myBox equals to " + vol);
        System.out.println("The weight of myBox equals to " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("The volume of myBox2 equals to " + vol);
        System.out.println("The weight of myBox2 equals to " + myBox2.weight);
    }
}

