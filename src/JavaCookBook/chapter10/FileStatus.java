package JavaCookBook.chapter10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileTime;

public class FileStatus {
    public static void main(String[] argv) throws IOException {
// Ensure that a filename (or something) was given in argv[0]
        String s="E:\\java-exercise\\src\\JavaCookBook\\chapter9\\mytext.txt";

        argv="E\\java-exercise\\src\\JavaCookBook\\chapter9\\mytext.txt".split("");


        if (argv.length == 0) {
            System.err.println("Usage: FileStatus filename");
            System.exit(1);
        }
        for (String a : argv) {
            status(a);
        }
    }


    public static void status(String fileName) throws IOException {
        System.out.println("---" + fileName + "---");
// Construct a Path object for the given file.
        Path p = Path.of(fileName);
// See if it actually exists
        if (!Files.exists(p)) {
            System.out.println("file not found");
            System.out.println(); // Blank line
            return;
        }
// Print full name
        System.out.println("Canonical name " + p.normalize());
// Print parent directory if possible
        Path parent = p.getParent();
        if (parent != null) {
            System.out.println("Parent directory: " + parent);
        }
// Check if the file is readable
        if (Files.isReadable(p)) {
            System.out.println(fileName + " is readable.");
        }
// Check if the file is writable
        if (Files.isWritable(p)) {
            System.out.println(fileName + " is writable.");
        }
// See if file, directory, or other. If file, print size.
        if (Files.isRegularFile(p)) {
// Report on the file's size and possibly its type
            System.out.printf("File size is %d bytes, content type %s\n",
                    Files.size(p),
                    Files.probeContentType(p));
        } else if (Files.isDirectory(p)) {
            System.out.println("It's a directory");
        } else {
            System.out.println("I dunno! Neither a file nor a directory!");
        }
// Report on the modification time.
        final FileTime d = Files.getLastModifiedTime(p);
        System.out.println("Last modified " + d);
        System.out.println(); // blank line between entries
    }
}