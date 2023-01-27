package IoFaradarsCourse;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferInput {
    public static void main(String[] args) {
        try{
            FileInputStream fins=new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
            BufferedInputStream bis=new BufferedInputStream(fins);
            int i=0;
            while ((i=bis.read())!=-1){
                System.out.print((char) i);
            }
            bis.close();
            fins.close();
            }

        catch (Exception e){
            System.out.println(e);
        }

    }
}
