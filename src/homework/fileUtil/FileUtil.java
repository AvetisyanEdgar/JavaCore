package homework.fileUtil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        findLines();
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch() {
        System.out.println("Input path");
        String path = scanner.nextLine();
        System.out.println("Input file name");
        String fileName = scanner.nextLine();
        return (path.contains(fileName));
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() throws IOException {
        System.out.println("Input path");
        String path = scanner.nextLine();
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            System.out.println("Input keyword");
            String keyword = scanner.nextLine();
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.getName().endsWith(".txt")) {
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                if (line.contains(keyword)) {
                                    System.out.println(file.getName());
                                }
                            }
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() throws IOException {
        System.out.println("Input path");
        String path = scanner.nextLine();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("Input keyword");
            String keyword = scanner.nextLine();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            int lineCount = 0;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                if (line.contains(keyword)) {
                    System.out.println(lineCount + ". " + line);
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {
        System.out.println("Input path");
        String path = scanner.nextLine();
        File folder = new File(path);
        if (folder.exists() && folder.isDirectory()) {
            File[] files = folder.listFiles();
            int allFilesLength = 0;
            for (File file : files) {
                allFilesLength += file.length();
            }
            System.out.println(allFilesLength);
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() throws IOException {
        System.out.println("Input file's path");
        String path = scanner.nextLine();
        System.out.println("Input file's name");
        String fileName = scanner.nextLine();
        System.out.println("Input the content you want to write in file");
        String content = scanner.nextLine();
        File file = new File(path + File.pathSeparator + fileName);
        if (!file.exists()) {
            file.createNewFile();
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path + File.pathSeparator + fileName))) {
                bufferedWriter.write(content);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
