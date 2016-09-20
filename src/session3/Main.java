package session3;

import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        File fileOne =  new File("a.txt");

        try {
            fileOne.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File fileTwo = new File("b.txt");
        fileOne.renameTo(fileTwo);
        fileTwo.delete();

        File folder = new File("FOLDER");
        folder.mkdirs();
        File fileThree = new File(folder, "f.exe");

        try {
            fileThree.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        fileThree.delete();
        folder.delete();

        File file = new File(".");
        File [] files = file.listFiles();
        for (File file2: files){
            System.out.println(file2);
        }
    }

}
