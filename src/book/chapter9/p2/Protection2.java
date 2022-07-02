package book.chapter9.p2;

public class Protection2 extends book.chapter9.p1.Protection {
    Protection2() {
        System.out.println("конструктор унаследованный из другого пакета");
        System.out.println("n_pro = " + n_pro);
//        System.out.println("n = " + n);
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pub = " + n_pub);
    }
}
