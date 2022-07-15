package classwork.lesson22.ioExamples;

import java.io.*;

public class DataIOStream {
    static final String FILE_PATH = "C:\\Users\\Hovo\\IdeaProjects\\Java Core\\src\\classwork\\lesson22\\testFolder\\hello2.txt";

    public static void main(String[] args) throws IOException {
//        write();
        read();
    }

    public static void write() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(34);
        out.writeBoolean(true);
        out.flush();
        out.close();
    }public static void read() throws IOException {
        DataInputStream input = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(input.readInt());;
        System.out.println(input.readBoolean());;

    }
}
