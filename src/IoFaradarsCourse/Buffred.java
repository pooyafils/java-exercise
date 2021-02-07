package IoFaradarsCourse;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffred {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
            BufferedReader bfi=new BufferedReader(fileReader);
            int data;
            while ((data=bfi.read())!=-1){
                System.out.print((char) data);

            }
            bfi.close();
            fileReader.close();
        }
        catch (Exception e){

        }
    }




}
