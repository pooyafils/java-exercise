package IoFaradarsCourse;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DataInput {

    public static void main(String[] args) {
try{
    InputStream input=new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
    DataInputStream dis=new DataInputStream(input);
    int count=input.available();
    byte [] array=new byte[count];
    dis.read(array);
    for(byte bt :array){
        char chr=(char) bt;
        System.out.print(chr);
    }
}
catch (Exception e){

}
    }
    }
