package java9recipes.chapter8.MovingFile;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class MovingFile {
    public static void main(String[] args) {
        FileSystem fileSystem = FileSystems.getDefault();
        Path sourcePath = fileSystem.getPath("file.log");
        Path targetPath = fileSystem.getPath("file2.log");
        System.out.println("Copy from "+sourcePath.toAbsolutePath().toString()+
                " to "+targetPath.toAbsolutePath().toString());
        try {
            Files.move(sourcePath,targetPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
