package book.chapter10;

public class ExceptionDemo {
    static void compute(int a) throws MyException {
        System.out.println("Method compute(" + a + ") has been called");
        if(a > 10){
            throw new MyException(a);
        }
        System.out.println("Normal ending");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        } catch (MyException e){
            System.out.println("Exception has been taken: " + e);
        }
    }
}
