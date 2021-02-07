package IoFaradarsCourse;

import java.io.FileInputStream;

public class DataStreamChar {

    public static void main(String[] args){

    try{
        FileInputStream fins=new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
        int i=fins.read();
        System.out.println((char) i);


    }
    catch (Exception e){
        System.out.println(e);
    }



    }
}
