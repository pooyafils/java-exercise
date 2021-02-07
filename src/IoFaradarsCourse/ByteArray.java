package IoFaradarsCourse;

import java.io.ByteArrayInputStream;

public class ByteArray {
    public static void main(String[] args)   {
        byte[] bas={62,32,65,80};

        ByteArrayInputStream eais=new ByteArrayInputStream(bas);
        int k=0;
        while ((k=eais.read())!=-1){
            char ch=(char)k;
            System.out.println("value is "+k+ " character is "+ch);
        }

    }
}
