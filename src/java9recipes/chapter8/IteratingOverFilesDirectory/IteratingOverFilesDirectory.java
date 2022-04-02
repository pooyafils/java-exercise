package java9recipes.chapter8.IteratingOverFilesDirectory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class IteratingOverFilesDirectory {
    private void start() {
        FileVisitor<Path> myFileVisitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println("Visited File: "+file.toString());
                return FileVisitResult.CONTINUE;
            }
        };

        FileSystem fileSystem = FileSystems.getDefault();
        Path directory= fileSystem.getPath(".");
        try {
            Files.walkFileTree(directory, myFileVisitor);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main (String args[]) {
        IteratingOverFilesDirectory   traverseDirectory = new IteratingOverFilesDirectory();
        traverseDirectory.start();
    }
}
