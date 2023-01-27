package java9recipes.chapter8.XMLExample;

import java9recipes.chapter8.ExternalizableProgramSettings.ExternalizableProgramSettings;
import java9recipes.chapter8.SerializingJavaObjects.ProgramSettings;

import java.awt.*;
import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class XMLExample {
    public static void main(String[] args) {
        XMLExample xmlExample=new XMLExample();
        xmlExample.start();
    }
    private void start() {
        ExternalizableProgramSettings  settings = new ExternalizableProgramSettings (new Point(10,10),new Dimension(300,200), Color.blue, "The title of the application" );
        try {
            FileSystem fileSystem = FileSystems.getDefault();
            try (FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter8\\XMLExample\\example.xml");
                 XMLEncoder encoder = new XMLEncoder(fos)) {
                encoder.setExceptionListener((Exception e) -> {
                    System.out.println("Exception! :"+e.toString());
                });
                encoder.writeObject(settings);
            }
           try (FileInputStream fis = new FileInputStream("settings.xml");
                 XMLDecoder decoder = new XMLDecoder(fis)) {
                ExternalizableProgramSettings decodedSettings = (ExternalizableProgramSettings) decoder.readObject();
                System.out.println("Is same? "+settings.equals(decodedSettings));
            }

            Path file= fileSystem.getPath("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\java9recipes\\chapter8\\XMLExample\\example.xml");
            List<String> xmlLines = Files.readAllLines(file, Charset.defaultCharset());
            xmlLines.stream().forEach((line) -> {
                System.out.println(line);
            });


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

