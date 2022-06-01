package classwork.lesson11.calculator;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.divide(8, 2));
        System.out.println(calculator.plus(8, 2));
        System.out.println(calculator.minus(8, 2));
        System.out.println(calculator.multiply(8, 2));
    }
}
