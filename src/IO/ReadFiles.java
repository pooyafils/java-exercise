package IO;

import java.io.File;

public class ReadFiles {
    public static void main(String[] args) {


        File folder = new File("");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
