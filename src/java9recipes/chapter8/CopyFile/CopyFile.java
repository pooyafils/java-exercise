package java9recipes.chapter8.CopyFile;

import java.io.IOException;
import java.nio.file.*;

public class CopyFile {
    public static void main(String[] args) {
        FileSystem fileSystem= FileSystems.getDefault();
        Path sourcePath = fileSystem.getPath("address");
        Path targetPath = fileSystem.getPath("address");
        System.out.println("Copy from "+sourcePath.toAbsolutePath().toString()+
                " to "+targetPath.toAbsolutePath().toString());
        try{
            Files.copy(sourcePath,targetPath, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
