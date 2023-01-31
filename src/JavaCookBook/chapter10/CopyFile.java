package JavaCookBook.chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFile {
    public static void main(String[] av) {

        Path pathIn=(Path) Paths.get("E:\\java-exercise\\src\\JavaCookBook\\chapter9\\mytext.txt");
        Path pathOut=(Path) Paths.get("E:\\java-exercise\\src\\JavaCookBook\\chapter10\\mytextcopy.txt");

try{
    Files.copy(pathOut,pathIn, StandardCopyOption.REPLACE_EXISTING);
}

catch (IOException e) {

    // Print the line number where exception occurred
    e.printStackTrace();
}
    }
}
