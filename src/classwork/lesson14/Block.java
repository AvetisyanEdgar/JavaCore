package classwork.lesson14;

public class Block {

    public int a;

    {
        if (20 > 15) {
            a = 40;
        } else {
            a = 30;
        }

    }

    static {
        System.out.println("From static block");
    }
     {
        System.exit(0);
    }
    public Block() {
        System.out.println(a);
    }
}
