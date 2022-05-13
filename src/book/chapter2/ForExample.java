package book.chapter2;

public class ForExample {
    public static void main(String[] args) {
        int firstNumber = 45;
        int secondNumber = 25;
        for (int i = 0; i < 45; i++) {
            if (firstNumber > secondNumber) {
                System.out.println("First is bigger");
            } else if (firstNumber == secondNumber) {
                System.out.println("The same number");
            } else {
                System.out.println("The second is bigger than the first one");
            }
            firstNumber--;
            secondNumber++;
        }
    }
}
