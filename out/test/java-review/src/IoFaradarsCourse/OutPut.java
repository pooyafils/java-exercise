package IoFaradarsCourse;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class OutPut {
    public static void main(String args[]) {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\writefaradars.txt");
            DataOutputStream dataOutputStream=new DataOutputStream(fileOutputStream);
            dataOutputStream.write(70);
            dataOutputStream.flush();
            dataOutputStream.close();
            System.out.println("done");
        }

        catch (Exception e){

        }


    }
}
