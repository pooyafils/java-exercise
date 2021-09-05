package IO;

/**
 * pooya mahmoodi 9/24/2020
 **/
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IoReader {
    private static Scanner input;
    public static void main(String [] args){
        openFile();
        readFile();
        closeFile();

    }
    public static  void openFile(){
        try{
            input =new Scanner(Paths.get("C:\\Users\\User\\Desktop\\New folder\\java-exercise\\src\\IO\\clients.txt"));
        } catch (IOException e) {
            System.out.println("error open file");
            System.exit(1);
        }
    }
    public static void readFile(){
        System.out.printf("%-10s%-12s%-12s%10s%n","account","First Name","Last Name","Blance");
        try {
            while (input.hasNext()){
                System.out.printf("%-10d%-12s%-12s%10.2f%n",input.nextInt(),input.next(),input.next(),input.nextDouble());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed . terminating");
        }
    }
    public static void  closeFile(){
        if(input !=null)
            input.close();
    }
}