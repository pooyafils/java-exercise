package IoFaradarsCourse.MyIoReview;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferwsOutPutStream {
    public static void main(String args[])   {

        try {
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\User\\Desktop\\my-java-exercises\\src\\IoFaradarsCourse\\writefaradars.txt");
            BufferedOutputStream bufferwsOutPutStream=new BufferedOutputStream(fileOutputStream);
            String s="salam";
            byte b[]=s.getBytes();
            bufferwsOutPutStream.write(b);
            bufferwsOutPutStream.flush();
            bufferwsOutPutStream.close();;
            fileOutputStream.close();
            System.out.println("its done");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    }
