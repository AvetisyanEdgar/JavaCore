package book.chapter10;

public class ThrowDemo {

    static void demoproc() {
        try {
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e){
            System.out.println("Exception has been intercepted in demoproc() method's body");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e){
            System.out.println("again Interception: " + e);
        }
    }

}
