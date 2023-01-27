package IoFaradarsCourse;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutPut {

    public static void main(String args[]) {
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\writefaradars.txt");
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
            byteArrayOutputStream.write(65);
            byteArrayOutputStream.writeTo(fileOutputStream);
            byteArrayOutputStream.flush();
            System.out.println("done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }
