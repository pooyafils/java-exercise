package IoFaradarsCourse;

import java.io.FileWriter;

public class FileWriters {

    public static void main(String args[]) {

        try{
            FileWriter fileWriter=new FileWriter("C:\\Users\\User\\Desktop\\New folder\\io\\src\\writefaradars.txt");
            String s="pooya";
            fileWriter.write(s);
            fileWriter.close();
            System.out.println("done");

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    }
