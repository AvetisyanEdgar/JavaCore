package classwork.lesson18;

import java.util.Scanner;

public class ExceptionTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        try {
            int a = Integer.parseInt(number);
            System.out.println(a * 2);
        } catch (NumberFormatException e) {
            System.out.println("Please input only numbers");
        }

        System.out.println("Hello \n" + "Java");

        String email = "poxos.com";
        checkEmail(email);
        System.out.println("end of program");
    }

    static void checkEmail(String email){
        if (!email.contains("@")){
            throw new IllegalArgumentException();
        }
        System.out.println("Sending email...");
    }
}
