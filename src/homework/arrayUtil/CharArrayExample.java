package homework.arrayUtil;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(c + " 's count in array: " + count);
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        char firstMiddle, secondMiddle;
        firstMiddle = chars2[chars2.length / 2];
        secondMiddle = chars2[chars2.length / 2 - 1];
        System.out.println();
        System.out.println("FirstMiddle: " + firstMiddle);
        System.out.println();
        System.out.println("SecondMiddle " + secondMiddle);
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.println(true);
        } else System.out.println(false);
        boolean Bob = false;
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a' };
        for (int i = 0; i < bobArray.length - 2; i++) {
            if (bobArray[i] == bobArray[i + 2]) {
                Bob = true;
            }
        }
        System.out.println();
        // для тогоб чтобы результат выводился один раз объявляем переменную Bob)
        if (Bob) {
            System.out.println("There is a Bob in array");
        } else System.out.println("There is no Bob in array");
        System.out.println();
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ' };
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);
            }
        }
    }
}
