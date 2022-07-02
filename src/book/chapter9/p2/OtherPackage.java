package book.chapter9.p2;

import book.chapter9.p1.Protection;

public class OtherPackage {
    OtherPackage(){
        book.chapter9.p1.Protection p = new Protection();
        System.out.println("конструктор из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
        //к отсальным нету доступа
    }
}
