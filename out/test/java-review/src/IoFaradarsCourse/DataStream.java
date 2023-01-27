package IoFaradarsCourse;

import java.io.FileInputStream;

public class DataStream {
    public static void main(String[] args){

        try{
            FileInputStream fins=new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
            int i=0;
            while ((i=fins.read())!=-1){
                System.out.print((char)i);
            }


        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}
