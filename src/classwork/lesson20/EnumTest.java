package classwork.lesson20;

import java.util.Locale;

public class EnumTest {

    public static void main(String[] args) {
        String genderStr = "female";
        try {
            Gender gender = Gender.valueOf(genderStr.toUpperCase());
        }catch(IllegalArgumentException e){
            System.out.println("Input correct gender");
        }
    }
}
