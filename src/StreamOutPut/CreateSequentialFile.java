package StreamOutPut;


import javax.sound.midi.Patch;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * pooya mahmoodi 9/24/2020
 **/
public class CreateSequentialFile {
    private static ObjectOutputStream objectOutputStream;
    public static void main(String[] args){
OpenFile();
addRecords();
closeFile();
    }
    public static void OpenFile(){
        try{
            objectOutputStream=new ObjectOutputStream(Files.newOutputStream
                    (Paths.get("C:\\Users\\pooya\\Downloads\\my-java-exercises\\src\\StreamOutPut\\clients.txt")));
        }
        catch (IOException ioException){
            System.out.println("erro opening file");
            System.exit(-1);
        }
    }
    public static void addRecords(){
        Scanner input=new Scanner(System.in);
        System.out.printf("%s%n%s%n? ",
                "Enter account number, first name, last name and balance.",
                "Enter end-of-file indicator to end input.");

        while (input.hasNext()){
            try{
                Account record=new Account(input.nextInt(),input.next(),input.next(),input.nextDouble());
                objectOutputStream.writeObject(record);
            }
            catch (NoSuchElementException elementException)
            {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }
            catch (IOException ioException)
            {
                System.err.println("Error writing to file. Terminating.");
                break;
            }

            System.out.print("? ");

        }
    }
    public static void closeFile()
    {
        try
        {
            if (objectOutputStream != null)
                objectOutputStream.close();
        }
        catch (IOException ioException)
        {
            System.err.println("Error closing file. Terminating.");
        }
    }
}
