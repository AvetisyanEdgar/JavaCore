package homework.arrayUtil;


public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};

        int startindex = 0;
        int endindex = 0;

        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[i] != ' ') {
                startindex = i;
                break;
            }
        }
        for (int i = spaceArray.length - 1; i > 0; i--) {
            if (spaceArray[i] != ' ') {
                endindex = i;
                break;
            }
        }
        char[] spaceArray2 = new char[endindex - startindex + 1];
        for (int i = 0; i < endindex; i++) {

            spaceArray2[i] = spaceArray[startindex];
            startindex++;
        }
        for (char c : spaceArray2) {
            System.out.print(c);
        }
    }
}
