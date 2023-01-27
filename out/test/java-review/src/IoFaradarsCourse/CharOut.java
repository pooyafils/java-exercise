package IoFaradarsCourse;

import java.io.FileOutputStream;

public class CharOut {


    public static void main(String args[]){

        try{
            FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\writefaradars.txt");
           String s="fara darjtjht6jhtjtjtjhyhjtyjtyjtyjhtts";
           byte b[]=s.getBytes();
            fileOutputStream.write(b);
            fileOutputStream.close();
            System.out.println("write is done");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }


}
