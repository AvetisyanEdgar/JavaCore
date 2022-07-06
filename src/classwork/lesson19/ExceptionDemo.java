package classwork.lesson19;

public class ExceptionDemo {
    public static void main(String[] args) throws NoWhiteSpaceException {
        try {
            printWithoutWhiteSpace("");
        }catch (NullPointerException | IllegalArgumentException | NoWhiteSpaceException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("after method call");
    }

    static void printWithoutWhiteSpace(String value) throws NoWhiteSpaceException {
        if (value == null) {
            throw new NullPointerException("Value is null");
        }
        if (value.equals("")) {
            throw new IllegalArgumentException("Value can't be empty");
        }
        if (!value.contains(" ")) {
            throw new NoWhiteSpaceException("No white space");
        }
        System.out.println(value.trim());

    }
}