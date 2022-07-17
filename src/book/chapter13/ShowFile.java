package book.chapter13;

import java.io.*;
public class ShowFile {
    static String fileName = "C:\\Users\\Hovo\\IdeaProjects\\Java Core\\src\\book\\chapter13\\TestFile.txt";
    public static void main(String[] args) throws IOException {
        int i;
        if (args.length != 1) {
            System.out.println("Usage: ShowFile " + fileName);
            return;
        }
        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if (i != -1) {
                    System.out.println((char) i);
                }
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Input/output error");
        }
    }
}