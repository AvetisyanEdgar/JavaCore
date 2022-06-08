package homework.braceChecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {

        BraceChecker bc = new BraceChecker("(Hello) {(]}from ) Java");
        bc.check();
    }
}
