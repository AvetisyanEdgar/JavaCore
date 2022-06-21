package classwork.lesson15;

public class B extends A {
    int k;
    B(int y){
        super(y);
    }
    B(){
        super(8);
    }
    void methB() {
        System.out.println("I'm from class B");
    }

    void sum() {
        System.out.println(k + x);
    }
}


