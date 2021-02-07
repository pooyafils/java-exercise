package StreamOutPut;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * pooya mahmoodi 9/24/2020
 **/
public class ReadDequentialFile {
    private static ObjectInputStream objectInputStream;
    public static void main(String[] args){
        OpenFile();
        readRecords();
        closeFile();

    }
    public static void OpenFile(){
        try{
            objectInputStream=new ObjectInputStream(Files.newInputStream(Paths.get("C:\\Users\\pooya\\Downloads\\my-java-exercises\\src\\StreamOutPut\\clients.txt")));
        }
        catch (IOException ioException)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }
    }
public static void readRecords(){
    System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
            "First Name", "Last Name", "Balance");
    try{
        while (true){
            Account record=(Account) objectInputStream.readObject();
            System.out.printf("%-10d%-12s%-12s%10.2f%n",
                    record.getAccount(), record.getFirstName(),
                    record.getLastName(), record.getBalance());
        }
    }
    catch (EOFException endOfFileException)
    {
        System.out.printf("%nNo more records%n");
    }
    catch (ClassNotFoundException classNotFoundException)
    {
        System.err.println("Invalid object type. Terminating.");
    }
    catch (IOException ioException)
    {
        System.err.println("Error reading from file. Terminating.");
    }
}
public static void closeFile(){
        try{
            if(objectInputStream!= null)
                objectInputStream.close();
        }
        catch (IOException ioException)
        {
            System.err.println("Error closing file. Terminating.");
            System.exit(1);
        }
}
}
