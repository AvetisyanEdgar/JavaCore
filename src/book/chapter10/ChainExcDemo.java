package book.chapter10;

public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("верхний уровень");
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e){
            System.out.println("An Exception has been caught: " + e);
            System.out.println("The cause: " + e.getCause());
        }
    }
}
