
package IoFaradarsCourse;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferWriters {
    public static void main(String args[]) {
try{
    FileWriter fileWriter=new FileWriter("C:\\Users\\User\\Desktop\\New folder\\io\\src\\writefaradars.txt");
    BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
    String s="java is goof";
    bufferedWriter.write(s);
    bufferedWriter.close();
    System.out.println("done");
}


catch (Exception e){
    e.printStackTrace();
}
    }
    }
