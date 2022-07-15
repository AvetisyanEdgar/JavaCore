package classwork.lesson22;

import java.io.File;
import java.io.IOException;

public class FileExample {
    static String Filepath = "C:\\Users\\Hovo\\IdeaProjects\\Java Core\\src\\classwork\\lesson22\\testFolder\\hello2.txt";
    public static void main(String[] args) throws IOException {
        File myFile = new File(Filepath);
        System.out.println(myFile.exists());
        if (!myFile.exists()){
            myFile.createNewFile();
            System.out.println(myFile.exists());
        }
        System.out.println("is file: " + myFile.isFile());
        System.out.println("is directory: " + myFile.isDirectory());
        System.out.println(myFile);
    }
}
