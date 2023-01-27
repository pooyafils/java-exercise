package IoFaradarsCourse;

import java.io.FileReader;

public class FileReaders {

    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("C:\\Users\\User\\Desktop\\New folder\\io\\src\\fara.txt");
       int data=fileReader.read();
       while (data!=-1){
           System.out.print((char) data);
            data=fileReader.read();

       }
       fileReader.close();
        }
        catch (Exception e){

        }
    }
    }
