package classwork.lesson20;

import java.util.Scanner;

public class LanguageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Language lang = Language.HY;

        switch (lang) {
            case HY:
                System.out.println("բարև");
                break;
            case RUS:
                System.out.println("привет");
                break;
            case ENG:
                System.out.println("Hello");
                break;
            case CH:
                System.out.println("Nihao");
                break;
        }

        Language.CH.setCountry("China");
        System.out.println("choose the language from the list");
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value + ", ");

        }
        try {
            String langStr = scanner.nextLine();
            if (langStr != null) {
                Language chooseLang = Language.valueOf(langStr.toUpperCase());
                System.out.println("chosen: " + chooseLang);
                System.out.println("country: " + chooseLang.getCountry());
                System.out.println("index: " + chooseLang.ordinal());
            }
        }catch(IllegalArgumentException e){
            System.out.println("choose the element from the list!");
        }
    }
}
