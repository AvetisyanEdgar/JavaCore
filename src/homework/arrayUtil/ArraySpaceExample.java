package homework.arrayUtil;


public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                startIndex = i;
                break;
            }
        }
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] != ' ') {
                endIndex = i;
                break;
            }
        }
        char[] spaceArray2 = new char[endIndex - startIndex + 1];
        for (int i = 0; i < endIndex; i++) {
            spaceArray2[i] = spaceArray[startIndex];
            startIndex++;
        }
        for (char c : spaceArray2) {
            System.out.print(c);
        }
    }
}
