package book.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Input text lines");
        System.out.println("Input 'stop' to stop the program");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("stop")){
                break;
            }
        }
        System.out.println("Your text file contains: ");
        for (int i = 0; i < 100; i++) {
            System.out.println(str[i]);
            if (str[i].equals("stop")){
                break;
            }
        }
    }
}
