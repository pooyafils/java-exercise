package IO;

import javax.sound.midi.Patch;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * pooya mahmoodi 9/16/2020
 **/
public class FileDirectory {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the directory");
        Path patch= Paths.get(input.nextLine());
        if(Files.exists(patch)){
            System.out.printf("%n%s exits%n",patch.getFileName());
            System.out.printf("%s a directory %n", Files.isDirectory(patch)? "Is":"Is not");
            System.out.printf("Last Modify :%s%n",Files.getLastModifiedTime(patch));
            System.out.printf("Size %s%n",Files.size(patch));
            System.out.printf("Path%s%n",patch);
            System.out.printf("Abslute path %s%n",patch.toAbsolutePath());
            if(Files.isDirectory(patch)){
                System.out.printf("%n directory contains %n");
                DirectoryStream<Path> directoryStream=
                        Files.newDirectoryStream(patch);
                for(Path p :directoryStream){
                    System.out.println(p);
                }
            }
        }




        else {
            System.out.printf("%s dose not exit %n",patch);
        }
    }
}
